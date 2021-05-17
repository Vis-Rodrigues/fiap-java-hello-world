package br.com.fiap.tds;

public class Variavel {
	
	public static void main(String[] args) {
		
//		Tipos primitvos inteiros
		int idade = 10;
		double preco = 9.99;
		char genero = 'M';
		boolean temFilhos = true;
		
		System.out.println("---------------------------");
		System.out.println("Tipos primitivos inteiros");
		System.out.println("---------------------------");
		System.out.println(idade);
		System.out.println(preco);
		System.out.println(genero);
		System.out.println(temFilhos);
		
		
		System.out.println("-----------------");
		System.out.println("CONVERSÀO E CAST");
		System.out.println("-----------------");	
		int x = 10;
		double d = x;
		long l = x;
		float f = x;
		
		int intRecebeDouble = (int) preco;
		System.out.println(intRecebeDouble);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
	
	}
}
