package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Bricklayer;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.mapper.BricklayerMapper;
import com.syy.myhome.service.IBricklayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

/**
 * <p>
 * 瓦工 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class BricklayerServiceImpl extends ServiceImpl<BricklayerMapper, Bricklayer> implements IBricklayerService {


    @Autowired
    BricklayerMapper bricklayerMapper;
    @Override
    public Result getList() {
        LambdaQueryWrapper<Bricklayer> queryWrapper = new LambdaQueryWrapper<>();
        List<Bricklayer> bricklayers = bricklayerMapper.selectList(null);
        return Result.success(bricklayers);
    }

    @Override
    public Result addBricklayer(Bricklayer bricklayer) {
        bricklayer.setCreateTime(LocalDateTime.now());
        int insert = bricklayerMapper.insert (bricklayer);
        if (insert <= 0) {
            return Result.error("添加失败");
        }
        return Result.success();
    }

    @Override
    public Result updateBricklayer(Bricklayer bricklayer) {
        int insert = bricklayerMapper.updateById(bricklayer);
        if (insert <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delBricklayer(Long id) {
        Bricklayer bricklayer = bricklayerMapper.selectById(id);
        if (bricklayer != null) {
            bricklayerMapper.deleteById(id);
        }
        return Result.success();
    }
}
