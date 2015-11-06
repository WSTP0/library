package cn.infisa.base.data;

import org.springside.modules.test.data.RandomData;

import cn.infisa.base.entity.Task;
import cn.infisa.base.entity.security.User;

/**
 * Task相关实体测试数据生成.
 * 
 * @author calvin
 */
public class TaskData {

	public static Task randomTask() {
		Task task = new Task();
		task.setTitle(randomTitle());
		User user = new User(1L);
		task.setUser(user);
		return task;
	}

	public static String randomTitle() {
		return RandomData.randomName("Task");
	}
}
