# Testes Unitários para Estoque e Produto

## Descrição do Projeto

Este repositório contém testes unitários desenvolvidos com **JUnit** para as classes `Produto` e `Estoque`. As classes de implementação foram fornecidas pelo professor, e minha contribuição foi exclusivamente na criação dos testes unitários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```
├── src/
│   ├── main/java/org/main/
│   │   ├── Produto.java
│   │   ├── Estoque.java
│   ├── test/java/org/test/
│   │   ├── ProdutoTest.java
│   │   ├── EstoqueTest.java
```

## Implementação

### Classes Fornecidas pelo Professor

As classes `Produto` e `Estoque` foram fornecidas pelo professor e implementam funcionalidades para manipulação de produtos e gestão de estoque:

- **Produto.java**: Representa um produto com nome e preço, implementando comparações por preço.
- **Estoque.java**: Gerencia um conjunto de produtos, permitindo adição, remoção e busca.

### Testes Unitários Desenvolvidos

Os testes foram criados para validar o comportamento das classes fornecidas:

- **ProdutoTest.java**
  - Verifica igualdade (`equals`) e código hash (`hashCode`).
  - Testa a ordenação baseada em preço (`compareTo`).
  - Confirma getters (`getNome`, `getPreco`).

- **EstoqueTest.java**
  - Testa a adição de produtos ao estoque.
  - Valida a remoção e busca de produtos.
  - Confirma a listagem correta dos produtos.

## Como Executar os Testes

1. Clone este repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   ```
2. Navegue até o diretório do projeto e execute os testes via Maven:
   ```sh
   mvn test
   ```

Os testes podem ser executados também diretamente em uma IDE como IntelliJ ou Eclipse.

## Tecnologias Utilizadas

- **Java**
- **JUnit 5**
- **Maven** (para gestão de dependências)

## Observação

> As classes `Produto` e `Estoque` foram fornecidas pelo professor e **não foram implementadas por mim**. Meu foco foi desenvolver e validar os testes unitários para garantir o correto funcionamento dessas classes.

