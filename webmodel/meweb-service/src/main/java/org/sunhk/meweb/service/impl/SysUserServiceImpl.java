package org.sunhk.meweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sunhk.meweb.dao.SysUserMapper;
import org.sunhk.meweb.model.SysUser;
import org.sunhk.meweb.service.SysUserService;


@Service(value="sysUserService")
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper userMapper;
	
	public SysUser findUserByName(String userName) {
		return userMapper.selectByPrimaryKey(1L);
	}

}
