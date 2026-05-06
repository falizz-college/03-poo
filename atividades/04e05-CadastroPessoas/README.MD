# Sistema de Cadastro de Pessoas

Este projeto simula um sistema de cadastro de pessoas em uma instituição, permitindo registrar diferentes tipos de indivíduos (clientes, funcionários, gerentes, etc.), além de gerenciar operações de inclusão, consulta e tratamento de exceções.

## Tipos de Pessoas

O sistema permite cadastrar os seguintes tipos de pessoas:

* **Cliente**
* **Cliente VIP**
* **Funcionário**
* **Gerente**

Todas as pessoas herdam atributos básicos da classe `Pessoa`.

## Atributos das Pessoas

A classe `Pessoa` contém os seguintes atributos principais:

* `String nome`: Nome da pessoa.
* `String cpf`: CPF da pessoa.
* `Data dataNascimento`: Data de nascimento da pessoa.

Classes específicas podem conter atributos adicionais, por exemplo:

* **Cliente**: Possui atributos como limite de crédito.
* **Cliente VIP**: Estende `Cliente`, podendo ter benefícios exclusivos.
* **Funcionário**: Contém atributos como salário e função.
* **Gerente**: Estende `Funcionario`, adicionando permissões de gerenciamento.

## Estrutura do Sistema

Além das classes de pessoas, o sistema conta com:

* `Data`: Classe para manipulação de datas (como data de nascimento ou de admissão).
* `PessoaService`: Classe responsável por gerenciar cadastros e operações sobre as pessoas.
* `QuantidadeExcedidaException`: Exceção personalizada para tratar quando o número de cadastros ultrapassa o limite permitido.
* `CadastroPessoas`, `Main` e `TestaCadastro`: Classes que inicializam e testam o funcionamento do sistema.

## Funcionalidades do Sistema

O sistema implementa as seguintes funções:

1. **Cadastrar Pessoa**: Permite registrar clientes, funcionários ou gerentes no sistema.
2. **Cadastrar Cliente VIP**: Possibilita o registro de clientes com benefícios especiais.
3. **Gerenciar Funcionários e Gerentes**: Registra funcionários e gerentes, associando atributos como salário e função.
4. **Gerenciar Datas**: Utiliza a classe `Data` para armazenar datas relacionadas às pessoas cadastradas.
5. **Tratar Exceções**: Caso o número máximo de cadastros seja excedido, o sistema lança a exceção `QuantidadeExcedidaException`.
6. **Listar Pessoas Cadastradas**: Apresenta informações de todas as pessoas registradas no sistema.
7. **Sair**: Encerra o programa.

## Observação

Este projeto foi desenvolvido como atividade prática de **Programação Orientada a Objetos (POO)**, explorando conceitos como **herança, polimorfismo, encapsulamento e tratamento de exceções** em Java.
