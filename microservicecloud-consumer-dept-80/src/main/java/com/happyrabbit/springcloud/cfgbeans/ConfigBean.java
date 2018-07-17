package com.happyrabbit.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration 的作用就是 boot里的 spring  applicationContext.xml
 * 
 */

@Configuration
public class ConfigBean {
	
	@Bean	
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
