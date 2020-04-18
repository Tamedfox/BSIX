package com.cf.bsixapp.controller;

import com.cf.bsixapp.common.api.PageResult;
import com.cf.bsixapp.common.api.Result;
import com.cf.bsixapp.mbg.model.BackAdmin;
import com.cf.bsixapp.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cf
 * @version 1.0
 * @date 2020/4/16 22:14
 */
@Api(tags = "BackAdminController", description = "后台用户管理")
@RestController
@RequestMapping("/admin")
public class BackAdminController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BackAdminController.class);

    @Autowired
    private UserService userService;

    @ApiOperation("新增后台用户")
    @PostMapping("/register")
    public Result registerBackAdmin(@RequestBody BackAdmin regAdmin){
        int code = userService.addAdmin(regAdmin);
        if(code == 1){
            return Result.success();
        }
        return Result.failed("用户注册失败");
    }

    @ApiOperation("获取所有后台用户")
    @GetMapping("")
    public Result<BackAdmin> getAllBackAdmins(){
        return Result.success(userService.getAllBackAdmins());
    }

    @ApiOperation("删除指定的后台用户")
    @DeleteMapping("/delete/{id}")
    public Result deleteBackAdmin(@PathVariable(name = "id") @ApiParam("后台用户id") Long id){
        int count = userService.deleteAdmin(id);
        if(count != 1){
            LOGGER.debug("删除后台用户ID {} 失败！",id);
            return Result.failed();
        }
        LOGGER.debug("删除后台用户ID {} 成功！",id);
        return Result.success();
    }

    @ApiOperation("分页查询后台用户列表")
    @GetMapping("/list/{page}/{size}")
    public Result<PageResult> listBackAdmins(@PathVariable(name = "page") @ApiParam("当前页")  Integer page,
                                             @PathVariable(name = "size") @ApiParam("当前页数量") Integer size){
        List<BackAdmin> listAdmins = userService.listAdmins(page, size);
        return Result.success(PageResult.transPage(listAdmins));
    }

    @ApiOperation("获取指定的后台用户详情")
    @GetMapping("/{id}")
    public Result<BackAdmin> backAdmin(@PathVariable(name = "id") @ApiParam("后台用户id") Long id){
        BackAdmin admin = userService.getBackAdminsById(id);
        return Result.success(admin);
    }
}
