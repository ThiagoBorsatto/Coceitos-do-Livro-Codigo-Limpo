package br.com.codigolimpo.objetosEEstruturasDeDados;

public interface Vehicle {
    // Método concreto: podemos ver que só à métodos getter e setter.
    double getFuelTankCapacityInGallons();
    double getGallonsOfGasoline();

    // Método abstrato: não podemos dizer qual o tipo de dado.
    double getPercentFuelRemaining();

    // Devemos preferir o segundo já que ele não expoem nossos tanto nosso dados.
}
