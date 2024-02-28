package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Kandb;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 厨卫 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IKandbService extends IService<Kandb> {

    Result getList();

    Result addKandb(Kandb kandb);

    Result updateKandb(Kandb kandb);

    Result delKandb(Long id);
}
