package DiscoVirtual;

public class Arquivo {
	
	private String nome;
    private String tipo;
    private int tamanho;
    
    public Arquivo(String nome, String tipo, int tamanho) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = tamanho;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
    
    



}
