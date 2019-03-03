package co.com.texteditor.modelo;

public enum EnumFuentes {

	ARIAL ("Arial"),
	TIMES_NEW_ROMAM("Times New Roman"),
	VERDANA ("Verdana"),
	COURIER_NEW ("Courier New"),
	CONSOLAS ("Consolas");
	
	private final String nombre;
	
	EnumFuentes(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
}
