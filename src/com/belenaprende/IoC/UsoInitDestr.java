package com.belenaprende.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoInitDestr {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext3.xml");

		DirectorEmpleado director = cont.getBean("miEmpleado", DirectorEmpleado.class);

		System.out.println(director.getInforme());
		cont.close();
	}

}
