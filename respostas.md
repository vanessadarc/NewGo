# Questões


**Pergunta: 1** Quais são os contras de utilizar se herança entre classes? Quais alternativas você adotaria caso quisesse deixar de usar herança em um relacionamento específico? Dê um exemplo.

 **Resposta:** A herança pode trazer o problema de rigidez e acoplamento. Uma alternativa seria usar a composição e o uso de interface, pois assim seria possível representar diferentes papéis ou reponsabilidades, por exemplo, de funcionários, neste caso posso usar interfaces “DesenvolvedorInterface” e “GerenteInterface”  que definem métodos específicos para cada papel.


**Pergunta: 2**  Suponha que você tem uma classe final, da qual você não tem o código-fonte, e que você deseja adicioná-la a uma estrutura de polimorfismo, mas cuja interface pública é ligeiramente diferente da classe. Que padrão de projeto você poderia utilizar para aproveitar o código desta classe, mas fazendo com que ela atenda à interface da esperada na estrutura de polimorfismo?

 **Resposta:**  Poderia utilizar o padrão de projeto Adapter. O adapter possibilita que classes com interfaces incompatíveis trabalhem juntas, convertendo a interface de uma classe em outra interface esperada pela estrutura de polimorfismo.
 Nesse caso, seria necessário criar uma nova classe que implemente a interface desejada e que utilize a classe final como um objeto interno. Através do Adapter, seria possível utilizar o código existente da classe final, adaptando para a nova interface requerida, sem a necessidade de modificar o código original.



 **Pergunta: 3**  que cenários você poderia usar um proxy? Dê um exemplo real.


**Resposta:** Proxy é útil em vários cenários nos quais é necessário controlar o acesso a um objeto ou adicionar funcionalidades extras a ele. Por exemplo, em uma empresa, é possível realizar o controle de acesso a alguns sites por meio de um Proxy. O administrador do Proxy é responsável por permitir que os usuários tenham acesso à internet, impondo restrições através de autenticação de usuário (login) ou restrições de IP.

**Pergunta: 4**   Você prefere utilizar domínios anêmicos ou ricos? Como avalia os prós e contras de cada?

**Resposta:** No último projeto que participei do programa de capacitação utilizei domínio rico, pois estávamos desenvolvendo um sistema mais complexo ( software de busca de vagas e candidatos). Mas entendo que  a escolha do domínio vai depender do contexto do projeto. O modelo anêmico é mais simples e mais compreensivo. No entanto, pode levar a falta de encapsulamento e dificuldade de representar a lógica do negócio. Já o domínio rico oferece maior modelagem do mundo real e traz as regras de negócios, mas sua implementação pode ser mais complexa e exigir mais tempo.
 
  **Pergunta: 5**  Dê um exemplo do bom uso do princípio OCP, da sigla SOLID.

**Resposta:** Em um sistema de pagamento, crio uma interface (ou classe abstrata) com o método ()Pay sem nenhum retorno. Implemento duas classes com o método Pay(), uma classe chamada PayPal e outra chamada CreditCard que farão a implementação detalhada do método Pay().

**Pergunta: 6**  Qual é a diferença entre requisitos funcionais, não-funcionais e regras de negócio. Dê um exemplo de cada
 **Resposta:**
- Requisito funcional: é todo recurso ou funcionalidade do software. Exemplo: sistema deve permitir o cadastro de um novo usuário, e deve fazer a validação por meio do e-mail.
- Requisito não funcionais: são características ou qualidade que o sistema precisa ter, descrevem como serão feitos. Exemplo: qual será o  tipo do sistema operacional.
- Regra de negócio:  são as lógicas,  restrições ou diretrizes que definem como uma determinada organização trabalha. Exemplo: em um sistema do Banco X, o cliente só pode solicitar um empréstimo se estiver tudo em ordem, não pode haver nenhuma pendência financeira.


  **Pergunta: 7**   Quais estratégias de diagramação você utiliza em seus projetos? Quais diagramas e por quê?
 **Resposta:**
No projeto que realizei recentemente do programa de capacitação. Utilizei o diagrama UML, dessa forma foi possível entender os relacionamentos entre as classes. 


 **Pergunta: 8**  Você está utilizando GitFlow e precisa fazer uma alteração na versão em desenvolvimento de um projeto. Quais etapas você teria que realizar?
- **Resposta:**
Teria que realizar as seguintes etapas:

- Preciso verificar se tenho a versão mais recente da branch, por exemplo  develop em minha máquina local: git checkout develop;
- Em seguida escrevo: git pull origin develop;
- Crio uma nova branch para realizar minha alteração, derivada da “develop”: git checkout -b nome-da-minha-branch.
- Faço as alterações necessárias nos arquivos relevantes.
- Adiciono as alterações: git add.....
- Faço o commit das alterações: git commit -m "Descrição das alterações".
-Publico a branch no repositório remoto: git push origin “ nome-da-minha-branch.


**Pergunta: 9**  O que você deve ter feito para que uma funcionalidade que você pegou para implementar seja considerada como 'done'? 
- **Resposta:**
Entendo que a definição “done” pode variar de equipe para equipe. Mas acredito que no geral é possível seguir alguns passos para conseguir implementar a funcionalidade e ser considerada como “done”.

- Desenvolver o código para acrescentar as funcionalidades no sistema (seguir as funcionalidades).
-Realizar testes para verificar o funcionamento correto, sendo testes individuais e integrados para garantir que as funcionalidades estejam de acordo com os critérios definidos no início.
- Garantir que as partes interessadas façam aprovação e revisão para que aconteça a implementação;



**Pergunta: 10**  Quais são as cerimônias do SCRUM e como você avalia a importância de cada? 
- **Resposta:**

Reunião de Planejamento (Planning) – definir a meta, próximos trabalhos e analisar qual o valor da Sprint.

Daily Scrum – reunião rápida, geralmente 15 minutos. A equipe compartilha informações sobre o andamento do trabalho. 

 Review – em cada término da sprint a equipe realiza uma reunião de revisão para mostrar o trabalho concluído. É nessa cerimônia que as funcionalidade são apresentadas.

Sprint Retrospective, com o objetivo de melhoria continua dos processos, essa cerimônia acontece após a Review com o objetivo de analisar e refletir sobre a sprint anterior para identificar o que funcionou bem e o que pode ser melhorado.


 **Pergunta: 11**   Você conhece e utiliza Docker nos seus projetos? Se sim, para que?
- **Resposta:**

Já estudei um pouco sobre Docker, mas nunca utilizei nos projetos que participei até o momento. 
