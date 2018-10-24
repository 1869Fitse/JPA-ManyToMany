package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ConstructorInjection;
import com.example.controller.PropertyInjector;
import com.example.controller.SetterInjection;

@SpringBootApplication
@ComponentScan({"com.example.controller","service"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=
				
		SpringApplication.run(DemoApplication.class, args);
		
		ConstructorInjection cont = (ConstructorInjection) context
				.getBean("constructorInjection");
		cont.booking();
		SetterInjection set = context.getBean(SetterInjection.class);
		set.booking();
		
		PropertyInjector prop = context.getBean(PropertyInjector.class);
		prop.booking();
	}
}




