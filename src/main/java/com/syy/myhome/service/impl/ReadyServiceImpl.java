package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Bricklayer;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.mapper.ReadyMapper;
import com.syy.myhome.service.IReadyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 准备 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class ReadyServiceImpl extends ServiceImpl<ReadyMapper, Ready> implements IReadyService {
    @Autowired
    ReadyMapper readyMapper;

    public Result getList() {
        LambdaQueryWrapper<Ready> queryWrapper = new LambdaQueryWrapper<>();
        List<Ready> Readys = readyMapper.selectList(null);
        return Result.success(Readys);
    }
}
