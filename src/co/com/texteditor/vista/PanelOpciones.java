package co.com.texteditor.vista;

import co.com.texteditor.modelo.EnumFuentes;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOpciones extends JPanel {
	
	private JTextField txtTamanio;
	private ProcesadorTextoFrame frame;
	private JComboBox<EnumFuentes> cbFuente;
	private JButton btnColor;
	
	public PanelOpciones(ProcesadorTextoFrame frame) {
		this();
		this.frame = frame;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelOpciones() {
		setBorder(new LineBorder(Color.GRAY));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		JLabel lblFuente = new JLabel("Fuente:");
		add(lblFuente);
		
		cbFuente = new JComboBox<EnumFuentes>();
		cbFuente.setModel(new DefaultComboBoxModel<EnumFuentes>(EnumFuentes.values()));
		add(cbFuente);
		
		JLabel lblColor = new JLabel("Color:");
		add(lblColor);
		
		btnColor = new JButton("");
		btnColor.setBackground(Color.BLACK);
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = JColorChooser.showDialog(frame, "Seleccionar color de letra", Color.BLACK);
				btnColor.setBackground(color);
			}
		});
		btnColor.setPreferredSize(new Dimension(33, 33));
		add(btnColor);
		
		JLabel lblTamao = new JLabel("Tama�o:");
		add(lblTamao);
		
		txtTamanio = new JTextField();
		txtTamanio.setText("10");
		add(txtTamanio);
		txtTamanio.setColumns(10);

	}
	
	public EnumFuentes getFuente() {
		return  cbFuente.getItemAt(cbFuente.getSelectedIndex());
	}

	public Color getColor() {
		return btnColor.getBackground();
	}
	
	public int getTamanio() {
		return Integer.parseInt(txtTamanio.getText());
	}
}
