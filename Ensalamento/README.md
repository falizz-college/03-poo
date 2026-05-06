# Ensalamento - Alocação de Estudantes em Turmas

Este projeto em Java implementa um sistema de **ensalamento** para alocar estudantes em turmas de uma instituição de ensino, de acordo com o curso no qual estão matriculados e as disciplinas ministradas por seus respectivos professores.

## Estrutura do Projeto

O projeto contém as seguintes classes:

- **Pessoa**: Classe abstrata que representa uma pessoa na instituição. Tanto `Aluno` quanto `Professor` herdam desta classe.
- **Aluno**: Herda de `Pessoa` e contém um atributo de `Curso`, representando o curso ao qual o aluno está vinculado.
- **Professor**: Herda de `Pessoa` e possui uma disciplina na qual é titular.
- **Disciplina**: Representa uma disciplina associada a um curso específico.
- **Curso**: Representa um curso que possui uma ou mais disciplinas associadas.
- **Turma**: A turma realiza a alocação de um professor, uma disciplina e os alunos vinculados ao curso da disciplina.
- **Ensalamento**: Classe responsável por criar os objetos, realizar o ensalamento e exibir os resultados.

### Dados Utilizados

Os dados abaixo foram inseridos diretamente no código (hard-coded):

#### Alunos e Cursos
- Alfredo - TI
- Amélia - TI
- Ana - ADM
- Bruno - TI
- Bentinho - ADM
- Capitú - TI
- Debora - TI
- Ian - ADM
- Iracema - TI
- Joelmir - ADM
- Julieta - TI
- Luana - ADM
- Luciana - TI
- Majô - ADM
- Maria - ADM
- Norberto - TI
- Paulo - ADM
- Romeu - ADM
- Wendel - TI
- Zoey - TI

#### Professores e Disciplinas
- Mia - POO (Programação Orientada a Objetos) - Curso de TI
- Saulo - Estrutura de Dados - Curso de TI
- Paula - BI (Business Intelligence) - Curso de ADM

#### Cursos
- **TI**: Possui as disciplinas de Programação Orientada a Objetos (POO) e Estrutura de Dados.
- **ADM**: Possui a disciplina de Business Intelligence (BI).

## Execução

O código realiza o ensalamento da seguinte forma:
1. Inicializa os cursos, disciplinas, alunos e professores.
2. As turmas são criadas com base nos professores e disciplinas.
3. Alunos são alocados automaticamente às turmas se estiverem matriculados no curso correspondente à disciplina.
4. O resultado final do ensalamento (alocação de alunos nas turmas) é exibido diretamente no terminal.

### Saída do Programa

A saída do programa mostra:

- O professor responsável pela turma.
- A disciplina ministrada.
- A lista de alunos matriculados na turma, de acordo com o curso.

### Execução

Ao executar o código Java, o programa apresentará diretamente no terminal a alocação dos alunos para as respectivas turmas. Não há necessidade de entrada de dados pelo usuário.
