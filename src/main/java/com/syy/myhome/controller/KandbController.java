package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Kandb;
import com.syy.myhome.service.IKandbService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 厨卫 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@RequestMapping("/kandb")
public class KandbController {
    @Autowired
    private IKandbService kandbService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return kandbService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Kandb kandb) {
        return kandbService.addKandb(kandb);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Kandb kandb) {
        return kandbService.updateKandb(kandb);
    }

    @DeleteMapping("/del")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return kandbService.delKandb(id);
    }
}
