package br.com.stefanini.orientacaoaoobjeto.executor;
import br.com.stefanini.orientacaoaoobjeto.Carro;
import br.com.stefanini.orientacaoaoobjeto.BMW;

public class Executor {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setMarca("BMW");
		carro1.setModelo("320i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9999");
		carro1.setBancos(5);
		carro1.setVelocidade(280);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getBancos());
		
		System.out.println(carro1.acelerar());
		
		Carro carro2 = new Carro("BMW");
		System.out.println(carro2.GetMarca);
		
		System.out.println(soma(10+5, 0));
		System.out.println(soma(10+4+5, 0));
		
		BMW
	}
	
		public static int soma(int a, int b) {
			return a+b;
		}
		public static int soma(int a, int b, int c) {
			return a+b+c;
		}
		
		
		

		
	}


