package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author disagi
 * @email deweihuang6@gmail.com
 * @date 2021-06-12 19:57:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
