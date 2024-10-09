import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class escuchador implements ActionListener {

	
	Ventana ven;
	escuchador(Ventana v)
	{
		ven=v;
	}
	public void actionPerformed(ActionEvent e) 
	{
		String nombre=e.getActionCommand();
		
		if (nombre.equals(ven.panelArriba.getOpcion1().getText().toString()))
		{
			if (ven.panelArriba.getOpcion1().isSelected())
			{
				ven.panelAbajo.getOpcion1().setSelected(true);
			}
		}
		else if (nombre.equals(ven.panelArriba.getOpcion2().getText().toString()))
		{
			if (ven.panelArriba.getOpcion2().isSelected())
			{
				ven.panelAbajo.getOpcion2().setSelected(true);
			}
		}
		else if (nombre.equals(ven.panelArriba.getOpcion3().getText().toString()))
		{
			if (ven.panelArriba.getOpcion3().isSelected())
			{
				ven.panelAbajo.getOpcion3().setSelected(true);
			}
		}
		else if (nombre.equals(ven.panelArriba.getOpcion4().getText().toString()))
		{
			if (ven.panelArriba.getOpcion4().isSelected())
			{
				ven.panelAbajo.getOpcion4().setSelected(true);
			}
			else if (!ven.panelArriba.getOpcion4().isSelected())
			{
				ven.panelAbajo.getOpcion4().setSelected(false);
			}
		}
		else if (nombre.equals(ven.panelArriba.getOpcion5().getText().toString()))
		{
			if (ven.panelArriba.getOpcion5().isSelected())
			{
				ven.panelAbajo.getOpcion5().setSelected(true);
			}
			else if (!ven.panelArriba.getOpcion5().isSelected())
			{
				ven.panelAbajo.getOpcion5().setSelected(false);
			}
		}
		
		else if (nombre.equals(ven.panelArriba.getOpcion6().getText().toString()))
		{
			if (ven.panelArriba.getOpcion6().isSelected())
			{
				ven.panelAbajo.getOpcion6().setSelected(true);
			}
			else if (!ven.panelArriba.getOpcion6().isSelected())
			{
				ven.panelAbajo.getOpcion6().setSelected(false);
			}
		}
		else if (e.getSource()==ven.panelArriba.getCaja())
		{
			//DUDA IMPORTANTE, NO ENTIENDO POR QUÉ NO SE REFLEJA INSTANTÁNEAMENTE
			//TENGO QUE DAR INTRO PARA QUE FUNCIONE
			
			ven.panelAbajo.getCaja().setText(ven.panelArriba.getCaja().getText().toString());
		}
		
		
		else if (e.getSource()==ven.panelArriba.getCombo())
		{
			//LO PASO A STRING PQ NO FUCNIONA
			String item=ven.panelArriba.getCombo().getSelectedItem().toString();
			
			
			//LIMPIO
			ven.panelAbajo.getCombo().removeAllItems();
			//LE AÑADO AL COMBO
			ven.panelAbajo.getCombo().addItem(item);
			//LE OBLIGO A SELECCIONAR EL AÑADIDO
			ven.panelAbajo.getCombo().setSelectedItem(item);
		}
		
		
		

	}

}
