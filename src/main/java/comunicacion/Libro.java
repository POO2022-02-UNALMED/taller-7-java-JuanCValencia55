package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	private final int factor = 2;
	
	//constructor
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	//metodos get
	public String getCo_autor() {
		return(this.co_autor);
	}
	public String getEditorial() {
		return(this.editorial);
	}
	public String getEdicion() {
		return(this.edicion);
	}
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	//metodos
	public int palabrasTotales(int parametro) {
		return(this.getPaginas()*parametro*factor);
	}
	
	public String interpretacion() {
		return(this.interpretacion);
	}
	
	public String toString() {
		String str = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getCo_autor()+"\n"+this.getEditorial()+"\n"+this.getEdicion()+"\n"+this.getInterpretacion();
		return(str);
	}
}
