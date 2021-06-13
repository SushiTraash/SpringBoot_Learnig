package com.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author disagi
 * @email deweihuang6@gmail.com
 * @date 2021-06-13 11:03:14
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

