package com.nineleaps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nineleaps.bean.BeanA;
import com.nineleaps.bean.BeanB;
import com.nineleaps.bean.BeanC;
import com.nineleaps.config.ConfigC;

@SpringBootApplication
public class SpringbootImportAndImportresourceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootImportAndImportresourceApplication.class, args);
		
		AnnotationConfigApplicationContext context = 
	            new AnnotationConfigApplicationContext(ConfigC.class);

	      BeanA beanA=context.getBean(BeanA.class);
	      beanA.doSomething();
	      
	      BeanB beanB=context.getBean(BeanB.class);
	      beanB.doSomething();
	      
	      BeanC beanC=context.getBean(BeanC.class);
	      beanC.doSomething();
	      
	      context.close();
	}

}
