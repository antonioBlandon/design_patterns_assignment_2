package co.com.texteditor.vista;

import co.com.texteditor.modelo.Caracter;
import co.com.texteditor.modelo.Caracter1.MyCharacter;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelEditor extends JPanel {
	private ProcesadorTextoFrame frame;
	
	private JTextPane tpEditor;
	
	SimpleAttributeSet aSet;
	
	public PanelEditor(ProcesadorTextoFrame frame) {
		this();
		this.frame = frame;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelEditor() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		tpEditor = new JTextPane();
		tpEditor.setEditable(false);
		scrollPane.setViewportView(tpEditor);
		
		tpEditor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				frame.agregarCaracterADocumento(c);
			}
		});
		
		 aSet = new SimpleAttributeSet();
	}

	public void refrescarEditor(MyCharacter myCharacter) {
		StyleConstants.setFontFamily(aSet, myCharacter.getExtras().getFont());
		StyleConstants.setFontSize(aSet, myCharacter.getExtras().getSize());
		StyleConstants.setForeground(aSet, myCharacter.getExtras().getColor());
		
		StyledDocument doc = tpEditor.getStyledDocument();
		try {
			doc.insertString(doc.getLength(), Character.toString(myCharacter.getRepresentation()), aSet);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
}
