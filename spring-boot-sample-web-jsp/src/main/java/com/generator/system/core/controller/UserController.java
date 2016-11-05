package com.generator.system.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.generator.system.core.entity.User;
import com.generator.system.core.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	User user = new User();

	/**
	 * @PreAuthorize("hasRole(‘ROLE_USER‘) or hasRole(‘ROLE_ADMIN‘)")
	 *  @PreAuthorize("hasRole(‘ROLE_ADMIN‘)")
	 *  WebAuthenticationDetails@21a2c: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId:
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"/login","/"})
	@ResponseBody
	public ModelAndView login(Model model) {
		
		try {
			Authentication auth = SecurityContextHolder.getContext()
					.getAuthentication();
			if (auth instanceof AnonymousAuthenticationToken) {
				return  new ModelAndView("login");
			} else {
				//获取用户登录权限详细
				Object  pinciba=auth.getPrincipal();
				if(pinciba instanceof  UserDetails){
					UserDetails userDetail = ((UserDetails) pinciba);
					model.addAttribute("username", userDetail.getUsername());
					User u =userService.getUserByname(userDetail.getUsername());
					model.addAttribute("realName",u.getRealname());
				}
				
				//登录成功跳到主页
				return  new ModelAndView("home");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return  new ModelAndView("login");
		}
		

	}
}
