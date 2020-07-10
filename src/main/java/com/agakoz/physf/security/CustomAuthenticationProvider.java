//package com.agakoz.physf.security;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    @Override
//    public Authentication authenticate(Authentication authentication)
//            throws AuthenticationException {
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//        List<GrantedAuthority> grantedAuths = new ArrayList<>();
//
//
//        //validate and do your additionl logic and set the role type after your validation. in this code i am simply adding admin role type
//        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER" ));
//
//
//
//        return new UsernamePasswordAuthenticationToken(username, password, grantedAuths);
//    }
//
//    @Override
//    public boolean supports(Class<?> arg0) {
//        return true;
//    }
//
//}
