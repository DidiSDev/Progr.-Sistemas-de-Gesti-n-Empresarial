import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Ventana extends JFrame {

	
	private panelIzq panelIzq;
	private panelDch panelDch;
	private JLabel labelArriba;

	
	Ventana()
	{
		this.setLayout(new BorderLayout());
		this.setLocation(500,300);
		this.setSize(430,330);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Juego del Ahorcado");
		
		//ASUNTOS DEL LABEL
		asuntosLabel();
		
		//PANELES
		panelIzq=new panelIzq(this);
		panelDch=new panelDch(this);
		
		this.getContentPane().add(panelIzq, BorderLayout.WEST);
		this.getContentPane().add(panelDch, BorderLayout.EAST);
		
		
		
		this.setVisible(true);
	}


	private void asuntosLabel() 
	{
		labelArriba=new JLabel("Menú");
		//IMPORTANTISIMO EL .setBorder (new EmptyBorder (arriba, izq, abajo, derecha);
		labelArriba.setBorder(new EmptyBorder(10, 10,0,0));
		
		this.getContentPane().add(labelArriba, BorderLayout.NORTH);	
	}


	public panelIzq getPanelIzq() {
		return panelIzq;
	}


	public void setPanelIzq(panelIzq panelIzq) {
		this.panelIzq = panelIzq;
	}


	public panelDch getPanelDch() {
		return panelDch;
	}


	public void setPanelDch(panelDch panelDch) {
		this.panelDch = panelDch;
	}


	public JLabel getLabelArriba() {
		return labelArriba;
	}


	public void setLabelArriba(JLabel labelArriba) {
		this.labelArriba = labelArriba;
	}
	
}
