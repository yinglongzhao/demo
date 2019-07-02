package com.example.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration // 通过该注解来表明该类是一个Spring的配置，相当于一个xml文件
public class SpringConfig {

    @Value("${spring.profiles.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.profiles.datasource.driver-class-name}")
    private String jdbcDriverClassName;

    @Value("${spring.profiles.datasource.username}")
    private String jdbcUsername;

    @Value("${spring.profiles.datasource.password}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource boneCPDataSource = new DruidDataSource();
        // 数据库驱动
        boneCPDataSource.setDriverClassName(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        boneCPDataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        boneCPDataSource.setUsername(jdbcUsername);
        // 数据库的密码
        boneCPDataSource.setPassword(jdbcPassword);
        return boneCPDataSource;
    }

}
