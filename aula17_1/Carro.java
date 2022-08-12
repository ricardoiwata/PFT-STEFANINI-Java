package com.stefanini.MaratonaDev.orientacaoaobjeto;

public abstract class Carro {

    // Atributos


    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int taxaAceleracao;
    private double quilometrosPorLitro;

    // Construtores

    public Carro() {
        System.out.println("Construindo Carro....");
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }



    // Metodos
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public abstract void piscarAlerta();

    public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial) {
        return (velocidadeFinal - velocidadeInicial) / (tempoFinal - tempoInicial) * 3.6;
    }

    public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
      return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
      return "" + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
    }

    // Getters and Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException {
        if (velocidadeMaxima < 0) {
            throw new NegocioException("Valor é inválido");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public int getTaxaAceleracao() {
        return this.taxaAceleracao;
    }

    public void setTaxaAceleracao(int taxaAceleracao) {
        this.taxaAceleracao = taxaAceleracao;
    }

    public double getQuilometrosPorLitro() {
        return this.quilometrosPorLitro;
    }

    public void setQuilometrosPorLitro(double quilometrosPorLitro) {
        this.quilometrosPorLitro = quilometrosPorLitro;
    }

}
