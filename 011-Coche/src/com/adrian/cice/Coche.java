package com.adrian.cice;

public class Coche {
	
	private String modelo = "Seat", color = "azul alor", matricula = "1234AAA", tipoCoche = "familiar", seguro = "terceros",
			pinturaMetalizada = "Si";
	
	private int añoFabricacion = 2014;
	
	
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coche(String modelo, String color, String matricula, String tipoCoche, String seguro,
			String pinturaMetalizada, int añoFabricacion) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.matricula = matricula;
		this.tipoCoche = tipoCoche;
		this.seguro = seguro;
		this.pinturaMetalizada = pinturaMetalizada;
		this.añoFabricacion = añoFabricacion;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the tipoCoche
	 */
	public String getTipoCoche() {
		return tipoCoche;
	}
	/**
	 * @param tipoCoche the tipoCoche to set
	 */
	public void setTipoCoche(String tipoCoche) {
		this.tipoCoche = tipoCoche;
	}
	/**
	 * @return the seguro
	 */
	public String getSeguro() {
		return seguro;
	}
	/**
	 * @param seguro the seguro to set
	 */
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	/**
	 * @return the pinturaMetalizada
	 */
	public String getPinturaMetalizada() {
		return pinturaMetalizada;
	}
	/**
	 * @param pinturaMetalizada the pinturaMetalizada to set
	 */
	public void setPinturaMetalizada(String pinturaMetalizada) {
		this.pinturaMetalizada = pinturaMetalizada;
	}
	/**
	 * @return the añoFabricacion
	 */
	public int getAñoFabricacion() {
		return añoFabricacion;
	}
	/**
	 * @param añoFabricacion the añoFabricacion to set
	 */
	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	
	
	
	
	
	

}
