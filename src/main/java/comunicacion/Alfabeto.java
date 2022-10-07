package comunicacion;

public class Alfabeto extends Pictograma{
	private String[] letras = new String[30];
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//metodos get
	public String[] getLetras(){
		return(this.letras);
	}
	
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	public int cantidadLetras() {
		int cont = 0;
		for(int i=0; i<this.letras.length; i++) {
			if(this.letras[i]!=null) {
				cont++;
			}
		}
		return(cont);
	}
	
	public String interpretacion() {
		return(this.interpretacion);
	}
	
	public String toString() {
		String str = "";
		for(int i=0;i<this.letras.length;i++) {
			str+=this.letras[i]+", ";
		}
		return str;
	}
}
