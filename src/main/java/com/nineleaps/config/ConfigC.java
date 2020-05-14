package com.nineleaps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.nineleaps.bean.BeanC;

@Configuration
@Import(value = {ConfigA.class})
@ImportResource(locations = {"configB.xml"})
public class ConfigC {

	@Bean
	public BeanC getBeanC()
	{
		return new BeanC();
	}
}
