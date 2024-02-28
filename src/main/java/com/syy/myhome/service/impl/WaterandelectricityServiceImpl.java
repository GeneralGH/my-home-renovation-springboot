package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Waterandelectricity;
import com.syy.myhome.mapper.ReadyMapper;
import com.syy.myhome.mapper.WaterandelectricityMapper;
import com.syy.myhome.service.IWaterandelectricityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 水电 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class WaterandelectricityServiceImpl extends ServiceImpl<WaterandelectricityMapper, Waterandelectricity> implements IWaterandelectricityService {
    @Autowired
    WaterandelectricityMapper waterandelectricityMapper;
    @Override
    public Result getList() {
        LambdaQueryWrapper<Waterandelectricity> queryWrapper = new LambdaQueryWrapper<>();
        List<Waterandelectricity> Waterandelectricitys = waterandelectricityMapper.selectList(null);
        return Result.success(Waterandelectricitys);
    }

    @Override
    public Result addWaterandelectricity(Waterandelectricity waterandelectricity) {
        waterandelectricity.setCreateTime(LocalDateTime.now());
        int insert = waterandelectricityMapper.insert(waterandelectricity);
        if (insert <= 0) {
            return Result.error("添加失败");
        }
        return Result.success();
    }

    @Override
    public Result updateWaterandelectricity(Waterandelectricity waterandelectricity) {
        int i = waterandelectricityMapper.updateById(waterandelectricity);
        if (i <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delWaterandelectricity(Long id) {
        Waterandelectricity waterandelectricity = waterandelectricityMapper.selectById(id);
        if (waterandelectricity != null) {
            waterandelectricityMapper.deleteById(id);
        }
        return Result.success();
    }
}
