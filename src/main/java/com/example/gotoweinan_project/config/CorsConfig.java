package com.example.gotoweinan_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Author：xsr
 * @name：CorsConfig
 * @Date：2023/7/10 9:29
 * @Filename：CorsConfig
 */
@Configuration
public class CorsConfig {
    private static final long Max_Age=24*60*60;//当前跨域请求最大有效时长,默认一天
    @Bean
    public CorsFilter CorsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*");//设置访问原地址
        configuration.addAllowedHeader("*");//设置访问原请求头
        configuration.addAllowedMethod("*");//设置访问原请求方法
        configuration.setMaxAge(Max_Age);
        source.registerCorsConfiguration("/**",configuration);//对接口配置跨域设置
        return new CorsFilter(source);
    }
}
