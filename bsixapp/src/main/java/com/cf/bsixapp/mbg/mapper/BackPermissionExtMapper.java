package com.cf.bsixapp.mbg.mapper;

import com.cf.bsixapp.mbg.model.BackPermission;

import java.util.List;

/**
 * 后台用户权限扩展mapper
 *
 * @author cf
 * @version 1.0
 * @date 2020/4/18 11:15
 */
public interface BackPermissionExtMapper {

    List<BackPermission> gerPermissionsByAdminId(Long id);

    List<BackPermission> getPermissionByRoleId(Long id);


}
