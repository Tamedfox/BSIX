package com.cf.bsixapp.controller;

import com.cf.bsixapp.common.api.PageResult;
import com.cf.bsixapp.common.api.Result;
import com.cf.bsixapp.mbg.model.BackRole;
import com.cf.bsixapp.service.BackRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cf
 * @version 1.0
 * @date 2020/4/18 9:54
 */
@Api(tags = "BackRoleController", description = "后台用户角色管理")
@RestController
@RequestMapping("/admin/role")
public class BackRoleController {

    @Autowired
    private BackRoleService roleService;

    @ApiOperation("分页查询后台用户角色列表")
    @GetMapping("/list/{page}/{size}")
    public Result listRoles(@PathVariable(name = "page") @ApiParam("当前页")  Integer page,
                            @PathVariable(name = "size") @ApiParam("当前页数量") Integer size){
        List<BackRole> roles = roleService.listRoles(page, size);
        return Result.success(PageResult.transPage(roles));
    }

    @ApiOperation("根据后台用户id查找用户所有角色")
    @GetMapping("/admin/{id}")
    public Result getRoleByAdminId(@PathVariable(name = "id") @ApiParam("用户id") Long id){
        return Result.success(roleService.gerRoleByAdminId(id));
    }


    @ApiOperation("根据角色id查询当前后台角色")
    @GetMapping("/{id}")
    public Result getRoleById(@PathVariable(name = "id") @ApiParam("用户id") Long id){
        return Result.success(roleService.getBackRoleById(id));
    }

    @ApiOperation("根据角色id删除角色")
    @DeleteMapping("/{id}")
    public Result deleteRoleById(@PathVariable(name = "id") @ApiParam("用户id") Long id){
        return Result.success(roleService.deleteBackRole(id));
    }

    @ApiOperation("添加后台用户角色")
    @PostMapping("")
    public Result addRole(@RequestBody @ApiParam("后台用户角色") BackRole role){
        int i = roleService.addRole(role);
        if(i == 1){
            return Result.success();
        }
        return Result.failed("添加角色失败！");
    }

}
