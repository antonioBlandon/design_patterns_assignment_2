package co.com.texteditor.modelo;

import java.awt.*;

public class Caracter {
	
	private char representacion;
	private int tamanio;
	private String fuente;
	private Color color;
	
	public Caracter(char representacion) {
		this.representacion = representacion;
	}
	
	public Caracter(char representacion, String fuente, Color color, int tamanio) {
		this(representacion);
		this.fuente = fuente;
		this.color = color;
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public char getRepresentacion() {
		return representacion;
	}
	
}
