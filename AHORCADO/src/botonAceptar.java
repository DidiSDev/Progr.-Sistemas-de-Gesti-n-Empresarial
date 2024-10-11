import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class botonAceptar implements ActionListener {

	private Ventana ventana;
	private int contador2=0;
	
	//TENGO QUE ALMACENAR LAS LETRAS CORRECTAS PARA QUE NO PUEDA REPTEIRLAS
	ArrayList <String> buenas=new ArrayList<>();
	ArrayList <String> malas=new ArrayList<>();
	botonAceptar(Ventana v)
	{
		ventana=v;
	}
	public void actionPerformed(ActionEvent e) 
	{
		String comando=e.getActionCommand();
		
		if (comando.equals("Aceptar"))
		{
			
			
			//GUARDO LA LETRA ELEGIDA
			String letra=ventana.getPanelIzq().getCombo().getSelectedItem().toString();
			
			

			
			
			//AHORA RECORRO LA PALABRA PARA VER SI EXISTE
			//PARA ELLO PRIMERO LA GUARDO TAMBIEN
			String palabra= ventana.getPanelIzq().getPalabraElegida();
			//boolean interruptor=false;
			//NO DEBO USAR EL INTERRUPTOR, UNA PALABRA PUEDE ESTAR VARIAS VECES
			//ASÍ QUE EL FOR SE RECORRE SIEMPRE COMPLETAMENTE
			int contador=0;
			
			boolean interruptor=false;
			for (int i=0;i<buenas.size() && interruptor==false;i++)
			{
				if (buenas.get(i).equalsIgnoreCase(letra))
				{
					JOptionPane.showMessageDialog(ventana, "¡ERROR! Esa letra ya ha sido elegida socio");
					interruptor=true;
					contador=200;
				}
			}
			
			
			for (int i=0;i<palabra.length();i++)
			{
				if (String.valueOf(palabra.charAt(i)).equals(letra))
				{
					contador++;
					//ENTRA?
					//DEPURANDO System.out.println(letra);
					buenas.add(letra);
				}
				/*if (letra.equalsIgnoreCase(String.valueOf(palabra.charAt(i))))
				{
					
				}*/
			}
			if (contador==0 && contador2<6)
			{
				
				
				boolean interruptor2=false;
				for (int i=0;i<malas.size()&&interruptor2==false;i++)
				{
					if (malas.get(i).equalsIgnoreCase(letra))
					{
						interruptor2=true;
						JOptionPane.showMessageDialog(ventana, "¡ERROR! Esa letra ya ha sido elegida socio");
						ventana.getPanelIzq().getLabel4().setText("Esa letra ya ha sido elegida");
					}
					
				}
				
				malas.add(letra);
				
				if (interruptor2==false)
					
				{
					//LO PRIMERISIMO ES MOSTRAR LA LETRA INTENTADA:
					ventana.getPanelIzq().letrasIntentadas(letra);
					//1- SE CARGARÁ UNA IMAGEN DE LA BATERÍA
					ventana.getPanelDch().siguienteImagen(); //TAMBIEN LO CAMBIO DE COLOR PARA QUE EL USUARIO
					//NO SE PIERDA
					
					//2- EN MENSAJES DEBERÁ MOSTRARSE "INTENTO FALLIDO"
					ventana.getPanelIzq().actualizarMensajeError();
					
					contador2++;
					//3- SE IRÁ CALCULANDO CANTIDAD DE INTENTOS
					//PARA ELLO RECOGEMOS LOS INTENTOS QUE LLEVAMOS Y SI SUPERA X NUMERO
					//AUTOMÁTICAMENTE SE MOSTRARÁ "DEMASIADOS INTENTOS FALLIDOS
					//LOS INTENTOS SON TANTOS COMO IMÁGENES TENEMOS
					if (contador2==6)
					{
						//CUANDO OCURRA ESTO HAGO DISABLE EL BOTON
						ventana.getPanelIzq().getAceptar().setEnabled(false);
						//TAMBIEN MUESTRO MENSAJE DE DEMASIADOS INTENTOS FALLIDOS:
						ventana.getPanelIzq().mostrarGameOver();
						
						//AL TERMINAR EL JUEGO MUESTRO LA PALABRA
						
						ventana.getPanelIzq().mostrarPalabraAlPerder();
					}
				}	
				
			}
			else if (contador>0 && contador<15)
			{
				//LO PRIMERISIMO ES MOSTRAR LA LETRA INTENTADA:
				ventana.getPanelIzq().letrasIntentadas(letra);
				//EN CASO DE QUE EXISTA ESA LETRA 1 O + VECES:
				ventana.getPanelIzq().actualizarActualizacion(letra);
				ventana.getPanelIzq().actualizarMensajeBueno();
			}
			else if (contador>15)
			{
				ventana.getPanelIzq().getLabel4().setText("Esa letra ya ha sido elegida");
			}

		}
	}

}
