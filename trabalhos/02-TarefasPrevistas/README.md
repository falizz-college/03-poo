# POO - Tarefas Previstas

## Descrição do Projeto
Este é um sistema de gerenciamento de tarefas desenvolvido em Java com MySQL. O sistema permite que usuários se cadastrem, autentiquem e gerenciem tarefas com diferentes prioridades e categorias. A autenticação é obrigatória para acessar as funcionalidades do sistema.

## Tecnologias Utilizadas
- **Java** (JDK 17+)
- **MySQL**
- **H2 Database** (para testes)
- **JUnit 5** (para testes unitários)

## 📌 Funcionalidades  
✔ Cadastro de usuários  
✔ Autenticação de usuários através do e-mail  
✔ Criação, edição e remoção de tarefas  
✔ Associação de tarefas a usuários  
✔ Classificação de tarefas por prioridade e categoria  
✔ Persistência de dados usando MySQL  
✔ Testes unitários com JUnit e banco H2  

## 📂 Estrutura do Projeto  
O projeto segue uma estrutura organizada em pacotes:  

```
/src
│── main/java/com/TarefasPrevistas
│   │── Main.java  # Classe principal para execução
│   │── /Usuario
│   │   │── Usuario.java  # Modelo de usuário
│   │   │── UsuarioCRUD.java  # Operações no banco de dados
│   │   │── UsuarioService.java  # Regras de negócio
│   │   │── UsuarioAutenticacao.java  # Controle de login
│   │── /Tarefa
│   │   │── Tarefa.java  # Modelo de tarefa
│   │   │── TarefaCRUD.java  # Operações no banco de dados
│   │   │── TarefaService.java  # Regras de negócio
│   │   │── TarefaController.java  # Controle de tarefas
│── /test/java/com/TarefasPrevistas  # Testes unitários
│   │── TarefaServiceTest.java
│   │── UsuarioServiceTest.java
/TarefasPrevistasDB
│── scriptDB.sql  # Script de criação do banco
```

## Configuração do Banco de Dados
O script do banco de dados pode ser encontrado no repositório em [database](./Database/scriptDB.sql). Certifique-se de executar o script antes de iniciar o sistema.

## Como Executar o Projeto
1. **Baixe o repositório e importe no IntelliJ/Eclipse**
2. **Configure o banco de dados** no `Main.java`:
   ```java
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/POO_TarefasPrevistas", "TarefasPrevistasTester", "1234");
   ```
3. **Execute a classe `Main`** para testar a autenticação e listagem de tarefas.

## Executando os Testes
Para rodar os testes unitários, utilize o IntelliJ ou rode via terminal com:
```
mvn test
```
Isso executa os testes de autenticação de usuário e manipulação de tarefas no banco H2 em memória.

