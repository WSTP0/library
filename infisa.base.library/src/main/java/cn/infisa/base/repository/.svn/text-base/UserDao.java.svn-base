package cn.infisa.base.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.infisa.base.entity.security.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
