package br.com.fiap.tds;

import java.util.Scanner;

public class EntradaDados {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("***** MENU *****");
		System.out.println("1 - Verificar Idade");
		System.out.println("2 - Verificar IMC");
		System.out.println("Digite a opção desejada: ");
		byte opcao = sc.nextByte();
		
		switch (opcao) {
		case 1:
			verificarIdade();
			break;
		case 2:
			calcularImc();
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

		sc.close();

	}

	private static void calcularImc() {
		float altura, peso, imc;

		System.out.println("******* CALCULO IMC *******\n");

		System.out.println("Digite a altura: ");
		altura = sc.nextFloat();

		System.out.println("Digite o peso: ");
		peso = sc.nextFloat();

		imc = peso / (altura * altura);
		System.out.println("IMC: ".concat(String.valueOf(imc)));

		if (imc >= 18.5 && imc <= 25) {
			System.out.println("Parabéns! Peso ideal! :)");
		} else {
			System.out.println("Fora do peso normal! :(");
		}
	}

	private static void verificarIdade() {
		System.out.println("Digite a idade: ");
		short idade = sc.nextShort();

		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();

		System.out.println("Nome: ".concat(nome));
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else if (idade >= 18 && idade <= 50) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idade da sabedoria");
		}
	}

}
