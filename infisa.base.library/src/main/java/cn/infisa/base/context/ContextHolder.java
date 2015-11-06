package cn.infisa.base.context;

import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 上下文容器
 * 依赖spring框架listener注入
 * @author ha
 *
 */
public class ContextHolder {
	private static ApplicationContext context = null;  
	
	public static Object getBean(String name){
		return getContext().getBean(name);
	}
	
	public static void setContext(ApplicationContext context) {
		ContextHolder.context = context;
	}

	public static ApplicationContext getContext() {
		return context;
	}

	public static JdbcTemplate getSpringJdbcTemplate(){
		return (JdbcTemplate) getBean("jdbcTemplate");
	}
}