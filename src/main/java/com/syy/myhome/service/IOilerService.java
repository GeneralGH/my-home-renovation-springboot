package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Oiler;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 油工 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface IOilerService extends IService<Oiler> {

    Result getList();

    Result addOiler(Oiler oiler);

    Result updateOiler(Oiler oiler);

    Result delOiler(Long id);
}
