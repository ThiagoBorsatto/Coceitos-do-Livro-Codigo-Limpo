package br.com.codigolimpo.concorrencia;

public class ThreadJigglePoint {
    public static void jiggle() {
    }
}

/*
public synchronized String nextUrLorNull() {
    if(hasNext()) {
        ThreadJigglePoint.jiggle();
        String url = urlGenerate.next();
        ThreadJigglePoint.jiggle();
        updateHasNext();
        ThreadJigglePoint.jiggle();
        return url;
    }
}
 */
