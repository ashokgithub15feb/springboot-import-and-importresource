package com.nineleaps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nineleaps.bean.BeanA;

@Configuration
public class ConfigA {

	@Bean
	public BeanA getBeanA() {
		return new BeanA();
	}
}
