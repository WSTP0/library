package cn.infisa.base.entity.security;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.infisa.base.entity.IdEntity;

@Entity
@Table(name="infisa_navigator")
public class Navigator extends IdEntity {

	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public Navigator(){
		super();
	}
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
