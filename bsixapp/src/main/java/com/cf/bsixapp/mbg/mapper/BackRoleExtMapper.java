package com.cf.bsixapp.mbg.mapper;

import javax.management.relation.Role;
import java.util.List;

/**
 * 后台角色扩展mapper
 * @author cf
 * @version 1.0
 * @date 2020/4/18 10:08
 */
public interface BackRoleExtMapper {

    List<Role> getRoleByAdminId(Long id);

}
