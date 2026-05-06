CREATE DATABASE POO_CadastroProdutos;

USE POO_CadastroProdutos;

DROP TABLE Produto;

SHOW TABLES;

CREATE TABLE Produto(
	CodigoProduto INT AUTO_INCREMENT,
    TipoProduto VARCHAR(255),
    DescricaoProduto VARCHAR(255),
    PesoProduto DECIMAL(5,2),
    QuantidadeProduto INT,
    UnidadeMedidaProduto VARCHAR(255),
    PRIMARY KEY (CodigoProduto)
);

SHOW TABLES;

SELECT * FROM produto;