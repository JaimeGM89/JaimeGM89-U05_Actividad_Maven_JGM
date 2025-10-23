package com.utad.dadu.model;

public class JugadorBalonMano {

	private String nombre;
	private int dorsal;
	private int anotacion;
	private int bloqueo;
	private int tiempoJugado;

	public JugadorBalonMano(String nombre, int dorsal) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.anotacion = anotacion;
		this.bloqueo = bloqueo;
		this.tiempoJugado = tiempoJugado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public int getAnotacion() {
		return anotacion;
	}

	public int getBloqueo() {
		return bloqueo;
	}

	public int getTiempoJugado() {
		return tiempoJugado;
	}

	public void setAnotacion(int anotacion) {
		this.anotacion = anotacion;
	}

	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	public void setTiempoJugado(int tiempoJugado) {
		this.tiempoJugado = tiempoJugado;
	}

	@Override
	public String toString() {
		return "JugadorBalonMano [nombre=" + nombre + ", dorsal=" + dorsal + ", anotacion=" + anotacion + ", bloqueo="
				+ bloqueo + ", tiempoJugado=" + tiempoJugado + "]";
	}

}
