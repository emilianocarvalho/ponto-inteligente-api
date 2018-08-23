package com.carvalho.pontointeligente.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] PUBLIC_MATCHERS = { "/h2-console/*.**", "/h2/*.**" };

    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    // http.csrf().disable().exceptionHandling().authenticationEntryPoint()).and()
    // .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
    // .antMatchers("/auth/**", "/api/cadastrar-pj", "/api/cadastrar-pf",
    // "/v2/api-docs",
    // "/swagger-resources/**", "/configuration/security", "/swagger-ui.html",
    // "/webjars/**")
    // .permitAll().anyRequest().authenticated();
    // http.addFilterBefore(authenticationTokenFilterBean(),
    // UsernamePasswordAuthenticationFilter.class);
    // http.headers().cacheControl();
    //
    // }

    // @Bean
    // public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity
    // http) {
    // http.authorizeExchange().anyExchange().permitAll();
    // return http.build();
    // }
}
