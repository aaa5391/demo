package com.generator.system.core.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.generator.system.core.entity.User;
import com.generator.system.core.mapper.UserMapper;


@Service
public class UserService implements UserDetailsService {
	@Autowired
	private UserMapper userDao;

	public List<User> loadAllUsers() {
		return userDao.loadAllUsers();
	}

	/**
	 * 保存用户
	 * 
	 * @param user
	 */
	public void save(User user) {
	 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		if (user.getRole() == "0") {
			user.setRole("ROLE_ADMIN");
		} else {
			user.setRole("ROLE_USER");
		}
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDao.insert(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = userDao.findUserByName(username);
		if (user == null) {
			throw new UsernameNotFoundException(username + " not found");
		}
		System.err.println(user.getRole() + "正在执行查询角色名称");
		System.err.println("username is " + username + ", " + user.getRole());
		/*List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole()));
        System.err.println("username is " + username + ", " + user.getRole());
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), authorities);*/
		return new UserDetails() {
			private static final long serialVersionUID = 3720901165271071386L;
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				List<SimpleGrantedAuthority> auths = new ArrayList<>();
				auths.add(new SimpleGrantedAuthority(user.getRole()));
				return auths;
			}

			@Override
			public String getPassword() {
				return user.getPassword();
			}

			@Override
			public String getUsername() {
				return username;
			}

			@Override
			public boolean isAccountNonExpired() {
				return true;
			}

			@Override
			public boolean isAccountNonLocked() {
				return true;
			}

			@Override
			public boolean isCredentialsNonExpired() {
				return true;
			}

			@Override
			public boolean isEnabled() {
				return true;
			}
		};
	}
	
	public User getUserByname(String username) {
		return userDao.findUserByName(username);
	}

}