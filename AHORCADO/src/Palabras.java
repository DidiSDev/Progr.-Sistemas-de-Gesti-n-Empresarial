import java.io.*;
public class Palabras {

	
	private String[] arrayPalabras= {"HOLA", "ACUEDUCTO", "PATATA", "CONSENTIMIENTO", "DESGUACE", "ESTREPTOCOCO", "JABALÍ", "PARÍS"};
	private int indice;
	private String palabraElegida;
	
	Palabras()
	{
		//MÉTODO QUE ELEGIRÁ LAS PALABRAS ALEATORIAMENTE ENTRE LAS QUE HAY
		indice=(int) (Math.random()*arrayPalabras.length);
		palabraElegida=arrayPalabras[indice];
	}

	public String[] getArrayPalabras() {
		return arrayPalabras;
	}

	public void setArrayPalabras(String[] arrayPalabras) {
		this.arrayPalabras = arrayPalabras;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getPalabraElegida() {
		return palabraElegida;
	}

	public void setPalabraElegida(String palabraElegida) {
		this.palabraElegida = palabraElegida;
	}
	
	
}
