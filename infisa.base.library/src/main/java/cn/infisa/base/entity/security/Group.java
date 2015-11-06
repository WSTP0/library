package cn.infisa.base.entity.security;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import cn.infisa.base.entity.IdEntity;

@Entity
@Table(name = "infisa_group")
public class Group extends IdEntity {

	private String name;
	private String value;
	/** group boss */
	private User boss;
	/** children group */
	private Set<Group> children;
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
	@OneToOne
	@JoinColumn(name="boss",insertable=true,unique=true)  
	public User getBoss() {
		return boss;
	}
	public void setBoss(User boss) {
		this.boss = boss;
	}
	@OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="parent_id")
	public Set<Group> getChildren() {
		return children;
	}
	public void setChildren(Set<Group> children) {
		this.children = children;
	}
	
	public Group(){
		super();
	}
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	
	private Set<DataPermission> dataPermissions = new LinkedHashSet<DataPermission>();
	@ManyToMany
	@JoinTable(name = "infisa_group_data_permission", joinColumns = { @JoinColumn(name = "group_id") }, inverseJoinColumns = { @JoinColumn(name = "data_permission_id") })
	@Fetch(FetchMode.SUBSELECT)
	@OrderBy("id")
	public Set<DataPermission> getDataPermissions() {
		return dataPermissions;
	}
	public void setDataPermissions(Set<DataPermission> dataPermissions) {
		this.dataPermissions = dataPermissions;
	}
	
	
}
