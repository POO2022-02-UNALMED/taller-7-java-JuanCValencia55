package comunicacion;
import java.util.*;
public class Alfabeto extends Pictograma{
	private List<String> letras = new ArrayList<String>();
	private String interpretacion;
	
	//constructor
	public Alfabeto(String origen,List<String> letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	//metodos get
	public List<String> getLetras(){
		return(this.letras);
	}
	
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setLetras(List<String> letras) {
		this.letras = letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	public int cantidadLetras() {
		return(letras.size());
	}
	
	public String interpretacion() {
		return(this.interpretacion);
	}
	
	public String toString() {
		String str = "";
		for(int i=0;i<this.letras.size();i++) {
			str+=this.letras.get(i)+", ";
		}
		return str;
	}
}
