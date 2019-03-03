package co.com.texteditor.modelo;

import co.com.texteditor.modelo.Caracter1.MyCharacter;

import java.util.ArrayList;
import java.util.List;

public class Documento {
	
	//private List<Caracter> caracteres;
	private List<MyCharacter> characters;

	public Documento() {
		characters = new ArrayList<MyCharacter>();
	}
	
	/*public void agregarCaracter(Caracter caracter) {
		caracteres.add(caracter);
	}*/

	public void agregarCaracter(MyCharacter myCharacter) {
		characters.add(myCharacter);
	}

	public void borrarCaracter(int posicion) {
		characters.remove(posicion);
	}
	
}
