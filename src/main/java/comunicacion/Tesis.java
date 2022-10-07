package comunicacion;

import java.util.*;
public class Tesis extends Escrito{
	private String idea;
	private List<String> argumentos = new ArrayList<String>();
	private String conclusion;
	private String referencias;
	private String interpretacion;
	private final int factor =  5;
	
	//constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, List<String> argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	//metodos get
	public String getIdea() {
		return(this.idea);
	}
	
	public List<String> getArgumentos(){
		return(this.argumentos);
	}
	
	public String getConclusion() {
		return(this.conclusion);
	}
	
	public String getReferencias() {
		return(this.referencias);
	}
	
	public String getInterpretacion() {
		return(this.interpretacion);
	}
	
	//metodos set
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public void setArgumentos(List<String> argumentos) {
		this.argumentos = argumentos;
	}
	
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
		String str = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getIdea()+"\n"+String.valueOf(this.argumentos.size())+"\n"+this.conclusion+"\n"+this.referencias+"\n"+this.interpretacion;
		return(str);
	}
}

