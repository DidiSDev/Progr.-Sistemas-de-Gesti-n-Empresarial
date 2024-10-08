package EJERCICIO_5;
import java.awt.FlowLayout;

import javax.swing.*;
public class Ventana extends JFrame{

	private panelArriba panelArriba;
	private panelAbajo panelAbajo;
	private JComboBox comboModulos=new JComboBox();
	
	Ventana()
	{
		//EL PANEL DE CICLO FORMATIBO CON EL COMBOBOX SON 3 PANELES
		//el de modulos con programacion son otros tres
		//PERO ME VOY A ARRIESGAR A SIMPLIFICARLO Y NO HACER TRES
		this.setLayout(new FlowLayout());
		this.setLocation(600, 400);
		this.setSize(300,195);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panelArriba=new panelArriba(this);
		//panelArriba YA TIENE UN LAYOUT AL CENTRO
		this.getContentPane().add(panelArriba);
		this.getContentPane().add(panelAbajo=new panelAbajo());
		
		
		this.setVisible(true);
		
		
	}
	
	public void rellenarDam()
	{
		panelAbajo.clearComboModulos();
		panelAbajo.rellenarComboDam();
		//panelAbajo.setComboModulos(comboModulos);
		//panelAbajo.agregarCombo();
	}
	public void rellenarAsir()
	{
		panelAbajo.clearComboModulos();
		panelAbajo.rellenarComboAsir();
		//panelAbajo.setComboModulos(comboModulos);
		//panelAbajo.agregarCombo();
	}

	public panelArriba getPanelArriba() {
		return panelArriba;
	}

	public void setPanelArriba(panelArriba panelArriba) {
		this.panelArriba = panelArriba;
	}

	public panelAbajo getPanelAbajo() {
		return panelAbajo;
	}

	public void setPanelAbajo(panelAbajo panelAbajo) {
		this.panelAbajo = panelAbajo;
	}
	public JComboBox getComboModulos() {
		return comboModulos;
	}
	public void setComboModulos(JComboBox comboModulos) {
		this.comboModulos = comboModulos;
	}
	
	
}
