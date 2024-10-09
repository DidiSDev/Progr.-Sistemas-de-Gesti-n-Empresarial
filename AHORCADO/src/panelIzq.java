import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class panelIzq extends JPanel {

	private TitledBorder tit1, tit2, tit3, tit4;
	private Ventana v;
	private String[] barrasBajas;
	private Palabras palabra;
	private String palabraElegida, actualizacion, letrasIntentadas="";
	private JLabel contenedorPalabra, label4, contienePalabrasIntentadas=new JLabel("");
	private String palabrasIntentadas="";
	private JComboBox combo;
	private JPanel panelTit1, panelTit2, panelTit3,panelTit4;
	private JButton aceptar;
	
	panelIzq(Ventana ventana)
	{
		v= ventana;
		this.setLayout(new GridLayout(4,1));
		
		//HAY QUE CREAR 4 TITLEBORDER
		crearTitleBorder();
		
		//HAY QUE METER 4 PANELES Y PONER DE BORDE EL TITLEBORDER
		panelTit1=new JPanel();
		panelTit1.setLayout(new FlowLayout());
		panelTit1.setBorder(tit1);
		
		panelTit2=new JPanel();
		panelTit2.setLayout(new FlowLayout());
		panelTit2.setBorder(tit2);
		
		panelTit3=new JPanel();
		panelTit3.setLayout(new FlowLayout());
		panelTit3.setBorder(tit3);
		
		panelTit4=new JPanel();
		panelTit4.setLayout(new FlowLayout());
		panelTit4.setBorder(tit4);	
		
		//MÉTODO QUE CALCULA LA CANTIDAD DE BARRAS BAJAS QUE TENDRÁ TIT1
		
		palabra=new Palabras();//PRIMERO INSTANCIO PALABRITA
		
		cantidadBarrasBajas();
		
		//CREAR LABEL QUE AÑADIRÁ LA PALABRA AL PANEL TIT1
		
		actualizacion="";
		for (int i=0;i<barrasBajas.length;i++)
		{
			actualizacion=actualizacion+" "+barrasBajas[i];
			contenedorPalabra=new JLabel(actualizacion);
		}
		
		//AHORA ACTUALIZACION TENDRA LAS BARRAS BAJAS QUE DEBA

		panelTit1.add(contenedorPalabra);
		this.add(panelTit1);
		
		
		
		//AHORA VAMOS CON EL PANEL 2:
		//OJO CON ESTO
		

		panelTit2.add(contienePalabrasIntentadas);
		this.add(panelTit2);
		
		
		
		
		//TERCER PANEL
		
		String abcdario[] = {
			    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", 
			    "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

		combo=new JComboBox();
		//RELLENAMOS EL COMBO
		for (int i=0;i<abcdario.length;i++)
		{
			combo.addItem(abcdario[i]);
		}
		
		//LO AÑADIMOS AL PANEL Y EL PANEL A LA VENTANA
		
		panelTit3.add(combo);
	
		//HACEMOS EL BOTON ACEPTAR:
		
		aceptar=new JButton("Aceptar");
		panelTit3.add(aceptar);
		this.add(panelTit3);
		
		//ULTIMO PANEL
		label4=new JLabel("");
		panelTit4.add(label4);
		this.add(panelTit4);
		
		
		
		//HAY QUE HACER ESCUCHADOR AL BOTÓN ACEPTAR
		
		aceptar.addActionListener(new botonAceptar(v));
	}
	
	
	//MÉTODOS PUBLICOS DIEGO POR FAVOR QUE DA ERRORES TONTISIMOS SINO
	
	public String getLetrasIntentadas() {
		return letrasIntentadas;
	}

	public void setLetrasIntentadas(String letrasIntentadas) {
		this.letrasIntentadas = letrasIntentadas;
	}

	
	public void letrasIntentadas(String letra)
	{
		//PALABRAS INTENTADAS ESTÁ EN INICIO INSTANCIADA A ""
		palabrasIntentadas=palabrasIntentadas+" "+letra;
		
		//LO QUE HAGO ES AÑADIR LA NUEVA LETRA SEPARANDO CON UN ESPACIO
		//DESPUES CAMBIO EL JLABEL CON EL TEXTO NUEVO QUE SON LAS PALABRAS
		//DESPUÉS LAS INSERTO EN EL PANEL Y DESPUÉS EN LA VENTANA
		contienePalabrasIntentadas.setText(palabrasIntentadas);
		panelTit2.add(contienePalabrasIntentadas);
		
		//NO HACE FALTA AÑADIR EL PANEL DE NUEVO, SE PUEDE MODIIFCAR
		//SU CONTENIDO SIN AÑADIR DE NUEVO
		//this.add(panelTit2);
		
	}
	
	public void actualizarMensajeError()
	{
		//SOLAMENTE CON MODIFICAR EL LABEL YA BASTA
		label4.setText("Error! esa letra no está");
		
		//NO AÑADIR DE NUEVO
		//this.add(panelTit4);
	}

	public void actualizarMensajeBueno()
	{
		label4.setText("Correcto! Muy bueno hijo");
	}
	public void mostrarGameOver()
	{
		label4.setText("GAME OVER!");
	}

	public void actualizarActualizacion(String letra)
	{
		//ESTE MÉTODO RECALCULARÁ LAS BARRAS BAJAS QUE HABRÁ Y LAS LETRAS QUE HABRÁ
		//RECUERDA QUE AL TERMINAR, HABRÁ QUE AÑADIR EL NUEVO CONTENEDO A PANEL1 Y LUEGO EL PANEL1 A
		//ESTA VENTANA
		
		//VACIAMOS
		actualizacion="";
		contenedorPalabra.setText("");
		
		for (int i=0;i<palabra.getPalabraElegida().length();i++)
		{
			if (barrasBajas[i].equals("_") && String.valueOf(palabra.getPalabraElegida().charAt(i)).equalsIgnoreCase(letra))
			{
				barrasBajas[i]=letra;
				//SOLAMENTE MODIFICAMOS BARRASBAJAS SI NO ESTÁ LA LETRA
			}
			
			actualizacion=actualizacion+" "+barrasBajas[i];
		}
		//FUERA DEL FOR HIJO
		contenedorPalabra.setText(actualizacion);;
		panelTit1.add(contenedorPalabra);
		
	}
	
	private void cantidadBarrasBajas()
	{
		
		palabraElegida=palabra.getPalabraElegida();
		
		barrasBajas=new String[palabraElegida.length()];
		for (int i=0;i<barrasBajas.length;i++)
		{
			barrasBajas[i]="_";
		}
	}

	
	

	private void crearTitleBorder() 
	{
		tit1=new TitledBorder("Palabra:");
		tit2=new TitledBorder("Intentos:");
		tit3=new TitledBorder("Letras:");
		tit4=new TitledBorder("Mensajes:");		
	}

	
	
	
	
	
	
	
	
	public JLabel getLabel4() {
		return label4;
	}

	public void setLabel4(JLabel label4) {
		this.label4 = label4;
	}

	public JPanel getPanelTit1() {
		return panelTit1;
	}

	public void setPanelTit1(JPanel panelTit1) {
		this.panelTit1 = panelTit1;
	}

	public JPanel getPanelTit2() {
		return panelTit2;
	}

	public void setPanelTit2(JPanel panelTit2) {
		this.panelTit2 = panelTit2;
	}

	public JPanel getPanelTit3() {
		return panelTit3;
	}

	public void setPanelTit3(JPanel panelTit3) {
		this.panelTit3 = panelTit3;
	}

	public JPanel getPanelTit4() {
		return panelTit4;
	}

	public void setPanelTit4(JPanel panelTit4) {
		this.panelTit4 = panelTit4;
	}
	
	

	public JButton getAceptar() {
		return aceptar;
	}


	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}


	public String getActualizacion() {
		return actualizacion;
	}
	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}
	public JLabel getContenedorPalabra() {
		return contenedorPalabra;
	}
	public void setContenedorPalabra(JLabel contenedorPalabra) {
		this.contenedorPalabra = contenedorPalabra;
	}

	public JComboBox getCombo() {
		return combo;
	}
	public void setCombo(JComboBox combo) {
		this.combo = combo;
	}
	public TitledBorder getTit1() {
		return tit1;
	}

	public void setTit1(TitledBorder tit1) {
		this.tit1 = tit1;
	}

	public TitledBorder getTit2() {
		return tit2;
	}

	public void setTit2(TitledBorder tit2) {
		this.tit2 = tit2;
	}

	public TitledBorder getTit3() {
		return tit3;
	}

	public void setTit3(TitledBorder tit3) {
		this.tit3 = tit3;
	}

	public TitledBorder getTit4() {
		return tit4;
	}

	public void setTit4(TitledBorder tit4) {
		this.tit4 = tit4;
	}

	public Ventana getV() {
		return v;
	}

	public void setV(Ventana v) {
		this.v = v;
	}

	public String[] getBarrasBajas() {
		return barrasBajas;
	}

	public void setBarrasBajas(String[] barrasBajas) {
		this.barrasBajas = barrasBajas;
	}

	public Palabras getPalabra() {
		return palabra;
	}

	public void setPalabra(Palabras palabra) {
		this.palabra = palabra;
	}

	public String getPalabraElegida() {
		return palabraElegida;
	}

	public void setPalabraElegida(String palabraElegida) {
		this.palabraElegida = palabraElegida;
	}
	
}
