package cn.infisa.base.entity.security;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import cn.infisa.base.entity.IdEntity;

@Entity
@Table(name = "infisa_role")
public class Role extends IdEntity{

	private String name;
	private String value;
	/** 角色使用状态 0-删除，1-正常 */
	private String status = "1";
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private Set<Permission> permissions = new LinkedHashSet<Permission>();
	@ManyToMany
	@JoinTable(name = "infisa_role_permission", joinColumns = { @JoinColumn(name = "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "permission_id") })
	@Fetch(FetchMode.SUBSELECT)
	@OrderBy("id")
	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Role(){
		
	}
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
}
