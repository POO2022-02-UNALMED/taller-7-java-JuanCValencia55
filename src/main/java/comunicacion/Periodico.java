package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	private final int factor = 10;
	
	
	//constructor
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	//metodos get
	public String getFecha() {
		return(this.fecha);
	}
	
	public String getPrimicia() {
		return(this.primicia);
	}
	
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
		String str = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getFecha()+"\n"+this.getPrimicia()+"\n"+this.getInterpretacion();
		return(str);
	}
}
