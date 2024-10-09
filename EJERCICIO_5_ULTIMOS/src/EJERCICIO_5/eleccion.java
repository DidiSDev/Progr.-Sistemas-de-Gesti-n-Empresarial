package EJERCICIO_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eleccion implements ActionListener {

	private panelArriba panelArriba;
	Ventana ven;
	eleccion(panelArriba panelArriba2, Ventana v)
	{
		panelArriba=panelArriba2;
		ven=v;
	}
	
	/*public void actionPerformed(ActionEvent e) 
	{
        String comando = (String) panelArriba.getComboBox().getSelectedItem();

        if (comando.equals("DAM")) 
        {
            ven.rellenarDam();
        } 
        else if (comando.equals("ASIR")) 
        {
            ven.rellenarAsir();
        }
    }*/
	
	public void actionPerformed(ActionEvent e) 
	{
		
		//ESTÁ BIEN NO USAR COMANDO??
	
		if (panelArriba.getComboBox().getSelectedItem().equals("DAM"))
		{
			ven.rellenarDam();
		}
		else if(panelArriba.getComboBox().getSelectedItem().equals("ASIR"))
		{
			ven.rellenarAsir();
		}

		
	}

}
