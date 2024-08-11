package com.rs.e_comerance_dm.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class customer_user_detail implements UserDetails {
    private user __user;
    private Collection<? extends GrantedAuthority> authorities;

    public customer_user_detail(user __user, Collection<? extends GrantedAuthority> authorities) {
        this.__user = __user;
        this.authorities = authorities;
    }
    public customer_user_detail() {}
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return __user.getPassWord();
    }

    @Override
    public String getUsername() {
        return __user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return __user.getEnabled();
    }
}
