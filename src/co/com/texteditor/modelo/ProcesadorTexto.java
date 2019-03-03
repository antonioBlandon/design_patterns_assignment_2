package co.com.texteditor.modelo;

import co.com.texteditor.modelo.Caracter1.MyCharacter;
import co.com.texteditor.modelo.Recycler.Recycler;

public class ProcesadorTexto {
	private Documento documento;
	private Recycler recycler;
	
	public ProcesadorTexto() {
		documento = new Documento();
		recycler = new Recycler();
	}
	
	/*public void agregarCaracterADocumento(Caracter caracter) {
		documento.agregarCaracter(caracter);
	}*/

	public void agregarCaracterADocumento(MyCharacter character) {
		documento.agregarCaracter(recycler.addNew(character));
	}
}
