package cn.infisa.base.repository.security;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.infisa.base.entity.security.DataPermission;

public interface DataPermissionDao extends PagingAndSortingRepository<DataPermission, Long> {

}
