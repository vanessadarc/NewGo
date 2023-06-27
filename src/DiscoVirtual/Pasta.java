package DiscoVirtual;

import java.util.List;

public class Pasta {
	private String nome;
    private List<Pasta> subpastas = new ArrayList<>();
    private List<Arquivo> arquivos = new ArrayList<>();
    


   public Pasta(String nome, List<Pasta> subpastas, List<Arquivo> arquivos) {
		super();
    	this.nome = nome;
		this.subpastas = subpastas;
		this.arquivos =  arquivos;
	}
    
	public Pasta(String string) {
	
}

	public void adicionarSubpasta(Pasta subpasta) {
		subpastas.add(subpasta);
	
		}
    
	public void adicionarArquivos(Arquivo arquivo) {
		arquivos.add(arquivo);
	}
	
	public int calcularTamanhoTotal() {
		int tamanhoTotal=0;
		for(Pasta subpasta : subpastas) {
		    tamanhoTotal += subpasta.calcularTamanhoTotal();
		}
		
		  for (Arquivo arquivo : arquivos) {
	            tamanhoTotal += arquivo.getTamanho();
	        }

	           return tamanhoTotal;
	}
	
	public void excluirRecursivamente() {
        for (Pasta subpasta : subpastas) {
            subpasta.excluirRecursivamente();
        }

        for (Arquivo arquivo : arquivos) {
            System.out.println("Excluindo arquivo: " + arquivo.getNome());
        }

        subpastas.clear();
        arquivos.clear();
    }






	



}
