package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Bricklayer;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.service.IReadyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 准备 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@CrossOrigin(origins = "http://localhost:3001", allowCredentials = "true")
@RequestMapping("/ready")
@Api("准备")
public class ReadyController {
    @Autowired
    private IReadyService readyService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return readyService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Ready ready) {
        return readyService.addReady(ready);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Ready ready) {
        return readyService.updateReady(ready);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return readyService.delReady(id);
    }
}
