package com.syy.myhome.service;

import com.syy.myhome.common.Result;
import com.syy.myhome.entity.Sealant;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 美缝 服务类
 * </p>
 *
 * @author laoyang
 * @since 2024-02-27
 */
public interface ISealantService extends IService<Sealant> {

    Result getList();

    Result addSealant(Sealant sealant);

    Result updateSealant(Sealant sealant);

    Result delSealant(Long id);
}
