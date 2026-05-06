# Estudo de Estruturas de Dados com Cidades

## Descrição do Projeto
Este projeto tem como objetivo estudar diferentes estruturas de dados em Java utilizando informações sobre cidades brasileiras. Foram utilizadas três abordagens diferentes para organizar e exibir as cidades, cada uma explorando diferentes estruturas de dados.

## Estruturas de Dados Utilizadas

### 1. **Map (HashMap com TreeSet)**
   - Organiza as cidades em um **Map** onde a chave é a sigla do estado (UF) e o valor é um **TreeSet** contendo os nomes das cidades ordenados alfabeticamente.
   - Essa estrutura permite agrupar as cidades por estado e garantir que elas fiquem ordenadas.

### 2. **PriorityQueue**
   - Utiliza uma **PriorityQueue** para armazenar as cidades, com prioridade para as capitais.
   - As capitais aparecem primeiro e, dentro dessa classificação, a ordenação segue a ordem alfabética.

### 3. **TreeSet com Comparator Personalizado**
   - Armazena as cidades em um **TreeSet**, ordenando-as em ordem alfabética inversa (da Z para A).

## Estrutura do Código

### Classe `Cidade`
A classe `Cidade` representa uma cidade com os seguintes atributos:
- `nome`: Nome da cidade.
- `uf`: Sigla do estado ao qual a cidade pertence.
- `capital`: Indica se a cidade é uma capital.

Esses atributos correspondem às colunas de um possível banco de dados que armazenaria as cidades.

### Classe `Estrutura1` (Map)
- Utiliza um `HashMap<String, Set<String>>`, onde a chave é a UF e o valor é um `TreeSet` de cidades.
- Método `inserirMapa(ArrayList<Cidade> cidades)`: Popula o mapa agrupando as cidades por UF.
- Método `exibirMapa()`: Exibe a lista de cidades por estado, ordenadas alfabeticamente.

### Classe `Estrutura2` (PriorityQueue)
- Utiliza uma `PriorityQueue<Cidade>` com um `Comparator` que prioriza capitais.
- Método `inserirCidades(ArrayList<Cidade> cidades)`: Adiciona as cidades à fila.
- Método `exibirCidades()`: Exibe e remove as cidades da fila em ordem de prioridade.

### Classe `Estrutura3` (TreeSet com Comparator Personalizado)
- Utiliza um `TreeSet<Cidade>` que ordena as cidades em ordem alfabética inversa.
- Método `inserirCidades(ArrayList<Cidade> cidades)`: Insere cidades no conjunto.
- Método `exibirCidades()`: Exibe as cidades na ordem definida pelo `Comparator`.

### Classe `Main`
- Instancia uma lista de cidades e adiciona exemplos.
- Executa as três estruturas, chamando os métodos de inserção e exibição.

## Conclusão
Este estudo comparativo permite analisar como diferentes estruturas de dados podem ser usadas para organizar e exibir informações de maneira eficiente. Cada estrutura tem suas vantagens, dependendo do objetivo da aplicação.
