package com.sgc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter 
{
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {       
        http
        	.authorizeRequests()
        		.antMatchers("/","/cours","/dossier","/notes","/inscription").hasAnyRole("eleve","professeur","administrateur")
        		//.antMatchers("/","/listeinfractions","/listedossiers","/listInfractions").hasAnyRole("policier","administrateur")
		        //.antMatchers("/addInfractionAuDossier").hasAnyRole("policier")
		        //.antMatchers("/addInfraction","/addDossier").hasRole("administrateur")
		        .anyRequest().authenticated()
		        .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception 
    {
        auth
        .inMemoryAuthentication()
        .withUser("etud")
          .password("1234")
          .roles("eleve")
          .and()
        .withUser("prof")
          .password("1234")
          .roles("professeur")
          .and()
        .withUser("admin") 
          .password("1234")
          .roles("administrateur");
    }
}