package com.cf.bsixapp.service;

import com.cf.bsixapp.mbg.mapper.BackAdminMapper;
import com.cf.bsixapp.mbg.mapper.BackAdminPermissionrRelMapper;
import com.cf.bsixapp.mbg.model.BackAdmin;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户管理Service
 */
@Service
public class UserService {

    @Autowired
    private BackAdminMapper backAdminMapper;

    @Autowired
    private BackAdminPermissionrRelMapper adminPermissionRelMapper;

    public List<BackAdmin> getAllBackAdmins() {
        return backAdminMapper.selectByExample(null);
    }

    public int deleteAdmin(Long id){
        return backAdminMapper.deleteByPrimaryKey(id);
    }

    public List<BackAdmin> listAdmins(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return backAdminMapper.selectByExample(null);
    }

    public int addAdmin(BackAdmin backAdmin){
        return backAdminMapper.insertSelective(backAdmin);
    }

    public int updateAdmin(Long id, BackAdmin backAdmin){
        backAdmin.setId(id);
        return backAdminMapper.updateByPrimaryKey(backAdmin);
    }

    public BackAdmin getBackAdminsById(Long id) {
        return backAdminMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        BSixBackAdminExample example = new BSixBackAdminExample();
//        example.createCriteria().andUsernameEqualTo(username);
//        List<BSixBackAdmin> admins = backAdminMapper.selectByExample(example);
//        if(admins.size() == 0){
//            throw new UsernameNotFoundException("用户不存在");
//        }
//        BSixBackAdmin admin = admins.get(0);
//        BSixBackPermissionrRelExample perssionExample = new BSixBackPermissionrRelExample();
//        perssionExample.createCriteria().andAdminIdEqualTo(admin.getId());
//        List<BSixBackPermissionrRel> permissionrs = adminPermissionRelMapper.selectByExample(perssionExample);
//        //获取权限
//        return new AdminUserDetails(admin,permissionrs);
//    }
//
//    private List<GrantedAuthority> generateAuthorities(Long id) {
//        return null;
//    }

}
