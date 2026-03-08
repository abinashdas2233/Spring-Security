package com.kodewish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(auth -> auth.requestMatchers("/sbi/contact", "/sbi/about").permitAll() // it will not
																											// ask usr
																											// and pw
																											// for this
																											// api hit
				.requestMatchers("/sbi/transfer", "/sbi/admin").authenticated()// this api hit will ask for usr and pw
		)
				// .formLogin(Customizer.withDefaults());//this line is only for auth check
				// through browser
				.httpBasic();// this is for postman
		/*
		 * Note:- 1️⃣ What formLogin() Does
		 * 
		 * When you enable formLogin(), Spring Security expects a web browser. If a
		 * protected URL is accessed (like /sbi/transfer), Spring Security:
		 * 
		 * Sends a 302 Redirect response.
		 * 
		 * Redirects to the login page.
		 * 
		 * 
		 * Why It Doesn't Work Well in Postman
		 * 
		 * Postman is not a browser. It:
		 * 
		 * Does not render HTML login forms.
		 * 
		 * Does not automatically submit credentials to /login.
		 * 
		 * Only shows the redirect response.
		 * 
		 * 
		 */

		return http.build();
	}
}