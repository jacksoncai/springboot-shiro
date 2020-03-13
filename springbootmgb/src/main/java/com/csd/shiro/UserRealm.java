package com.csd.shiro;

import com.csd.entity.User;
import com.csd.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override//授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("<----------开始授权--->");
        User user = (User) principals.getPrimaryPrincipal();
        if (user != null) {
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        }
        // 给资源授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

                   info.addStringPermission("user:add");
                   info.addStringPermission("user:update");

        return info;
    }

    @Override//认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        logger.info("<----------开始认证--->");

        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        User user = userService.selectUserByUsername(userToken.getUsername());

        if (user == null) {
            return null;//返回用户名不存在
        }

        //认证并授权
        return new SimpleAuthenticationInfo(user, user.getPassword(), "");
    }
}
