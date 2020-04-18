package com.cf.bsixapp.service;

import com.cf.bsixapp.mbg.mapper.BackPermissionExtMapper;
import com.cf.bsixapp.mbg.mapper.BackPermissionMapper;
import com.cf.bsixapp.mbg.model.BackPermission;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户权限管理service
 * @author cf
 * @version 1.0
 * @date 2020/4/18 11:00
 */
@Service
public class BackPermissionService {

    @Autowired
    private BackPermissionMapper permissionMapper;

    @Autowired
    private BackPermissionExtMapper permissionExtMapper;

    public List<BackPermission> listPermissions(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return permissionMapper.selectByExample(null);
    }

    public int deletePermission(Long id){
        return permissionMapper.deleteByPrimaryKey(id);
    }

    public int addPermission(BackPermission permission){
        return permissionMapper.insert(permission);
    }

    public List<BackPermission> getPermissionsByRoleId(Long id){
        List<BackPermission> permissions = permissionExtMapper.getPermissionByRoleId(id);
        return permissions;
    }

    public List<BackPermission> getPermissionsByAdminId(Long id){

        return null;
    }


}
