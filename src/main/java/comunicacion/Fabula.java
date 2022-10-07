package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	private final int factor = 1;
	
	//constructor
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	//metodos get
	public String getEnsenanza() {
		return(this.ensenanza);
	}
	
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	public int palabrasTotales(int parametro) {
		return(this.getPaginas()*parametro*this.factor);
	}
	
	public String interpretacion() {
		return(this.interpretacion);
	}
	
	public String toString() {
		String str = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getEnsenanza()+"\n"+this.getInterpretacion();
		return(str);
	}
}
