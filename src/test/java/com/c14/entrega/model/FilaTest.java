package com.c14.entrega.model;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FilaTest {

    @Test
    public void testFilaVazia(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        boolean vazia = filaInteiros.filaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testFilaEnfileirar(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(22);
        int tamanho = filaInteiros.size();
        assertEquals(1, tamanho);
    }

    @Test
    public void testFilaRemover(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.enfileirar(22);
        filaInteiros.removerFila();
        int tamanho = filaInteiros.size();
        assertEquals(0, tamanho);
    }

    @Test(expected = EmptyStackException.class)
    public void testRemoverFilaException(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        filaInteiros.removerFila();
    }

    @Test
    public void testFilaRetorno(){
        Fila<Integer> filaInteiros = new Fila<Integer>();
        int valor = 22;
        filaInteiros.enfileirar(valor);
        int retorno = filaInteiros.removerFila();
        assertEquals(valor, retorno);
    }    

}
