package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Waterandelectricity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 水电 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IWaterandelectricityService extends IService<Waterandelectricity> {

    Result getList();

    Result addWaterandelectricity(Waterandelectricity waterandelectricity);

    Result updateWaterandelectricity(Waterandelectricity waterandelectricity);

    Result delWaterandelectricity(Long id);
}
