package com.dev.swag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dev.swag.Entity.MstEmployeeBo;

@SpringBootApplication
public class JavaDeveloperApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(JavaDeveloperApplication.class, args);
		
		MstEmployeeBo mstBo=context.getBean(MstEmployeeBo.class);
		
		MstEmployeeBo mstBo1=context.getBean(MstEmployeeBo.class);

		//mstBo.show();
		
		System.out.println(" welcome to spring boot");
		
	}

}
