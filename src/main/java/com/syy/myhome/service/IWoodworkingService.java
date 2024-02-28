package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Woodworking;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 木工 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IWoodworkingService extends IService<Woodworking> {

    Result getList();

    Result addWoodworking(Woodworking woodworking);

    Result updateWoodworking(Woodworking woodworking);

    Result delWoodworking(Long id);
}
