# Cadastro de Produtos com Java e MySQL

## Descrição do Projeto
Este projeto demonstra a implementação do CRUD (Create, Read, Update, Delete) em um banco de dados MySQL utilizando Java. Para isso, foi criada uma base de dados para armazenar informações de produtos, e a comunicação entre o Java e o banco é realizada através da classe `ProdutoDB`.

## Estrutura do Projeto
O projeto é composto por três principais classes Java:

- **`Produto`**: Representa um produto e seus atributos.
- **`ProdutoDB`**: Responsável por conectar-se ao banco de dados e executar as operações CRUD.
- **`App`**: Contém o método `main` para testar a funcionalidade do CRUD.

## Atributos da Classe `Produto`
A classe `Produto` possui os seguintes atributos, que correspondem diretamente às colunas da tabela `Produto` no banco de dados MySQL:

| Atributo (Java)         | Tipo (Java) | Coluna (Banco de Dados) | Tipo (SQL)        | Descrição |
|------------------------|------------|-------------------------|-------------------|------------|
| `tipoProduto`         | `String`   | `TipoProduto`           | `VARCHAR(255)`   | Tipo do produto (Ex: Alimento, Construção, Artesanato) |
| `descricaoProduto`    | `String`   | `DescricaoProduto`      | `VARCHAR(255)`   | Descrição detalhada do produto |
| `pesoProduto`         | `float`    | `PesoProduto`           | `DECIMAL(5,2)`   | Peso do produto |
| `quantidadeProduto`   | `int`      | `QuantidadeProduto`     | `INT`            | Quantidade disponível em estoque |
| `unidadeMedidaProduto`| `String`   | `UnidadeMedidaProduto`  | `VARCHAR(255)`   | Unidade de medida (Ex: kg, metro, litro) |

Cada instância da classe `Produto` representa um item que pode ser armazenado no banco de dados. Ao inserir, atualizar ou excluir produtos, os valores dos atributos Java são utilizados para preencher os campos correspondentes na tabela `Produto`.

A coluna `CodigoProduto` é uma chave primária e é auto-incrementada pelo banco de dados, garantindo que cada produto tenha um identificador único.

## Funcionalidades
O projeto permite executar as seguintes operações:

### 1. Conectar ao Banco de Dados
A classe `ProdutoDB` contém um método para testar a conexão com o banco:
```java
ProdutoDB.testarConexao();
```

### 2. Inserir Produtos
Os produtos são criados na `main` e inseridos no banco através do método `inserirProduto`:
```java
Produto arroz = new Produto();
arroz.setTipoProduto("Alimento");
arroz.setDescricaoProduto("Arroz Integral - Camil - 1 Kilo");
arroz.setPesoProduto(1F);
arroz.setQuantidadeProduto(145);
arroz.setUnidadeMedidaProduto("kg");

ProdutoDB.inserirProduto(arroz);
```

### 3. Listar Produtos
Exibe todos os produtos cadastrados no banco de dados:
```java
ProdutoDB.listarProdutos();
```

### 4. Atualizar Produto
Permite atualizar os atributos de um produto já existente:
```java
arroz.setDescricaoProduto("Arroz Integral - Camil - 5 Kilos");
arroz.setPesoProduto(5F);
ProdutoDB.atualizarProduto(arroz, 1);  // Atualiza o produto com ID 1
```

### 5. Excluir Produto
Remove um produto do banco com base no seu ID:
```java
ProdutoDB.excluirProduto(5);  // Exclui o produto com ID 5
```

## Tecnologias Utilizadas
- **Java** (JDK 11 ou superior)
- **MySQL** (Servidor de banco de dados)
- **JDBC** (Java Database Connectivity)

## Como Executar o Projeto
1. Instale e configure um servidor MySQL.
2. Crie o banco de dados e a tabela utilizando o script SQL fornecido em: [ProdutoDB.sql](./ProdutosDB/ProdutoDB.sql).
3. Atualize as credenciais do banco de dados na classe `ProdutoDB`.
4. Compile e execute a classe `App`.
