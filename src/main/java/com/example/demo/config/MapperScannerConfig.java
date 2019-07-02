package com.example.demo.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

//@Configuration
//@AutoConfigureAfter(MyBatisConfig.class) //保证在MyBatisConfig实例化之后再实例化该类
public class MapperScannerConfig {

    // mapper接口的扫描器
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.ontime.demosdk.mapper");
        return mapperScannerConfigurer;
    }
}
