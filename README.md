# Sistema de Controle de Pedidos em Lanchonete (MVC)

## Descrição
Sistema de controle de pedidos em lanchonete utilizando o padrão arquitetural MVC (Model-View-Controller).

## Tabelas (Entidades)

### Produto
- nome
- descricao
- preco

### Pedido
- lista de produtos
- valor total
- data

## Regras de Negócio

- Não permitir produto com nome vazio
- Não permitir produto com preço negativo
- Pedido deve conter ao menos um produto
- Calcular automaticamente o valor total
- Permitir múltiplos produtos por pedido
- Consultar pedidos por data
- Calcular faturamento por período

## Arquitetura MVC

### Model
Responsável pelos dados e regras de negócio:
- Produto
- Pedido

### Controller
Responsável pelo controle da aplicação:
- PedidoController

Funções:
- Registrar pedidos
- Buscar pedidos por data
- Calcular faturamento

### View
Responsável pela exibição:
- PedidoView

## Funcionamento

O sistema separa responsabilidades em camadas:
- Model: regras e dados
- Controller: lógica de controle
- View: saída de dados

## Execução

Executar a classe Main para simulação do sistema.
