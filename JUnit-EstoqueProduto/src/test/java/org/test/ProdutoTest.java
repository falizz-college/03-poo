package org.test;

import org.main.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testEquals() {
        Produto produto1 = new Produto("Produto A", 15.0);
        Produto produto2 = new Produto("Produto A", 20.0); // Mesmo nome, preço diferente
        Produto produto3 = new Produto("Produto B", 15.0);

        assertEquals(produto1, produto2, "Produtos com o mesmo nome devem ser considerados iguais");
        assertNotEquals(produto1, produto3, "Produtos com nomes diferentes devem ser considerados diferentes");
    }

    @Test
    public void testHashCode() {
        Produto produto1 = new Produto("Produto A", 15.0);
        Produto produto2 = new Produto("Produto A", 20.0);

        assertEquals(produto1.hashCode(), produto2.hashCode(), "Produtos iguais devem ter o mesmo hashCode");
    }

    @Test
    public void testCompareTo() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto B", 20.0);
        Produto produto3 = new Produto("Produto C", 10.0);

        assertTrue(produto1.compareTo(produto2) < 0, "Produto com preço menor deve ser considerado menor");
        assertTrue(produto2.compareTo(produto1) > 0, "Produto com preço maior deve ser considerado maior");
        assertEquals(0, produto1.compareTo(produto3), "Produtos com o mesmo preço devem ser considerados iguais");
    }

    @Test
    public void testGetNome() {
        Produto produto = new Produto("Produto X", 25.0);
        assertEquals("Produto X", produto.getNome(), "O nome do produto deve ser 'Produto X'");
    }

    @Test
    public void testGetPreco() {
        Produto produto = new Produto("Produto Y", 30.0);
        assertEquals(30.0, produto.getPreco(), "O preço do produto deve ser 30.0");
    }
}
