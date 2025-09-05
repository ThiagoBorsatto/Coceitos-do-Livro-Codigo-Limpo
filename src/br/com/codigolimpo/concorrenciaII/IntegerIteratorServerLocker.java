package br.com.codigolimpo.concorrenciaII;

public class IntegerIteratorServerLocker {
    private Integer nextValue = 0;

    public synchronized Integer getNextOrNull() {
        if (nextValue < 100000)
            return nextValue++;
        else
            return null;
    }
}
