package org.sunhk.meweb.common.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.util.DigestUtils;
import org.sunhk.meweb.model.SysUser;
import org.sunhk.meweb.service.SysUserService;

public class UserRealm extends AuthorizingRealm {
 
    @Resource(name = "sysUserService")
    private SysUserService sysUserservice;
 
    public UserRealm() {
       super();
       // 设置认证token的实现类为用户名密码模式
       this.setAuthenticationTokenClass(UsernamePasswordToken.class);
       //设置验证方式，用户自行设定密码加密方式
       this.setCredentialsMatcher(new CredentialsMatcher() {   
           public boolean doCredentialsMatch(AuthenticationToken token,AuthenticationInfo info) {
              
              UsernamePasswordToken upToken = (UsernamePasswordToken)token;
              String pwd = new String(upToken.getPassword());
              
              SysUser student = sysUserservice.findUserByName(upToken.getUsername());
 
              if(student.getPassword().equals(DigestUtils.md5Digest(pwd.getBytes()))){
                  //用户名及密码验证通过
                  return true;
              }
              //用户名或密码不正确
              return false;
           }
       });
    }
 
    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
           AuthenticationToken token) throws AuthenticationException {
       
 
       UsernamePasswordToken upToken = (UsernamePasswordToken) token;
 
       //调用业务方法
       SysUser student = sysUserservice.findUserByName(upToken.getUsername());
 
       if(student != null) {
           //要放在作用域中的东西，请在这里进行操作
           SecurityUtils.getSubject().getSession().setAttribute("c_user", student);
           
           return new SimpleAuthenticationInfo(student.getId(),student.getPassword(), this.getName());
       }
       //认证没有通过
       return null;
    }
 
    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
           PrincipalCollection principalCollection) {
 
//       Long loginId = (Long)principalCollection.fromRealm(getName()).iterator().next();
       //取当前用户
//       User student = studentService.getStudentById(loginId);
//       //添加角色及权限信息
       SimpleAuthorizationInfo sazi = new SimpleAuthorizationInfo();
//       sazi.addRoles(student.getRolesAsString());
//       sazi.addStringPermissions(student.getPermissionsAsString());
 
       return sazi;
    }
 
    @Override
    protected void clearCachedAuthorizationInfo(PrincipalCollection pc) {
       SimplePrincipalCollection principals= new SimplePrincipalCollection(pc, getName()); 
       super.clearCachedAuthorizationInfo(pc);
    }
}
