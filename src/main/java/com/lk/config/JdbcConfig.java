package com.lk.config;

import com.lk.pojo.D3;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public D3 gD3() {
        return new D3();
    }
}

