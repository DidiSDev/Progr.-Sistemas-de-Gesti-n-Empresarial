import java.awt.Color;

import javax.swing.*;
import javax.swing.border.Border;
public class panelDch extends JPanel {

	
	private JLabel labelImagen;
	private ImageIcon imagen;
	private int contador=1;
	Ventana v;
	
	panelDch(Ventana ventana)
	{
		v=ventana;
		//LAS IMAGENES VAN A IR CONTENIDAS EN UN JLABEL
		 labelImagen=new JLabel();
		
		 //INSTANCIAMOS LA IMAGEN COGIENDO LA PRIMERA DESDE LA CARPETA
		 imagen=new ImageIcon(getClass().getResource("/imagenes/1.gif"));
		 
		 labelImagen.setIcon(imagen);
		 
		 //CREO UN BORDE CUALQUIER:
		 
		 Border borde = BorderFactory.createLineBorder(Color.GREEN, 5);
		 
		 labelImagen.setBorder(borde);
		 this.add(labelImagen);
	}
	
	public void siguienteImagen()
	{
		contador++;
		
		switch (contador)
		{
		case 2:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/2.gif")));
			break;
		case 3:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/3.gif")));
			break;
		case 4:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/4.gif")));
			break;
		case 5:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/5.gif")));
			break;
		case 6:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/6.gif")));
			break;
		case 7:
			labelImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/7.gif")));

			Border borde = BorderFactory.createLineBorder(Color.RED, 5);
			labelImagen.setBorder(borde);
			break;
		}
	}
}
