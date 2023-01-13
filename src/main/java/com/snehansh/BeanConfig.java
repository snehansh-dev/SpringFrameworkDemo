package com.snehansh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.snehansh")
public class BeanConfig {

    @Bean
    public Nurse nurse(){
        return  new Nurse();
    }
}
