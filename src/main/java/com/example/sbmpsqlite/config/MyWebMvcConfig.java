package com.example.sbmpsqlite.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class MyWebMvcConfig implements WebMvcConfigurer {

    private String filePath = "C:/Users/asus/Documents/HBuilderProjects/TrainNoteForMobile/TrainMask_ver1.0/static";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/view/**").addResourceLocations("file:"+filePath+"/");
    }
}