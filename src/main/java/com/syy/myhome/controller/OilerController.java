package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Oiler;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.service.IOilerService;
import com.syy.myhome.service.IReadyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 油工 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@RequestMapping("/oiler")
public class OilerController {
    @Autowired
    private IOilerService oilerService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return oilerService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Oiler oiler) {
        return oilerService.addOiler(oiler);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Oiler oiler) {
        return oilerService.updateOiler(oiler);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return oilerService.delOiler(id);
    }
}
