# Repositórios - Programas de POO

## Sobre os Repositórios
Os códigos disponibilizados foram desenvolvidos durante as aulas de Programação Orientada a Objetos (POO) no meu terceiro semestre da faculdade. Eles abordam conceitos fundamentais de POO, como encapsulamento, herança, polimorfismo e manipulação de bancos de dados com JDBC.

## Como Executar os Códigos
### Códigos Básicos (Sem JUnit nem JDBC)
Para executar os códigos que não utilizam JUnit nem JDBC:
1. Baixe ou clone o repositório.
2. Abra o projeto em uma IDE como IntelliJ IDEA ou Eclipse.
3. Compile e execute a classe `Main.java` ou outra classe principal definida no código.

### Códigos que Usam JUnit
Para executar códigos que contêm testes unitários com JUnit:
1. Certifique-se de que o JUnit está configurado no projeto.
2. Utilize uma IDE compatível (IntelliJ IDEA, Eclipse) e rode os testes a partir da aba de testes.
3. Para executar via terminal, utilize:
   ```sh
   mvn test
   ```

### Códigos que Usam JDBC
Para os projetos que utilizam JDBC:
1. Certifique-se de ter o MySQL instalado e em execução.
2. O script para criação da base de dados está disponível no repositório do projeto correspondente.
3. Atualize as credenciais de conexão no código, caso necessário.
4. Execute a classe `Main.java` para testar as funcionalidades.

### Códigos que Usam JUnit e JDBC
Para executar um projeto que combina JUnit e JDBC:
1. Execute o script SQL fornecido no repositório para criar a base de dados.
2. Certifique-se de que o JUnit está configurado corretamente.
3. Execute os testes via IDE ou com o comando:
   ```sh
   mvn test
   ```
Isso garantirá que os testes unitários sejam realizados corretamente, incluindo os que dependem da base de dados.

Caso encontre problemas, verifique se as configurações de conexão com o banco de dados estão corretas e se os drivers JDBC estão configurados no projeto.
