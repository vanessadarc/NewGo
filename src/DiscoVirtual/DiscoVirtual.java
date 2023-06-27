package DiscoVirtual;

public class DiscoVirtual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Pasta raiz = new Pasta("Raiz");

        Pasta pasta1 = new Pasta("Pasta1");
        Pasta pasta2 = new Pasta("Pasta2");
        Pasta pasta3 = new Pasta("Pasta3");

        pasta1.adicionarSubpasta(pasta2);
        pasta2.adicionarSubpasta(pasta3);

        Arquivo arquivo1 = new Arquivo("Arquivo1", "txt", 10);
        Arquivo arquivo2 = new Arquivo("Arquivo2", "jpg", 50);
        Arquivo arquivo3 = new Arquivo("Arquivo3", "doc", 20);

       pasta1.adicionarArquivos(arquivo1);
       pasta2.adicionarArquivos(arquivo2);
       pasta3.adicionarArquivos(arquivo3);

       raiz.adicionarSubpasta(pasta1);

     int tamanhoTotal = raiz.calcularTamanhoTotal();
     System.out.println("Tamanho total da raiz: " + tamanhoTotal + " bytes");

        pasta2.excluirRecursivamente();
    }

	








	}

}
