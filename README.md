# SOLID Delivery Java

Projeto em Java que demonstra a aplicação dos cinco princípios SOLID usando como contexto um sistema de delivery. Cada pasta apresenta um princípio de forma isolada, com classes simples e executáveis para facilitar a leitura, a compilação e os testes.

## Estrutura do projeto

```text
.
├── SRP/
├── OCP/
├── LSP/
├── ISP/
└── DIP/
```

Cada pasta possui um arquivo `Main.java` com um exemplo de execução do princípio correspondente.

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

A pasta `SRP` demonstra o Princípio da Responsabilidade Única. A ideia central é que cada classe deve ter apenas um motivo para mudar.

Classes principais:

- `Pedido`: representa os dados de um pedido, como id, cliente, item e valor total.
- `PedidoService`: fica responsável pela criação de pedidos.
- `PedidoRepository`: fica responsável por salvar um pedido.
- `PedidoExibicao`: fica responsável por exibir as informações do pedido.
- `Main`: cria, salva e exibe um pedido usando as classes separadas por responsabilidade.

Essa separação evita concentrar criação, persistência e apresentação dentro de uma única classe. Assim, se a forma de salvar um pedido mudar, por exemplo, apenas `PedidoRepository` precisa ser alterada.

## OCP - Open/Closed Principle

A pasta `OCP` demonstra o Princípio Aberto/Fechado. Uma classe deve estar aberta para extensão, mas fechada para modificação.

Classes principais:

- `FormaPagamento`: interface que define o contrato comum para qualquer forma de pagamento.
- `PagamentoCartao`: implementa pagamento via cartão.
- `PagamentoPix`: implementa pagamento via PIX.
- `PagamentoDinheiro`: implementa pagamento em dinheiro.
- `ProcessadorPagamento`: processa pagamentos dependendo da abstração `FormaPagamento`.
- `Main`: executa os pagamentos disponíveis.

O `ProcessadorPagamento` não precisa conhecer detalhes de cartão, PIX ou dinheiro. Para adicionar uma nova forma de pagamento, basta criar uma nova classe que implemente `FormaPagamento`, sem alterar o processador existente.

## LSP - Liskov Substitution Principle

A pasta `LSP` demonstra o Princípio da Substituição de Liskov. Subclasses devem poder substituir a classe base sem quebrar o comportamento esperado.

Classes principais:

- `ProdutoRestaurante`: classe base que possui nome, preço, preparo e descrição.
- `Pizza`: especialização de produto com preparo próprio.
- `Hamburguer`: especialização de produto com preparo próprio.
- `Bebida`: especialização de produto com preparo próprio.
- `Main`: trata todos os itens como `ProdutoRestaurante` em uma lista.

O exemplo mostra que `Pizza`, `Hamburguer` e `Bebida` podem ser usados no lugar de `ProdutoRestaurante`. O código que percorre a lista não precisa saber qual subtipo está recebendo para chamar `preparar()` e `descricao()`.

## ISP - Interface Segregation Principle

A pasta `ISP` demonstra o Princípio da Segregação de Interfaces. Classes não devem ser obrigadas a implementar métodos que não utilizam.

Interfaces principais:

- `EnviadorNotificacoes`: define apenas o envio de notificações.
- `GeradorRelatorios`: define apenas a geração de relatórios.
- `GerenciadorPedidos`: define operações de pedidos.
- `GerenciadorEntregas`: define operações de entregas.

Implementações principais:

- `SistemaNotificacoes`: implementa somente notificações.
- `SistemaRelatorios`: implementa somente relatórios.
- `SistemaPedidos`: implementa somente gerenciamento de pedidos.
- `SistemaEntregas`: implementa somente gerenciamento de entregas.
- `Main`: usa cada interface conforme a responsabilidade necessária.

Com interfaces menores e específicas, cada classe implementa apenas o contrato que faz sentido para ela. Isso reduz acoplamento e evita métodos vazios ou sem uso.

## DIP - Dependency Inversion Principle

A pasta `DIP` demonstra o Princípio da Inversão de Dependência. Módulos de alto nível não devem depender diretamente de implementações concretas, mas sim de abstrações.

Classes principais:

- `CanalNotificacao`: interface que representa qualquer canal de notificação.
- `NotificacaoEmail`: implementa envio por email.
- `NotificacaoSms`: implementa envio por SMS.
- `NotificacaoWhatsApp`: implementa envio por WhatsApp.
- `NotificadorPedido`: depende da abstração `CanalNotificacao`.
- `Main`: injeta diferentes canais de notificação no `NotificadorPedido`.

O `NotificadorPedido` não cria nem depende diretamente de email, SMS ou WhatsApp. Ele recebe um `CanalNotificacao`, permitindo trocar o meio de envio sem alterar sua lógica interna.

## Benefícios demonstrados

- Código mais organizado por responsabilidade.
- Baixo acoplamento entre classes.
- Facilidade para adicionar novos comportamentos.
- Uso de interfaces para contratos claros.
- Melhor manutenção e evolução do sistema.
