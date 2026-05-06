CREATE DATABASE POO_TarefasPrevistas;

USE POO_TarefasPrevistas;

CREATE TABLE Usuarios (
	id INT AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL,
    empresa VARCHAR(255),
    cidade VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE Tarefas (
	id INT AUTO_INCREMENT,
    userID INT,
	descricao VARCHAR(255) NOT NULL,
    prioridade int NOT NULL,
    categoria VARCHAR(20),
    PRIMARY KEY (id),
    FOREIGN KEY(userID) REFERENCES Usuario(id)
);