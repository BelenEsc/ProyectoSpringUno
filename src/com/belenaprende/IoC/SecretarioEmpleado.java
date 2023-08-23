package com.belenaprende.IoC;

public class SecretarioEmpleado implements IEmpleado {

	private ICreacionInformes informe;
	private String email;
	private String nombreEmpresa;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @param informe the informe to set
	 */
	public void setInforme(ICreacionInformes informe) {
		this.informe = informe;
	}

	/**
	 * @param informe the informe to set
	 */
	public void setInformeNuevo(ICreacionInformes informe) {
		this.informe = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "yo no";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "este es el informe del secretario" + informe.getInforme();
	}

}
