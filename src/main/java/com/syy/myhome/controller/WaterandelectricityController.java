package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Waterandelectricity;
import com.syy.myhome.service.IReadyService;
import com.syy.myhome.service.IWaterandelectricityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 水电 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
//@CrossOrigin(origins = "${cors.origins}", allowCredentials = "true")
@RequestMapping("/waterandelectricity")
public class WaterandelectricityController {
    @Autowired
    private IWaterandelectricityService waterandelectricityService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return waterandelectricityService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Waterandelectricity waterandelectricity) {
        return waterandelectricityService.addWaterandelectricity(waterandelectricity);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Waterandelectricity waterandelectricity) {
        return waterandelectricityService.updateWaterandelectricity(waterandelectricity);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return waterandelectricityService.delWaterandelectricity(id);
    }
}
