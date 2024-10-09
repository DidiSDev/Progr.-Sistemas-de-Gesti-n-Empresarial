import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class panelAbajo extends JPanel {

	
	private JRadioButton opcion1, opcion2, opcion3;
	private JCheckBox opcion4,opcion5,opcion6;
	private JPanel radios, checs, otros;
	private JTextField caja;
	private JComboBox combo;
	private JSpinner spiner;
	private ButtonGroup grupoRadios;
	
	panelAbajo()
	{

		this.setLayout(new GridLayout(1,3));
		opcion1=new JRadioButton("Opción 1");
		opcion1.setEnabled(false);
		opcion2=new JRadioButton("Opción 2");
		opcion2.setEnabled(false);
		opcion3=new JRadioButton("Opción 3");
		opcion3.setEnabled(false);
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
		opcion4.setEnabled(false);
		opcion5=new JCheckBox("Opción 5");
		opcion5.setEnabled(false);
		opcion6=new JCheckBox("Opción 6");
		opcion6.setEnabled(false);
		
		checs=new JPanel(new FlowLayout(FlowLayout.CENTER));
		checs.add(opcion4);
		checs.setEnabled(false);
		checs.add(opcion5);
		checs.setEnabled(false);
		checs.add(opcion6);
		checs.setEnabled(false);
		
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
	}
}
