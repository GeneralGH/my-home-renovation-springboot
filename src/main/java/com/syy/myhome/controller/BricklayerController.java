package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Bricklayer;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.service.IBricklayerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 瓦工 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@RequestMapping("/bricklayer")
@Api("瓦工")
public class BricklayerController {

    @Autowired
    private IBricklayerService bricklayerService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return bricklayerService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Bricklayer bricklayer) {
        return bricklayerService.addBricklayer(bricklayer);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Bricklayer bricklayer) {
        return bricklayerService.updateBricklayer(bricklayer);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return bricklayerService.delBricklayer(id);
    }
}
