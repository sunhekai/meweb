package org.sunhk.meweb.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserServiceTest extends TestCase {
	@Resource
	private SysUserService userService;
	@Test
	public void testSelect(){
		try {
			String userName = userService.findUserByName("").getUsername();
			System.out.println("==============================="+userName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
