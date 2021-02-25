package com.ncu.gulimall.product.dao;

import com.ncu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaohao
 * @email 1037432782@qq.com
 * @date 2021-02-25 18:02:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
