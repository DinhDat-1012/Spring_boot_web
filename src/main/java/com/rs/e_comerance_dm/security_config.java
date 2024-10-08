package com.rs.e_comerance_dm;

import com.rs.e_comerance_dm.service.custom_user_detail_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class security_config{

    @Autowired
    custom_user_detail_service custom_user_detail_service;
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests((auth)->auth.requestMatchers("/*").permitAll()
                        .requestMatchers("/admin/**").hasAnyAuthority("ADMIN").anyRequest().authenticated())
                .formLogin(Login->Login.loginPage("/logon").loginProcessingUrl("/logon")
                        .usernameParameter("userName").passwordParameter("passWord").defaultSuccessUrl("/admin",true)).logout(logout-> logout.logoutUrl("/admin-logout")
                        .logoutSuccessUrl("/logon").permitAll());
        return http.build();
    }
    @Bean
    WebSecurityCustomizer webSecurityCustomizer() {
        return (web)->web.debug(true).ignoring().requestMatchers("/static/**","/Front_end/**","/assets/**","/assets/css/**","/assets/js/**");
    }
}
