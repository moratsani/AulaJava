package atividade2java;

import java.util.Scanner;

public class LacoCondicional1If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if (soma > c) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (soma < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else if (soma == c){
			System.out.println("A soma de A + B é Igual a C");
		}
	}

}
