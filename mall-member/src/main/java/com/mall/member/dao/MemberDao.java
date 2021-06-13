package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author disagi
 * @email deweihuang6@gmail.com
 * @date 2021-06-13 10:49:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
