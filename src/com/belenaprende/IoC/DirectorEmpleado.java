package com.belenaprende.IoC;

public class DirectorEmpleado implements IEmpleado, ICreacionInformes {
	private ICreacionInformes x;

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

	// metodo init que se encarga de ejecutar tareas antes dq el bean este
	// disponible. El metodo no tiene que llamarse init

	public void metodoInicial() {
		System.out.println("antes que se despache el bean");
	}

	// metodo destroy. tareas después dq el bean haya sido utilizado
	public void metodoFinal() {
		System.out.println("despues que se usó el bean");
	}

}
