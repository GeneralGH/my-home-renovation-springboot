package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Kandb;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.mapper.KandbMapper;
import com.syy.myhome.mapper.ReadyMapper;
import com.syy.myhome.service.IKandbService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 厨卫 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class KandbServiceImpl extends ServiceImpl<KandbMapper, Kandb> implements IKandbService {
    @Autowired
    KandbMapper kandbMapper;
    @Override
    public Result getList() {
        LambdaQueryWrapper<Kandb> queryWrapper = new LambdaQueryWrapper<>();
        List<Kandb> Kandbs = kandbMapper.selectList(null);
        return Result.success();
    }

    @Override
    public Result addKandb(Kandb kandb) {
        kandb.setCreateTime(LocalDateTime.now());
        int insert = kandbMapper.insert(kandb);
        if (insert <= 0) {
            return Result.error("新增失败");
        }
        return Result.success();
    }

    @Override
    public Result updateKandb(Kandb kandb) {
        int i = kandbMapper.updateById(kandb);
        if (i <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delKandb(Long id) {
        Kandb kandb = kandbMapper.selectById(id);
        if (kandb != null) {
            kandbMapper.deleteById(id);
        }
        return Result.success();
    }
}
