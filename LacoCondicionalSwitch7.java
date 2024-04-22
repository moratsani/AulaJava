package atividade2java;

import java.util.Scanner;

public class LacoCondicionalSwitch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numero1, numero2, opcao, resultado;

		System.out.println("Por favor, ó grande usuário, digite o primeiro número: ");
		numero1 = leia.nextInt();

		System.out.println("Por favor, ó grande usuário, digite o segundo número: ");
		numero2 = leia.nextInt();

		System.out.println("Selecione uma opção:");
		System.out.println("*** 1 - Somar os numeros ***");
		System.out.println("*** 2 - Subtrair os numeros ***");
		System.out.println("*** 3 - Multiplicar os numeros ***");
		System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");
		
		opcao = leia.nextInt();
		
		leia.close();
		
		switch (opcao) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("O resultado da soma é: "+resultado);
				break;
			case 2:
				if (numero1 > numero2) {
					resultado = numero1 - numero2;
					System.out.println("O resultado da subtração de N1 - N2 é: "+resultado);
				} else {
					resultado = numero2 - numero1;
					System.out.println("O resultado da subtração N2 - N1 é: "+resultado);
				}
				break;
			case 3:
				resultado = numero1 * numero2;
				if (resultado %2 == 0) {
					System.out.println("O resultado da multiplicação é: "+resultado+" e é um número par");
				} else {
					System.out.println("O resultado da multiplicação é: "+resultado+" e é um número ímpar");
				}
				break;
			case 4:
				resultado = numero1 / numero2;
				if (resultado %2 == 0 && resultado >= 0) {
					System.out.println("O resultado da divisão do primeiro número pelo segundo é: "+resultado +" e o número é par e positivo!");
				} else if (resultado %2 != 0 && resultado < 0) {
					System.out.println("O resultado da divisão do primeiro número pelo segundo é: "+resultado +" e o número é ímpar e negativo");
				} else if (resultado %2 == 0 && resultado < 0) {
					System.out.println("O resultado da divisão do primeiro número pelo segundo é: "+resultado +" e o número é par e negativo");
				} else if (resultado %2 != 0 && resultado >= 0) {
					System.out.println("O resultado da divisão do primeiro número pelo segundo é: "+resultado +" e o  número é ímpar e positivo!");
				}
				break;
			default: 
				System.out.println("Opção inválida, digite de 1 a 4");
				break;
		}

	}

}

