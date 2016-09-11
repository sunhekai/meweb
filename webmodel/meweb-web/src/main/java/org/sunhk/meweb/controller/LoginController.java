package org.sunhk.meweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sunhk.meweb.model.SysUser;
import org.sunhk.meweb.service.SysUserService;

@Controller
public class LoginController {
	
	@Autowired
	private SysUserService userSevice;
	
	 @RequestMapping("/login")
	public String doLogin(@RequestParam(value="username", defaultValue="") String username,
	           @RequestParam(value="password", defaultValue="") String password,
	           HttpServletRequest req)
	{
		 Subject currentUser = SecurityUtils.getSubject();
		 boolean loginSuccess = false;
		 if(currentUser.isAuthenticated()) 
		 {
	           loginSuccess = true;
	     }
		 try
		 {
//	           currentUser.login(new UsernamePasswordToken(username, password));
	           loginSuccess = true;
	     } catch(Exception e) {
	           e.printStackTrace();
	           req.setAttribute("error_info", "用户名或密码错，请核对！");
	           return "login";
	     }


		 if(loginSuccess) {
	           //生成用户菜单(当然，也可以在main中完成，但在重定向的情况下会有hibernatesession延迟问题)
	           SysUser s = (SysUser)currentUser.getSession().getAttribute("c_user");
	           //currentUser.getSession().setAttribute("menus",s.getMenus());
	           //currentUser.getSession().setAttribute("models", s.getModels());
	           return "redirect:admin/index.html";
	       }
	       return "login";

	}
	 
	 @RequestMapping("/admin/testjson")
	 public @ResponseBody Object getJSON() {
		return userSevice.findUserByName("admin");
	 
	 }
	 
	 

}
