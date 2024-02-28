package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Woodworking;
import com.syy.myhome.mapper.ReadyMapper;
import com.syy.myhome.mapper.WoodworkingMapper;
import com.syy.myhome.service.IWoodworkingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 木工 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class WoodworkingServiceImpl extends ServiceImpl<WoodworkingMapper, Woodworking> implements IWoodworkingService {

    @Autowired
    WoodworkingMapper woodworkingMapper;
    @Override
    public Result getList() {
        LambdaQueryWrapper<Woodworking> queryWrapper = new LambdaQueryWrapper<>();
        List<Woodworking> Woodworkings = woodworkingMapper.selectList(null);
        return Result.success(Woodworkings);
    }

    @Override
    public Result addWoodworking(Woodworking woodworking) {
        woodworking.setCreateTime(LocalDateTime.now());
        int insert = woodworkingMapper.insert(woodworking);
        if (insert <= 0) {
            return Result.error("添加失败");
        }
        return Result.success();
    }

    @Override
    public Result updateWoodworking(Woodworking woodworking) {
        int i = woodworkingMapper.updateById(woodworking);
        if (i <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delWoodworking(Long id) {
        Woodworking woodworking = woodworkingMapper.selectById(id);
        if (woodworking != null) {
            woodworkingMapper.deleteById(id);
        }
        return Result.success();
    }
}
