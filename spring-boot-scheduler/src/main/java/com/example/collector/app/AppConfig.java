package com.example.collector.app;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@PropertySource("classpath:config/app-config.properties")
@ComponentScan(basePackages = { "com.example.collector.task" })
public class AppConfig {
    @Bean
    public Executor getTaskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}
