package com.rs.e_comerance_dm.service;

import com.rs.e_comerance_dm.Model.customer_user_detail;
import com.rs.e_comerance_dm.Model.user;
import com.rs.e_comerance_dm.Model.user_role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class custom_user_detail_service implements UserDetailsService {
    @Autowired
    private user_service user_service;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user user = user_service.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user not found");
        }else{
            Collection<GrantedAuthority> authorities = new HashSet<>();
            Set<user_role> roles = user.getUserRoles();
            for (user_role role : roles) {
                authorities.add(new SimpleGrantedAuthority(role.getRole().getName()));
            }
            return new customer_user_detail(user, authorities);

        }
    }
}
