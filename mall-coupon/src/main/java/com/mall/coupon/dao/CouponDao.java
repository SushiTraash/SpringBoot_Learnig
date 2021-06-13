package com.mall.coupon.dao;

import com.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author disagi
 * @email deweihuang6@gmail.com
 * @date 2021-06-13 10:32:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
