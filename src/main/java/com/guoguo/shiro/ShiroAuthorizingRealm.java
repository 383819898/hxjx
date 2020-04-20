
package com.guoguo.shiro;

import javax.annotation.Resource;

import com.guoguo.Mapper.UserDetailsDAO;
import com.guoguo.entity.UserDetails;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 用户身份验证,授权 Realm 组件
 * 
 **/

public class ShiroAuthorizingRealm extends AuthorizingRealm {

    Logger logger = LoggerFactory.getLogger(ShiroAuthorizingRealm.class);



    @Resource
    private UserDetailsDAO userDetailsDAO;
/*


*/
/*    @Resource
    private RoleService roleService;

    @Resource
    private PermissionService permissionService;*//*


    */
/**
     * 权限检查
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        logger.info("权限检查----" + 1 + "-----------------");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        String username = String.valueOf(principals.getPrimaryPrincipal());
        logger.info("权限检查----" + username + "-----------------");
     /*    User param = new UserDetails();
       param.setUserName(username);
        final User user = userService.getSigle(param);
        if (user != null) {
            Role role = roleService.getSingle(user.getRoleId());
            if (role != null) {
                authorizationInfo.addRole(role.getRoleDefine());
                LOGGER.info("角色：" + role.getRoleDefine());
                List<Permission> permissions = permissionService
                        .getByRole(role);
                for (Permission p : permissions) {
                    if (p.getPermissionDefine() != null) {
                        LOGGER.info("权限：" + p.getPermissionDefine());
                        authorizationInfo.addStringPermission(p
                                .getPermissionDefine());
                    }
                    if (p.getUrl() != null) {
                        authorizationInfo.addStringPermission(p.getUrl());
                    }
                }

            }
        }*/

        return authorizationInfo;
    }


/**
     * 登录验证
     *//*

 */
   @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        logger.info("登录验证");
        String username = String.valueOf(token.getPrincipal());
        String password = new String((char[]) token.getCredentials());

        SimpleAuthenticationInfo authenticationInfo = null;
        // 通过数据库进行验证

        try {
            UserDetails user = new UserDetails(username, password);
            final UserDetails authenticatedUser = userDetailsDAO.login(user);
            if (authenticatedUser == null) {
                throw new AuthenticationException("用户名或密码错误.");
            } else {
                Subject currentUser = SecurityUtils.getSubject();
                Session session = currentUser.getSession();
                session.setAttribute("user", authenticatedUser);
            }

            authenticationInfo = new SimpleAuthenticationInfo(username,
                    password, authenticatedUser.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return authenticationInfo;
    }



}
