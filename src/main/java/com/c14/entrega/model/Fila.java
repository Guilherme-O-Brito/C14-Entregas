package com.c14.entrega.model;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Fila<T> {
    
    List<T> elements = new ArrayList<T>();
    int size = 0;

    public void enfileirar(T element){
        elements.add(element);
        size++;
    }

    public T removerFila(){
        if(filaVazia())
            throw new EmptyStackException();
        T element = elements.remove(0);
        size--;
        return element;
    }

    public int size(){
        return size;
    }

    public boolean filaVazia(){
        return size == 0;
    }

}
