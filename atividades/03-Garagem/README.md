# Sistema de Estacionamento Rotativo

## Descrição
Este projeto é uma atividade de Programação Orientada a Objetos (POO) desenvolvida para ensinar o uso de **herança (extends) em Java**. A aplicação simula um **estacionamento rotativo** onde diferentes tipos de veículos podem ser cadastrados, considerando características específicas e preços por hora de permanência.

## Estrutura do Projeto
O sistema contém diferentes tipos de automóveis, todos herdando de uma classe base chamada **Veiculos**.

### Classe `Veiculos`
A classe base **Veiculos** contém:
- Variáveis para o **tipo** e **complemento do tipo** do veículo;
- Variável para o **peso do veículo** (com limite máximo de **6000 kg**);
- Variável para o **preço por hora** de estacionamento;
- Métodos abstratos `setTipo()` e `setTipoComplemento()` implementados nas subclasses;
- Métodos para definir peso, validar limite e calcular o preço por hora.

### Tipos de Veículos e Regras de Negócio
Cada tipo de veículo tem suas características e restrições específicas:

#### **Motocicleta**
- **Tipos:** Leve, Padrão, Pesada;
- Motocicletas com peso superior a **400 kg** não são aceitas no estacionamento.

#### **Carro**
- **Tipos:** Hatchback, Sedan, SUV;
- Carros com peso superior a **2000 kg** são classificados automaticamente como **Furgão**.

#### **Furgão**
- **Tipos:** Carregado, Não carregado;
- Se o volume do furgão ultrapassar **18 m³**, ele não é aceito no estacionamento.

#### **Caminhonete**
- **Tipos:** Carregada, Não carregada;
- Definição do preço por hora com base no peso do veículo.

## Estrutura de Classes
- `Veiculos.java` (classe abstrata base para todos os veículos);
- `Motocicleta.java` (subclasse de `Veiculos`);
- `Carro.java` (subclasse de `Veiculos`);
- `Furgao.java` (subclasse de `Veiculos`);
- `Caminhonete.java` (subclasse de `Veiculos`);
- `Gerenciar.java` (classe responsável por interagir com o usuário e gerenciar o estacionamento);
- `Main.java` (classe principal para execução do sistema).

## Funcionalidades
Inserir um novo veículo no estacionamento;
Definir o tipo e características do veículo;
Calcular automaticamente o preço por hora;
Verificar restrições de peso e volume;
Sair do sistema quando desejado.
