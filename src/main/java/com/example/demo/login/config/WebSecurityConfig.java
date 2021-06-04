package com.example.demo.login.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DatabaseUserDetailsService userDetailsService;
	
	
	@Bean
	public PasswordEncoder passwordEncorder() {
		return new BCryptPasswordEncoder();
		//実用する場合は、個人で作成したものを使用するべき
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//リソースのアクセス制御をするメソッド
		http.authorizeRequests()
			.anyRequest().authenticated()//ログインしないとこのアプリの配下にはアクセスできない
			.and()
			.formLogin();//ログインフォーマット設定
	
	}
	
	@Override
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//ユーザの認証方式を決定するメソッド　主にインメモリかDB認証
		auth.userDetailsService(userDetailsService);
	}
	
}
