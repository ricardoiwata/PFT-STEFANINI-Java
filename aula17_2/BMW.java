package com.stefanini.MaratonaDev.entidades;

import com.stefanini.MaratonaDev.orientacaoaobjeto.Carro;
import com.stefanini.MaratonaDev.orientacaoaobjeto.Conversivel;
import com.stefanini.MaratonaDev.orientacaoaobjeto.Esportivo;
import com.stefanini.MaratonaDev.orientacaoaobjeto.Utilitario;

public class BMW extends Carro implements Conversivel, Utilitario {

    public BMW() {
        super();
    }


    @Override       // Sobreesctrita de um metodo
    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
        return velocidadeFinal / tempoFinal;
    }

    @Override
    public void piscarAlerta() {
        System.out.println("BMW piscando alerta...");
    }

    @Override
    public void passear() {

    }

    @Override
    public void acionarTurbo() {

    }

    @Override
    public void abrirCapo() {

    }
}
