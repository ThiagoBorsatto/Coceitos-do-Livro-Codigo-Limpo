package br.com.codigolimpo.classes;

import java.util.LinkedList;
import java.util.List;

// Classe com coesão, onde os métodos usam todas variáveis, mesmo que o size() use apenas uma delas.

public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<Integer>();

    public int size() {
        return topOfStack;
    }

    public void puch(int element) {
        topOfStack++;
        elements.add(element);
    }

    public int pop() //throws PoppedWhenEmpty
    {
        //if (topOfStack == 0)
        //  throw new PoppedWhenEmpty();
        int element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
}
