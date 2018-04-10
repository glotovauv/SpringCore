package com.nc.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {
    @Bean(name = "myQuoter")
    public Quoter quoter1() {
        return new MyQuoter();
    }

    @Bean(name = "terminatorQuoter")
    public Quoter quoter2() {
        return new TerminatorQuoter();
    }

    @Bean
    public Library library() {
        return new Library();
    }

    @Bean
    InjectRandomIntAnnotationBeanPostProcessor getBean() {
        return new InjectRandomIntAnnotationBeanPostProcessor();
    }
}
