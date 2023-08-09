package com.belenaprende.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		// creacion de objetos de tipo empleado

//		IEmpleado empleado1 = new JefeEmpleado();
//		IEmpleado empleado2 = new SecretarioEmpleado();
//		IEmpleado empleado3 = new DirectorEmpleado();
//
//		// uso de los objetos creados
//		System.out.println(empleado1.getTareas());
//		System.out.println(empleado2.getTareas());
//		System.out.println(empleado3.getTareas());

		// usando Spring

		// crear un contexto

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// pedir el bean ( el objeto) en metodo getbean te pide dos argumentos. el
		// alias, que es el id con el que se guardo en el archivo xml
		// el segundo argumento es la interface

		IEmpleado Juan = (IEmpleado) contexto.getBean("miEmpleado", IEmpleado.class);
		
		//usar el bean
		System.out.println(Juan.getTareas());
		
		//Cerrar el xml cuando se termina de usar el bean 
		
		contexto.close();
	}

}
