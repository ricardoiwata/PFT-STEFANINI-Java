package com.stefanini.MaratonaDev.orientacaoaobjeto;

import com.stefanini.MaratonaDev.entidades.*;

public class Principal {
    static int valor = 10;

    static void print() {
        System.out.println(valor);
    }
    public static void main(String[] args) {
        valor = 10;
        print();


     //   Carro bmw = new Carro(); // invoca o construtor Carro da classe Carro

    /*    bmw.setMarca("BMW");
        bmw.setModelo("M3");
        bmw.setQuilometrosPorLitro(7.5);
        bmw.setVelocidadeMaxima(280);*/

       // Carro mercedes = new Carro("Mercedes", "c180"); // Como se fosse um set <<<<

        BMW bmw2 = new BMW();
        Tesla tesla = new Tesla();
        System.out.println(tesla.isDirigeSozinho());

        bmw2.piscarAlerta();

        try {
            bmw2.setVelocidadeMaxima(-10);
        } catch (NegocioException e) {
            System.out.println(e);
        } finally {
            System.out.println("passou aqui");
        }


        Carro teslaDois = new Tesla();  // Armazendando o Tesla na classe pai; acesso apenas a atributos que sao herdados

        ((Tesla) teslaDois).setDirigeSozinho(true); // CASTING, Transformei o Carro para um tipo especifico TELSA
        System.out.println(((Tesla) teslaDois).isDirigeSozinho());

        teslaDois.piscarAlerta();

       // Carro[] carros = new Carro[]{bmw, bmw2, tesla, teslaDois};

      /*  for (Carro carro : carros) {
            if (Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
                System.out.println("Carro de marca famosa");
            }
                if (carro instanceof Tesla) { // checando se ele é uma instância de Tesla
                    System.out.println(((Tesla) teslaDois).isDirigeSozinho());
                }
        }


        Calcular.soma(0,0);








        bmw2.calcularTaxaAceleracao(100.50, 10);
        tesla.calcularTaxaAceleracao(100.50, 10);



        /*System.out.println(bmw2.calcularTaxaAceleracao(100.5, 10.5));



        System.out.println(mercedes.getMarca());
        System.out.println(mercedes.getModelo());
        System.out.println(mercedes.getQuilometrosPorLitro()); // default value
        System.out.println(mercedes.getVelocidadeMaxima());    // default value


        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getQuilometrosPorLitro());
        System.out.println(bmw.getTaxaAceleracao());
        System.out.println(bmw.getVelocidadeMaxima());

        bmw.acelerar();
        bmw.frear();

        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
        System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
        System.out.println(bmw.calcularTaxaAceleracao(100, 5));*/

    }
}
