# Cálculo de Taxas e Impostos sobre Produtos e Serviços

## Descrição
Esta atividade de Programação Orientada a Objetos implementa o cálculo de taxas e impostos aplicados sobre produtos e serviços. O objetivo é garantir que cada tipo de taxa seja corretamente aplicada ao tipo de bem correspondente, evitando a cobrança indevida.

## Taxas Aplicadas
A atividade foi realizada considerando três taxas específicas:

- **ICMS**: Taxa de **13,2%**, aplicada tanto a produtos quanto a serviços.
- **IPI**: Taxa de **21,9%**, aplicada somente a produtos.
- **ISS**: Taxa de **7,3%**, aplicada somente a serviços.

## Estrutura do Código
O código é composto pelas seguintes classes:

- **ICMS**: Responsável por calcular e aplicar a taxa de ICMS sobre produtos e serviços.
- **IPI**: Responsável por calcular e aplicar a taxa de IPI sobre produtos.
- **ISS**: Responsável por calcular e aplicar a taxa de ISS sobre serviços.
- **Taxar**: Classe principal para aplicar as taxas apropriadas com base no tipo (produto ou serviço).
- **Main**: Classe principal onde são criadas instâncias de produtos e serviços para teste.

## Funcionamento
1. Um objeto da classe `Taxar` é criado, informando o tipo (`"produto"` ou `"serviço"`) e o valor.
2. O método `calculartaxas()` é chamado para calcular as taxas aplicáveis e exibir o valor total.
3. Para produtos, são aplicadas as taxas **ICMS** e **IPI**.
4. Para serviços, são aplicadas as taxas **ICMS** e **ISS**.
