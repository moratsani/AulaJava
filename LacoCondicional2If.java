package atividade2java;

import java.util.Scanner;

public class LacoCondicional2If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero %2 == 0 && numero >= 0) {
			System.out.println("O número é par e positivo!");
		} else if (numero %2 != 0 && numero < 0) {
			System.out.println("O número é ímpar e negativo!");
		} else if (numero %2 == 0 && numero < 0) {
			System.out.println("O número é par e negativo!");
		} else if (numero %2 != 0 && numero >= 0) {
			System.out.println("O número é ímpar e positivo!");
		}
	}
}
