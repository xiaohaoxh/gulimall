package com.ncu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ncu.common.utils.PageUtils;
import com.ncu.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:44:53
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

