package com.example.coco.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private OAuth2AuthorizedClientService clientService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests(auth ->
                        auth.antMatchers("/").permitAll()
                                .anyRequest().authenticated()
                )
                .exceptionHandling(e -> e.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)))
                .csrf(c -> c.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()))
                .logout(l -> l.logoutSuccessUrl("/").permitAll()
                ).
                oauth2Login()
                .loginPage("/login")
                .permitAll();
    }
}
