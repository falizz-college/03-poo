package org.test;

import org.main.Estoque;
import org.main.Produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    public void setUp() {
        estoque = new Estoque();
        produto1 = new Produto("Produto 1", 10.0);
        produto2 = new Produto("Produto 2", 20.0);
    }

    @Test
    public void testAdicionarProduto() {
        assertTrue(estoque.adicionarProduto(produto1), "Produto 1 deve ser adicionado com sucesso");
        assertFalse(estoque.adicionarProduto(produto1), "Adicionar o mesmo produto duas vezes deve retornar false");
    }

    @Test
    public void testRemoverProduto() {
        estoque.adicionarProduto(produto1);
        assertTrue(estoque.removerProduto("Produto 1"), "Produto 1 deve ser removido com sucesso");
        assertFalse(estoque.removerProduto("Produto 1"), "Remover um produto inexistente deve retornar false");
    }

    @Test
    public void testBuscarProduto() {
        estoque.adicionarProduto(produto1);
        assertNotNull(estoque.buscarProduto("Produto 1"), "Produto 1 deve ser encontrado no estoque");
        assertNull(estoque.buscarProduto("Produto 2"), "Produto 2 não deve ser encontrado no estoque");
    }

    @Test
    public void testListarProdutos() {
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        Set<Produto> produtosListados = estoque.listarProdutos();

        assertEquals(2, produtosListados.size(), "O estoque deve conter 2 produtos");
        assertTrue(produtosListados.contains(produto1), "O estoque deve conter o Produto 1");
        assertTrue(produtosListados.contains(produto2), "O estoque deve conter o Produto 2");
    }
}