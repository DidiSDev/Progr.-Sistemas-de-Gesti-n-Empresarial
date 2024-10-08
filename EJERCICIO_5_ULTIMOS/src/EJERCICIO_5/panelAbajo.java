package EJERCICIO_5;
import java.awt.FlowLayout;

import javax.swing.*;
public class panelAbajo extends JPanel {

	
	private JLabel label;
	private JComboBox comboModulos;
	
	panelAbajo()
	{
		this.setLayout(new FlowLayout());
		label=new JLabel("MODULOS:");
		comboModulos=new JComboBox();
		
		this.add(label);
		this.add(comboModulos);
		//AQUÍ NO AÑADO EL COMBO, PORQUE ESO SOLAMENTE SE PUEDE HACER TRAS LA ASIGNACIÓN
		
		
	}
	public void rellenarComboAsir()
	{
		
		comboModulos.addItem("Implantación de Sistemas");
		comboModulos.addItem("Lenguaje de Marcas");
		comboModulos.addItem("Redes");
		comboModulos.addItem("Fundamentos del HW");
		comboModulos.addItem("Gestión de Bases de Datos");
		comboModulos.addItem("FOL");
		}
	public void rellenarComboDam() {

		comboModulos.addItem("Programación");
		comboModulos.addItem("Lenguaje de Marcas");
		comboModulos.addItem("Entornos de Desarrollo");
		comboModulos.addItem("Sistemas Operativos");
		comboModulos.addItem("Bases de Datos");
		comboModulos.addItem("FOL");
	}
	
	//ERROR GRAVÍSIMO, HAY QUE VOLVER A AGREGAR EL NUEVO COMBOMODULOS AL PANEL:
	
	public void agregarCombo()
	{
		this.add(comboModulos);
	}

	public void clearComboModulos() 
	{
        comboModulos.removeAllItems(); 
    }	

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JComboBox getComboModulos() {
		return comboModulos;
	}

	public void setComboModulos(JComboBox comboModulos) {
		this.comboModulos = comboModulos;
	}
	
}
