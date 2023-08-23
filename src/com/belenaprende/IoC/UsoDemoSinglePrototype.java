package com.belenaprende.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSinglePrototype {

	public static void main(String[] args) {

		// crear el contexto. el xml de configuracion

		ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// pedir beans al contenedor spring, dos beans de la misma clase

		SecretarioEmpleado empleado1 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado2 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado3 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado4 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado5 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado6 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado7 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		SecretarioEmpleado empleado8 = (SecretarioEmpleado) cont.getBean("miSecretarioEmpleado",
				SecretarioEmpleado.class);
		// POR DEFECTO, SPRING USA EL SINGLETON, LO QUE QUIERE DECIR QUE AMBOS OBJETOS
		// EMPLEADO1 Y 2, SON EL MISMO OBJETO. Y PARA COMPROBAR VAMOS A VER EL ESPACIO
		// QUE ESTA OCUPADO CADA OBJETO
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);
		System.out.println(empleado4);
		System.out.println(empleado5);
		System.out.println(empleado6);
		System.out.println(empleado7);
		System.out.println(empleado8);

//		if (empleado1 == empleado2) {
//			System.out.println("lo mismo");
//		}
	}

}
