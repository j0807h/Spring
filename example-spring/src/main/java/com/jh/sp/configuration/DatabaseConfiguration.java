package com.jh.sp.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
	
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource") 
		// DB 연동을 위함. application.properties에서 spring.datasource라는 이름으로 사용.
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
