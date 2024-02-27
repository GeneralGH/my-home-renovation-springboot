package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Ready;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 准备 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IReadyService extends IService<Ready> {

    Result getList();
}
