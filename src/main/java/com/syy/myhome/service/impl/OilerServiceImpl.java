package com.syy.myhome.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Oiler;
import com.syy.myhome.entity.Ready;
import com.syy.myhome.mapper.OilerMapper;
import com.syy.myhome.service.IOilerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 油工 服务实现类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
@Service
public class OilerServiceImpl extends ServiceImpl<OilerMapper, Oiler> implements IOilerService {

    @Autowired
    OilerMapper oilerMapper;

    @Override
    public Result getList() {
        LambdaQueryWrapper<Oiler> queryWrapper = new LambdaQueryWrapper<>();
        List<Oiler> Oilers = oilerMapper.selectList(null);
        return Result.success(Oilers);
    }

    @Override
    public Result addOiler(Oiler oiler) {
        oiler.setCreateTime(LocalDateTime.now());
        int insert = oilerMapper.insert(oiler);
        if (insert <= 0) {
            return Result.error("添加失败");
        }
        return Result.success();
    }

    @Override
    public Result updateOiler(Oiler oiler) {
        int i = oilerMapper.updateById(oiler);
        if (i <= 0) {
            return Result.error("修改失败");
        }
        return Result.success();
    }

    @Override
    public Result delOiler(Long id) {
        Oiler oiler = oilerMapper.selectById(id);
        if (oiler != null) {
            oilerMapper.deleteById(id);
        }
        return Result.success();
    }
}
