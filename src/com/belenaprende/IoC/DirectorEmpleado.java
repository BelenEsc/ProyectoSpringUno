package com.belenaprende.IoC;

public class DirectorEmpleado implements IEmpleado, ICreacionInformes {
	ICreacionInformes x;

	public DirectorEmpleado(ICreacionInformes x) {
		super();
		this.x = x;
		x.getInforme();
	}

	public String getTareas() {
		// TODO Auto-generated method stub
		return "soy director";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado en la clase director empleado " + x.getInforme();
	}

}
