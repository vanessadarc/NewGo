@startuml TarefaNewGo
     class Arquivo{
        -String: nome
        -String: TipoArquivo
        -long: Tamanho
      
}
    class Pasta{
       -String: nome
       -subPastas: List<Pasta>
       -arquivos: List<Arquivo>
   
     -adicionarSubpasta(nome: String): Pasta
     -adicionarArquivo(nome: String, tipo: String, tamanho: double): Arquivo
     -calcularTamanhoTotal(): double
     -excluirRecursivamente()
    }


@enduml