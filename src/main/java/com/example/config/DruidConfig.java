//package com.example.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import javax.annotation.PostConstruct;
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class DruidConfig {
//
//    @ConfigurationProperties(prefix= "spring.datasource")
//    @Bean
//    public DataSource druid(){
//        return new DruidDataSource();
//    }
//
//
//    @Bean
//    public FilterRegistrationBean webStatFilter(){
//        FilterRegistrationBean bean=new FilterRegistrationBean();
//        bean.setFilter(new WebStatFilter());
//
//        Map<String,String> initParams=new HashMap<>();
//        initParams.put("exclusions","*.js,*.css,/druid/*");
//
//        bean.setInitParameters(initParams);
//        bean.setUrlPatterns(Arrays.asList("/*"));
//        return bean;
//    }
//
//
//    @PostConstruct
//    public void setProperties(){
//        System.setProperty("druid.mysql.usePingMethod","false");
//    }
//
//}
