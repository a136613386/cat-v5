package com.v5.catv5productservices.conf;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class CommonConf {

    @Bean
    public PageHelper pageHelper(){
        PageHelper page=new PageHelper();
        Properties pro=new Properties();
        //配置方言
        pro.setProperty("dialect","mysql");
        //是否合理化
        pro.setProperty("reasonable","true");
        page.setProperties(pro);
        return page;

    }

}
