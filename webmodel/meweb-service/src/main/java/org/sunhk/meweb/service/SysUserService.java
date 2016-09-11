package org.sunhk.meweb.service;

import org.sunhk.meweb.model.SysUser;

public interface SysUserService {
	SysUser findUserByName(String userName);
}
