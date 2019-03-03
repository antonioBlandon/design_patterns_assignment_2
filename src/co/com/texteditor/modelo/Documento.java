package co.com.texteditor.modelo;

import co.com.texteditor.modelo.Caracter.MyCharacter;

import java.util.ArrayList;
import java.util.List;

public class Documento {

	private List<MyCharacter> characters;

	public Documento() {
		characters = new ArrayList<>();
	}

	public void agregarCaracter(MyCharacter myCharacter) {
		characters.add(myCharacter);
	}

	public void borrarCaracter(int posicion) {
		characters.remove(posicion);
	}
	
}
