package com.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用脚手架生成的模板
 * 1. 整合mybatis-plus
 *      导入依赖
 *
 *      配置
 *          配置数据源
 *              导入驱动，配置数据源url等信息
 *          配置mybatis-plus
 *              使用mapperScan
 *              设置sql映射文件位置
 *
 */
@MapperScan("com.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
