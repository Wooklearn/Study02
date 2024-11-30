package com.ohgiraffers.crudtest.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.crudtest")
@MapperScan(basePackages = "com.ohgiraffers.crudtest", annotationClass = Mapper.class)
public class ContextConfig {

}
