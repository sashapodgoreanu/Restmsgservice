/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Alexandru Podgoreanu
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// DataSource dataSource;
	//
	// @Autowired
	// public void configureGlobal(AuthenticationManagerBuilder auth) throws
	// Exception {
	// System.out.println();
	// auth
	// .jdbcAuthentication()
	// .dataSource(dataSource)
	// .usersByUsernameQuery("select id as username, id_token as password, true
	// from USERDETAILS where id = ?")
	// .authoritiesByUsernameQuery("select id as username, 'ROLE_USER' from
	// USERDETAILS where id= ?");
	// /*.inMemoryAuthentication()
	// .withUser("user").password("pass").roles("USER");*/
	//
	// }
	//
	// @Override
	// protected void configure(HttpSecurity http) throws Exception {
	// http
	// .authorizeRequests()
	// .antMatchers("/workingarea/**")
	// .hasRole("USER")
	// .anyRequest()
	// .authenticated()
	// .anyRequest()
	// .authenticated()
	// .and()
	// .formLogin().loginPage("/login").permitAll()
	// .usernameParameter("username").passwordParameter("password")
	// .defaultSuccessUrl("/workingarea/0")
	// .failureUrl("/login?error")
	// .and()
	// .logout()
	// .logoutUrl("/logoutws").permitAll()
	// .logoutSuccessUrl("/login")
	// .and().csrf().disable();
	// /* .and()
	// .httpBasic();*/
	// /*
	// http.csrf().disable()
	// .antMatcher("/login")
	// .authorizeRequests()
	// .anyRequest().hasAnyRole("USER", "API")
	// .and()
	// .httpBasic();*/
	//
	// }

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/**");
	}

	/*
	 * @Bean public AuthenticationProvider authenticator() { return new
	 * TestingAuthenticationProvider(); }
	 */
}
