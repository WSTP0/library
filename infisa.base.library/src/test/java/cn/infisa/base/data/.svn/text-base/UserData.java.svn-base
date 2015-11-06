package cn.infisa.base.data;

import org.springside.modules.test.data.RandomData;

import cn.infisa.base.entity.security.User;

public class UserData {

	public static User randomNewUser() {
		User user = new User();
		user.setLoginName(RandomData.randomName("user"));
		user.setName(RandomData.randomName("User"));
		user.setPlainPassword(RandomData.randomName("password"));

		return user;
	}
}
