package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Woodworking;
import com.syy.myhome.service.IReadyService;
import com.syy.myhome.service.IWoodworkingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 木工 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@RequestMapping("/woodworking")
public class WoodworkingController {
    @Autowired
    private IWoodworkingService woodworkingService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return woodworkingService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Woodworking woodworking) {
        return woodworkingService.addWoodworking(woodworking);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Woodworking woodworking) {
        return woodworkingService.updateWoodworking(woodworking);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return woodworkingService.delWoodworking(id);
    }
}
