package com.cf.bsixapp.controller;

import com.cf.bsixapp.common.api.PageResult;
import com.cf.bsixapp.common.api.Result;
import com.cf.bsixapp.mbg.model.BackPermission;
import com.cf.bsixapp.service.BackPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户权限管理controller
 *
 * @author cf
 * @version 1.0
 * @date 2020/4/18 11:51
 */
@Api(tags = "BackPermissionController", description = "后台用户权限管理")
@RestController
@RequestMapping("/admin/permission")
public class BackPermissionController {

    @Autowired
    private BackPermissionService permissionService;

    @ApiOperation("添加后台用户权限")
    @PostMapping("")
    public Result addPermission(@RequestBody @ApiParam("后台权限") BackPermission permission){
        int i = permissionService.addPermission(permission);
        if(i == 1){
            return Result.success();
        }
        return Result.failed("添加权限失败！");
    }

    @ApiOperation("分页查询所有后台权限")
    @GetMapping("/{page}/{size}")
    public Result listPermissions(@PathVariable(name = "page") @ApiParam("当前页")  Integer page,
                                  @PathVariable(name = "size") @ApiParam("当前页数量") Integer size){
        List<BackPermission> permissions = permissionService.listPermissions(page, size);
        return Result.success(PageResult.transPage(permissions));
    }

    @ApiOperation("根据权限id删除当前权限")
    @DeleteMapping("/{id}")
    public Result deletePermissions(@PathVariable(name = "id") @ApiParam("权限id") Long id){
        permissionService.deletePermission(id);
        return Result.success();
    }

    @ApiOperation("根据后台角色id查询当前角色下的所有权限")
    @GetMapping("/role/{id}")
    public Result getPermissionsByRoleId(@PathVariable(name = "id") @ApiParam("后台用户角色id") Long id){
        List<BackPermission> permissions = permissionService.getPermissionsByRoleId(id);
        return Result.success(permissions);
    }
}
