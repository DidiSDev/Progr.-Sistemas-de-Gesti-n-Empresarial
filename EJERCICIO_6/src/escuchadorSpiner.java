import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class escuchadorSpiner implements ChangeListener {

	private Ventana v;
	public escuchadorSpiner(Ventana ventana) 
	{
		v=ventana;
	}

	public void stateChanged(ChangeEvent e) 
	{
		Object source= e.getSource();
		
		 if (source==v.panelArriba.getSpiner())
		{
			v.panelAbajo.getSpiner().setValue(v.panelArriba.getSpiner().getValue());
		}
	}

}
