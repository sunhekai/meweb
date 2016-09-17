package org.sunhk.meweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sunhk.meweb.model.Task;
import org.sunhk.meweb.service.ITaskService;
import org.sunhk.meweb.service.SysUserService;

@Controller
public class TaskController {
	 @Autowired 
	 private ITaskService taskService;
	 @Autowired
	private SysUserService userSevice;
	 
	 @RequestMapping(value = "/admin/testtask")
	 public @ResponseBody Object getJSON(@RequestBody Task task ) {
		return taskService.insertTask(task);
//		 return userSevice.findUserByName(task.getUsername());
	 }
}
  