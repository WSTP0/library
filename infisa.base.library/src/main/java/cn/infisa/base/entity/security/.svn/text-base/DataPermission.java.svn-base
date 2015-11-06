package cn.infisa.base.entity.security;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import cn.infisa.base.entity.IdEntity;

@Entity
@Table(name="infisa_data_permission")
public class DataPermission extends IdEntity{

	private String name;
	/** data level unique identifier*/
	private String value;
	
	public DataPermission(){
		super();
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
}
