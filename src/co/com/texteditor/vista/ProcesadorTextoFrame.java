package co.com.texteditor.vista;

import co.com.texteditor.modelo.Caracter;
import co.com.texteditor.modelo.Caracter1.Extras;
import co.com.texteditor.modelo.Caracter1.MyCharacter;
import co.com.texteditor.modelo.ProcesadorTexto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ProcesadorTextoFrame extends JFrame {

	private JPanel contentPane;
	
	private ProcesadorTexto procesador;
	private PanelOpciones panelOpciones;
	private PanelEditor panelEditor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcesadorTextoFrame frame = new ProcesadorTextoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProcesadorTextoFrame() {
		procesador = new ProcesadorTexto();
		setTitle("Ejemplo Procesador de Texto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelOpciones = new PanelOpciones(this);
		contentPane.add(panelOpciones, BorderLayout.NORTH);
		
		panelEditor = new PanelEditor(this);
		contentPane.add(panelEditor, BorderLayout.CENTER);
	}
	
	public void agregarCaracterADocumento(char c) {
		String fuente = panelOpciones.getFuente().toString();
		Color color = panelOpciones.getColor();
		int tamanio = panelOpciones.getTamanio();
		//Caracter caracter = new Caracter(c, fuente, color, tamanio);
		MyCharacter myCharacter = new MyCharacter(c, new Extras(fuente, color, tamanio));
		procesador.agregarCaracterADocumento(myCharacter);
		panelEditor.refrescarEditor(myCharacter);
		
	}

	
}
