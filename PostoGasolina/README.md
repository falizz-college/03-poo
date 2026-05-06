# Simulação de Bomba de Combustível

Este projeto simula o funcionamento de uma bomba de combustível, permitindo interações como abastecimento por valor ou por litro, alteração do tipo de combustível, e consulta de informações sobre a bomba.

## Tipos de Combustível

A bomba de combustível oferece os seguintes tipos de combustível:
- **Gasolina**
- **Gasolina Aditivada**
- **Etanol (Álcool)**
- **Diesel**

## Atributos da Bomba de Combustível

A bomba de combustível possui os seguintes atributos:
- `String tipoDeCombustível`: Representa o tipo de combustível selecionado (Gasolina, Gasolina Aditivada, Etanol, Diesel).
- `double valorLitro`: Valor do combustível por litro.
- `double quantidadeCombustivel`: Quantidade de combustível disponível na bomba, em litros.
- `double valorTotalReais`: Valor total gasto pelo usuário na bomba de combustível (em reais).
- `double valorTotalLitros`: Quantidade total de litros abastecidos.

## Informações da Bomba de Combustível

A bomba de combustível oferece as seguintes informações:
- **Tipo de Combustível**: Exibe o tipo de combustível atual na bomba.
- **Valor do Litro**: Mostra o preço do combustível por litro.
- **Quantidade de Combustível**: Apresenta a quantidade de combustível disponível na bomba.
- **Valor Total Abastecido**: Exibe o total abastecido, tanto em reais quanto em litros.

## Funcionalidades da Bomba de Combustível

A bomba de combustível implementa as seguintes funções:

1. **Abastecer por Valor**: Permite ao usuário fornecer um valor em reais e recebe a quantidade correspondente de litros.
2. **Abastecer por Litro**: Permite ao usuário fornecer uma quantidade de litros e recebe o valor a ser pago em reais.
3. **Alterar Valor do Combustível**: Solicita um novo preço para o tipo de combustível selecionado.
4. **Alterar Tipo de Combustível**: Exibe os tipos de combustível disponíveis e permite ao usuário selecionar um tipo. Após a seleção, o valor do combustível pode ser atualizado.
5. **Alterar Quantidade de Combustível na Bomba**: Permite ao usuário definir a quantidade de combustível disponível na bomba.
6. **Status da Bomba**: Exibe informações gerais sobre a bomba de combustível, como o tipo de combustível atual, preço por litro, quantidade disponível, total abastecido, etc.
7. **Sair**: Encerra o programa.
