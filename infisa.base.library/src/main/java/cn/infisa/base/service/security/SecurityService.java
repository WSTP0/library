package cn.infisa.base.service.security;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.infisa.base.entity.security.DataPermission;
import cn.infisa.base.entity.security.Group;
import cn.infisa.base.entity.security.Navigator;
import cn.infisa.base.entity.security.Permission;
import cn.infisa.base.entity.security.Role;
import cn.infisa.base.repository.security.DataPermissionDao;
import cn.infisa.base.repository.security.GroupDao;
import cn.infisa.base.repository.security.NavigatorDao;
import cn.infisa.base.repository.security.PermissionDao;
import cn.infisa.base.repository.security.RoleDao;

/**
 * 
 * @author libo libo@infisa.cn
 * @since 2014年10月14日 下午2:44:19
 */
@Component
@Transactional
public class SecurityService {

	private static final Logger logger = LoggerFactory.getLogger(SecurityService.class);
	
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private PermissionDao permissionDao;
	@Autowired
	private DataPermissionDao dataPermissionDao;
	@Autowired
	private GroupDao groupDao;
	@Autowired
	private NavigatorDao navigatorDao;
	
	public Role saveRole(Role role){
		return roleDao.save(role);
	}
	public void deleteRole(Long id){
		roleDao.delete(id);
		return ;
	}
	public Role getRole(Long id){
		return roleDao.findOne(id);
	}
	public List<Role> getAllRoles(){
		return (List<Role>) roleDao.findAll();
	}
	/**
	 * @param permission
	 */
	public Permission savePermission(Permission permission){
		return permissionDao.save(permission);
	}
	public void deletePermission(Long id){
		permissionDao.delete(id);
		return ;
	}
	public Permission getPermission(Long id){
		return permissionDao.findOne(id);
	}
	public List<Permission> getAllPermissions(){
		return (List<Permission>) permissionDao.findAll();
	}
	
	/**
	 * @param dataPermission
	 */
	public DataPermission saveDataPermission(DataPermission dataPermission){
		return dataPermissionDao.save(dataPermission);
	}
	public void deleteDataPermission(Long id){
		dataPermissionDao.delete(id);
		return ;
	}
	public DataPermission getDataPermission(Long id){
		return dataPermissionDao.findOne(id);
	}
	public List<DataPermission> getAllDataPermissions(){
		return (List<DataPermission>) dataPermissionDao.findAll();
	}
	
	/**
	 * @param group
	 */
	public Group saveGroup(Group group){
		return groupDao.save(group);
	}
	public void deleteGroup(Long id){
		groupDao.delete(id);
		return;
	}
	public Group getGroup(Long id){
		return groupDao.findOne(id);
	}
	public List<Group> getAllGroup(){
		return (List<Group>) groupDao.findAll();
	}
	
	/**
	 * navigator
	 */
	public Navigator saveNavigator(Navigator navigator){
		return navigatorDao.save(navigator);
	}
	public void deleteNavigator(Long id){
		navigatorDao.delete(id);
		return ;
	}
	public Navigator getNavigator(Long id){
		return navigatorDao.findOne(id);
	}
	public List<Navigator> getAllNavigator(){
		return (List<Navigator>) navigatorDao.findAll();
	}
}
