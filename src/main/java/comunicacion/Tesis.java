package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos = new String[10];
	private String conclusion;
	private String referencias;
	private String interpretacion;
	private final int factor =  5;
	
	//constructor
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
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
	
	public String[] getArgumentos(){
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
	
	public void setArgumentos(String[] argumentos) {
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
	
	public int numArgumentos() {
		int cont = 0;
		for(int i=0; i<this.argumentos.length; i++) {
			if(this.argumentos[i]!=null) {
				cont++;
			}
		}
		return cont;
	}
	
	public String toString() {
		String str = this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getIdea()+"\n"+String.valueOf(this.numArgumentos())+"\n"+this.conclusion+"\n"+this.referencias;
		return(str);
	}
}

