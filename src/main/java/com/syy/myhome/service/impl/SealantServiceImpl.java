package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.entity.Sealant;
import com.syy.myhome.mapper.ReadyMapper;
import com.syy.myhome.mapper.SealantMapper;
import com.syy.myhome.service.ISealantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 美缝 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class SealantServiceImpl extends ServiceImpl<SealantMapper, Sealant> implements ISealantService {
    @Autowired
    SealantMapper sealantMapper;

    @Override
    public Result getList() {
        LambdaQueryWrapper<Sealant> queryWrapper = new LambdaQueryWrapper<>();
        List<Sealant> Sealants = sealantMapper.selectList(null);
        return Result.success(Sealants);
    }

    @Override
    public Result addSealant(Sealant sealant) {
        sealant.setCreateTime(LocalDateTime.now());
        int insert = sealantMapper.insert(sealant);
        if (insert <= 0) {
            return Result.error("添加失败");
        }
        return Result.success();
    }

    @Override
    public Result updateSealant(Sealant sealant) {
        int i = sealantMapper.updateById(sealant);
        if (i <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delSealant(Long id) {
        Sealant sealant = sealantMapper.selectById(id);
        if (sealant != null) {
            sealantMapper.deleteById(id);
        }
        return Result.success();
    }
}
