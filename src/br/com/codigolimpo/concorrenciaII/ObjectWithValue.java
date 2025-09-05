package br.com.codigolimpo.concorrenciaII;

import java.util.concurrent.atomic.AtomicInteger;

public class ObjectWithValue {
    /*
    private AtomicInteger value = new AtomicInteger(0);

    public void incrementValue() {
        value.incrementAndGet();
    }

    public int getValue() {
        return value.get();
    }

    int variableBeingSet;
    void simulateNonBlockingSet(int newValue) {
        int currentValue;
        do {
            currentValue = variableBeingSet;
        } while (currentValue != compareAndSwap(currentValue, newValue));
    }

    int synchronized compareAndSwap(int currentValue, int newValue) {
        if (variableBeingSet == currentValue) {
            variableBeingSet = newValue;
            return currentValue;
        }
        return variableBeingSet;
    }
     */
}
