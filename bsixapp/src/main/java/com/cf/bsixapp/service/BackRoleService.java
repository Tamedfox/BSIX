package com.cf.bsixapp.service;

import com.cf.bsixapp.mbg.mapper.BackRoleExtMapper;
import com.cf.bsixapp.mbg.mapper.BackRoleMapper;
import com.cf.bsixapp.mbg.model.BackRole;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

/**
 * 后台用户角色管理service
 * @author cf
 * @version 1.0
 * @date 2020/4/17 22:59
 */
@Service
public class BackRoleService {

    @Autowired
    private BackRoleMapper roleMapper;

    @Autowired
    private BackRoleExtMapper roleExtMapper;

    public int addRole(BackRole role){
        return roleMapper.insert(role);
    }

    public List<BackRole> listRoles(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return roleMapper.selectByExample(null);
    }

    public BackRole getBackRoleById(Long id){
        return roleMapper.selectByPrimaryKey(id);
    }

    public int deleteBackRole(Long id){
        return roleMapper.deleteByPrimaryKey(id);
    }

    public List<Role> gerRoleByAdminId(Long id) {
        return roleExtMapper.getRoleByAdminId(id);
    }
}
