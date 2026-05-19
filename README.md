# SOLID Delivery Java

Projeto em Java que demonstra a aplicacao dos cinco principios SOLID usando como contexto um sistema de delivery. Cada pasta apresenta um principio de forma isolada, com classes simples e executaveis para facilitar a leitura, a compilacao e os testes.

## Estrutura do projeto

```text
.
├── SRP/
├── OCP/
├── LSP/
├── ISP/
└── DIP/
```

Cada pasta possui um arquivo `Main.java` com um exemplo de execucao do principio correspondente.

## Como compilar

Na raiz do projeto, execute:

```bash
rm -rf out && javac -d out $(find . -name '*.java')
```

Esse comando compila todos os arquivos `.java` e coloca os arquivos `.class` dentro da pasta `out/`.

## Como executar

Depois de compilar, rode os exemplos individualmente:

```bash
java -cp out SRP.Main
java -cp out OCP.Main
java -cp out LSP.Main
java -cp out ISP.Main
java -cp out DIP.Main
```

## SRP - Single Responsibility Principle

A pasta `SRP` demonstra o Principio da Responsabilidade Unica. A ideia central e que cada classe deve ter apenas um motivo para mudar.

Classes principais:

- `Pedido`: representa os dados de um pedido, como id, cliente, item e valor total.
- `PedidoService`: fica responsavel pela criacao de pedidos.
- `PedidoRepository`: fica responsavel por salvar um pedido.
- `PedidoExibicao`: fica responsavel por exibir as informacoes do pedido.
- `Main`: cria, salva e exibe um pedido usando as classes separadas por responsabilidade.

Essa separacao evita concentrar criacao, persistencia e apresentacao dentro de uma unica classe. Assim, se a forma de salvar um pedido mudar, por exemplo, apenas `PedidoRepository` precisa ser alterada.

## OCP - Open/Closed Principle

A pasta `OCP` demonstra o Principio Aberto/Fechado. Uma classe deve estar aberta para extensao, mas fechada para modificacao.

Classes principais:

- `FormaPagamento`: interface que define o contrato comum para qualquer forma de pagamento.
- `PagamentoCartao`: implementa pagamento via cartao.
- `PagamentoPix`: implementa pagamento via PIX.
- `PagamentoDinheiro`: implementa pagamento em dinheiro.
- `ProcessadorPagamento`: processa pagamentos dependendo da abstracao `FormaPagamento`.
- `Main`: executa os pagamentos disponiveis.

O `ProcessadorPagamento` nao precisa conhecer detalhes de cartao, PIX ou dinheiro. Para adicionar uma nova forma de pagamento, basta criar uma nova classe que implemente `FormaPagamento`, sem alterar o processador existente.

## LSP - Liskov Substitution Principle

A pasta `LSP` demonstra o Principio da Substituicao de Liskov. Subclasses devem poder substituir a classe base sem quebrar o comportamento esperado.

Classes principais:

- `ProdutoRestaurante`: classe base que possui nome, preco, preparo e descricao.
- `Pizza`: especializacao de produto com preparo proprio.
- `Hamburguer`: especializacao de produto com preparo proprio.
- `Bebida`: especializacao de produto com preparo proprio.
- `Main`: trata todos os itens como `ProdutoRestaurante` em uma lista.

O exemplo mostra que `Pizza`, `Hamburguer` e `Bebida` podem ser usados no lugar de `ProdutoRestaurante`. O codigo que percorre a lista nao precisa saber qual subtipo esta recebendo para chamar `preparar()` e `descricao()`.

## ISP - Interface Segregation Principle

A pasta `ISP` demonstra o Principio da Segregacao de Interfaces. Classes nao devem ser obrigadas a implementar metodos que nao utilizam.

Interfaces principais:

- `EnviadorNotificacoes`: define apenas o envio de notificacoes.
- `GeradorRelatorios`: define apenas a geracao de relatorios.
- `GerenciadorPedidos`: define operacoes de pedidos.
- `GerenciadorEntregas`: define operacoes de entregas.

Implementacoes principais:

- `SistemaNotificacoes`: implementa somente notificacoes.
- `SistemaRelatorios`: implementa somente relatorios.
- `SistemaPedidos`: implementa somente gerenciamento de pedidos.
- `SistemaEntregas`: implementa somente gerenciamento de entregas.
- `Main`: usa cada interface conforme a responsabilidade necessaria.

Com interfaces menores e especificas, cada classe implementa apenas o contrato que faz sentido para ela. Isso reduz acoplamento e evita metodos vazios ou sem uso.

## DIP - Dependency Inversion Principle

A pasta `DIP` demonstra o Principio da Inversao de Dependencia. Modulos de alto nivel nao devem depender diretamente de implementacoes concretas, mas sim de abstracoes.

Classes principais:

- `CanalNotificacao`: interface que representa qualquer canal de notificacao.
- `NotificacaoEmail`: implementa envio por email.
- `NotificacaoSms`: implementa envio por SMS.
- `NotificacaoWhatsApp`: implementa envio por WhatsApp.
- `NotificadorPedido`: depende da abstracao `CanalNotificacao`.
- `Main`: injeta diferentes canais de notificacao no `NotificadorPedido`.

O `NotificadorPedido` nao cria nem depende diretamente de email, SMS ou WhatsApp. Ele recebe um `CanalNotificacao`, permitindo trocar o meio de envio sem alterar sua logica interna.

## Beneficios demonstrados

- Codigo mais organizado por responsabilidade.
- Baixo acoplamento entre classes.
- Facilidade para adicionar novos comportamentos.
- Uso de interfaces para contratos claros.
- Melhor manutencao e evolucao do sistema.
