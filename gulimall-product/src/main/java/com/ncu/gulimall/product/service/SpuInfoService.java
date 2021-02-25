package com.ncu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ncu.common.utils.PageUtils;
import com.ncu.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:02:14
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

