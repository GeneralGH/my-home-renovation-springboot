package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Bricklayer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.syy.myhome.entity.Ready;

/**
 * <p>
 * 瓦工 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IBricklayerService extends IService<Bricklayer> {
    Result getList();

    Result addBricklayer(Bricklayer bricklayer);

    Result updateBricklayer(Bricklayer bricklayer);

    Result delBricklayer(Long id);
}
