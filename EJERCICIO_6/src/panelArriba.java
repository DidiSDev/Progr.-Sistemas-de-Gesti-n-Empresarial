import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class panelArriba extends JPanel{

	
	private JRadioButton opcion1, opcion2, opcion3;
	private JCheckBox opcion4,opcion5,opcion6;
	private JPanel radios, checs, otros;
	private JTextField caja;
	private JComboBox combo;
	private JSpinner spiner;
	private ButtonGroup grupoRadios;

	panelArriba()
	{
		this.setLayout(new GridLayout(1,4));
		opcion1=new JRadioButton("Opción 1");
		opcion2=new JRadioButton("Opción 2");
		opcion3=new JRadioButton("Opción 3");
		grupoRadios=new ButtonGroup();
		grupoRadios.add(opcion1);
		grupoRadios.add(opcion2);
		grupoRadios.add(opcion3);
		
		
		
		radios=new JPanel(new FlowLayout(FlowLayout.CENTER));
		radios.add(opcion1);
		radios.add(opcion2);
		radios.add(opcion3);
		
		this.add(radios);
		
		opcion4=new JCheckBox("Opción 4");
		opcion5=new JCheckBox("Opción 5");
		opcion6=new JCheckBox("Opción 6");
		
		checs=new JPanel(new FlowLayout(FlowLayout.CENTER));
		checs.add(opcion4);
		checs.add(opcion5);
		checs.add(opcion6);
		
		this.add(checs);
		
		caja=new JTextField();
		caja.setPreferredSize(new Dimension(100,20));
		combo=new JComboBox();
		combo.setPreferredSize(new Dimension(100,20));
		spiner=new JSpinner();
		spiner.setPreferredSize(new Dimension(100,20));
		otros=new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		
		otros.add(caja);
		otros.add(combo);
		otros.add(spiner);
		
	
		this.add(otros);
		
		JSeparator separador=new JSeparator();
		
	}

	public JRadioButton getOpcion1() {
		return opcion1;
	}

	public void setOpcion1(JRadioButton opcion1) {
		this.opcion1 = opcion1;
	}

	public JRadioButton getOpcion2() {
		return opcion2;
	}

	public void setOpcion2(JRadioButton opcion2) {
		this.opcion2 = opcion2;
	}

	public JRadioButton getOpcion3() {
		return opcion3;
	}

	public void setOpcion3(JRadioButton opcion3) {
		this.opcion3 = opcion3;
	}

	public JCheckBox getOpcion4() {
		return opcion4;
	}

	public void setOpcion4(JCheckBox opcion4) {
		this.opcion4 = opcion4;
	}

	public JCheckBox getOpcion5() {
		return opcion5;
	}

	public void setOpcion5(JCheckBox opcion5) {
		this.opcion5 = opcion5;
	}

	public JCheckBox getOpcion6() {
		return opcion6;
	}

	public void setOpcion6(JCheckBox opcion6) {
		this.opcion6 = opcion6;
	}

	public JPanel getRadios() {
		return radios;
	}

	public void setRadios(JPanel radios) {
		this.radios = radios;
	}

	public JPanel getChecs() {
		return checs;
	}

	public void setChecs(JPanel checs) {
		this.checs = checs;
	}

	public JPanel getOtros() {
		return otros;
	}

	public void setOtros(JPanel otros) {
		this.otros = otros;
	}

	public JTextField getCaja() {
		return caja;
	}

	public void setCaja(JTextField caja) {
		this.caja = caja;
	}

	public JComboBox getCombo() {
		return combo;
	}

	public void setCombo(JComboBox combo) {
		this.combo = combo;
	}

	public JSpinner getSpiner() {
		return spiner;
	}

	public void setSpiner(JSpinner spiner) {
		this.spiner = spiner;
	}

	public ButtonGroup getGrupoRadios() {
		return grupoRadios;
	}

	public void setGrupoRadios(ButtonGroup grupoRadios) {
		this.grupoRadios = grupoRadios;
	}
	
}
