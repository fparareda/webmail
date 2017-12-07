package com.demo.common;

import org.springframework.context.annotation.Configuration;

/*@Configuration
@EnableWebSecurity
public class SecurityHandler {


    @Order(1)
    @Configuration
    public static class A extends WebSecurityConfigurerAdapter {
        @Autowired
        TokenAuthenticationProvider tokenAuthenticationProvider;

        @Autowired
        ApiEntryPoint apiEntryPoint;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            StatelessAuthenticationFilter filter = new StatelessAuthenticationFilter();
            AntPathRequestMatcher requestMatcher = new AntPathRequestMatcher("/api/**");
            filter.setRequiresAuthenticationRequestMatcher(requestMatcher);
            filter.setAuthenticationManager(super.authenticationManager());

            http.csrf().disable()
                    .exceptionHandling().authenticationEntryPoint(apiEntryPoint)
                    .and()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.authenticationProvider(tokenAuthenticationProvider);
        }

        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/api/user/register");

        }
    }

    @Configuration
    public static class B extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.authenticationProvider(new DaoAuthenticationProvider());
        }
    }
}*/
