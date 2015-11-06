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
@Table(name="infisa_permission")
public class Permission extends IdEntity{

	private String name;
	/** data level unique identifier*/
	private String value;
	
	public Permission(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	private Set<Navigator> navigators = new LinkedHashSet<Navigator>();
	@ManyToMany
	@JoinTable(name = "infisa_permission_navigator", joinColumns = { @JoinColumn(name = "permission_id") }, inverseJoinColumns = { @JoinColumn(name = "navigator_id") })
	@Fetch(FetchMode.SUBSELECT)
	@OrderBy("id")
	public Set<Navigator> getNavigators() {
		return navigators;
	}
	public void setNavigators(Set<Navigator> navigators) {
		this.navigators = navigators;
	}
	
	
}
