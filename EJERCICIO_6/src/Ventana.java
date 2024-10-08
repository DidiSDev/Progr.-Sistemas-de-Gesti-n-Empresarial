import java.awt.GridLayout;

import javax.swing.*;
public class Ventana extends JFrame{

	
	panelArriba panelArriba;
	panelAbajo panelAbajo;
	JSeparator separador;
	
	Ventana()
	{
		this.setLayout(new GridLayout(3,1));
		this.setLocation(500, 300);
		this.setSize(360,320);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		panelArriba =new panelArriba();
		panelAbajo=new panelAbajo();
		
		this.getContentPane().add(panelArriba);
		this.getContentPane().add(separador=new JSeparator());
		this.getContentPane().add(panelAbajo);
		
		panelArriba.getOpcion1().addActionListener(new escuchador(this));
		panelArriba.getOpcion2().addActionListener(new escuchador(this));
		panelArriba.getOpcion3().addActionListener(new escuchador(this));
		panelArriba.getOpcion4().addActionListener(new escuchador(this));
		panelArriba.getOpcion5().addActionListener(new escuchador(this));
		panelArriba.getOpcion6().addActionListener(new escuchador(this));
		panelArriba.getCaja().addActionListener(new escuchador(this));
		panelArriba.getCombo().addActionListener(new escuchador(this));
		panelArriba.getSpiner().addChangeListener(new escuchadorSpiner(this));
		
		
		
		
		this.setVisible(true);
	}
}
