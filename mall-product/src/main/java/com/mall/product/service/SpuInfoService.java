package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author disagi
 * @email deweihuang6@gmail.com
 * @date 2021-06-12 19:57:36
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

