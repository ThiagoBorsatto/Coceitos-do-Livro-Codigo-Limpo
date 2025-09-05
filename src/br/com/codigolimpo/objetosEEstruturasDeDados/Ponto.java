package br.com.codigolimpo.objetosEEstruturasDeDados;

// Caso Abstrato

public interface Ponto {
    double getX();
    double getY();
    void setCartesian(double x, double y);
    double getR();
    double getTheta();
    void setPolar(double r, double theta);
}
