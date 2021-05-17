package br.com.fiap.tds;

public class Operador {
	
	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z = 15;
		
		System.out.println("--------------------");
		System.out.println("     OPERADORES     ");
		System.out.println("--------------------");
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(z-x+y*(x/y));
		
		System.out.println("-------------------------");
		System.out.println("OPERADORES DE ATRIBUICAO");
		System.out.println("-------------------------");
		
		int aux = 10;
		aux += 15; // aux = aux + 15
		System.out.println(aux);
		aux -= 15; // aux = aux - 15
		System.out.println(aux);
		aux *= 15; // aux = aux * 15
		System.out.println(aux);
		aux /= 15; // aux = aux / 15
		System.out.println(aux);
		
		System.out.println("-------------------------------------");
		System.out.println("OPERADORES DE INCREMENTO E DCREMENTO");
		System.out.println("-------------------------------------");
		int a = 20;
		a++; //a= a + 1 - resultado de incremento
		System.out.println(a);
		a--; //a= a - 1 - resultado de decremento
		System.out.println(a);
		
		++a; //a= a + 1 - resultado de incremento
		System.out.println(a);
		--a; //a= a - 1 - resultado de decremento
		System.out.println(a);
		
		int r=10,s=5,t=8;
		r = s++;
		System.out.println("r = "+r);
		System.out.println("s = "+s);

		r = --t;
		System.out.println("r = "+r);
		System.out.println("t = "+t);
		
		System.out.println("-------------------------------------");
		System.out.println("OPERADORES DE IGUALDADE e RELACIONAIS");
		System.out.println("-------------------------------------");
		
		int idade = 15;
		
		System.out.println(idade >= 18);
		System.out.println(idade < 18);
		System.out.println(idade == 15);
		System.out.println(idade != 15);
		
		System.out.println("------------------------------");
		System.out.println("      OPERADORES LÖGICOS      ");
		System.out.println("------------------------------");
		byte _idade = 18;

		boolean precisaVotar = _idade >= 18 && _idade <= 70;
		System.out.println(precisaVotar);

		byte nrAmarelo = 1, nrVermelho = 0;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);

		x = 9;
		y = 11;
		boolean teste = x > 10 ^ y > 10; // ou exclusivo, APENAS uma das condições deve ser verdadeira, ou false, se as duas foram iguais o retorno vai ser false
		System.out.println(teste);

		_idade = 20;
		boolean maiorIdade = !(_idade >= 18);
		System.out.println(maiorIdade);
		
	}
}
