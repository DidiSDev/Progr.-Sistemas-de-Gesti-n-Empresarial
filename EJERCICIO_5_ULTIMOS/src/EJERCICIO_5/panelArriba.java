package EJERCICIO_5;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JPanel;

public class panelArriba extends JPanel {

	
	private JLabel label;
	private JComboBox comboBox;
	Ventana v;

	panelArriba(Ventana ventana)
	{
		v=ventana;
		this.setLayout(new FlowLayout());
		
		label=new JLabel("CICLO FORMATIVO:");
		comboBox=new JComboBox();
		
		añadirComboBox();
		
		this.add(label);
		this.add(comboBox);
		comboBox.addActionListener(new eleccion(this, v));
		
	}
	
	
	public void añadirComboBox()
	{
		comboBox.addItem("DAM");
		comboBox.addItem("ASIR");
	}


	public JLabel getLabel() {
		return label;
	}


	public void setLabel(JLabel label) {
		this.label = label;
	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
}
