package com.syy.myhome.controller;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Sealant;
import com.syy.myhome.service.IReadyService;
import com.syy.myhome.service.ISealantService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 美缝 前端控制器
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@RestController
@RequestMapping("/sealant")
public class SealantController {
    @Autowired
    private ISealantService sealantService;

    @GetMapping("/getList")
    @ApiOperation("列表")
    public Result getList() {
        return sealantService.getList();
    }

    @PostMapping("/add")
    @ApiOperation("新增")
    public Result add(@RequestBody Sealant sealant) {
        return sealantService.addSealant(sealant);
    }

    @PutMapping("/update")
    @ApiOperation("修改")
    public Result update(@RequestBody Sealant sealant) {
        return sealantService.updateSealant(sealant);
    }

    @DeleteMapping("/del/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Long id) {
        return sealantService.delSealant(id);
    }
}
