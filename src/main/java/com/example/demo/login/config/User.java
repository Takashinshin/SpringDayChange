package com.example.demo.login.config;

import java.util.Collection;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;


@Data
public class User implements UserDetails {
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String userName;
	private String password;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
