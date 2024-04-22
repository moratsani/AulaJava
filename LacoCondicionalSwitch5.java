package atividade2java;

import java.util.Scanner;

public class LacoCondicionalSwitch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int opcoes, qnt;
		float valorT, preco;
		
		System.out.println("Digite uma opção de 1 a 6: ");
		System.out.println("1 - Cachorro Quente - R$ 10.00\n");
		System.out.println("2 - X-Salada - R$ 15.00\n");
		System.out.println("3 - X-Bacon - R$ 18.00\n");
		System.out.println("4 - Bauru - R$ 12.00\n");
		System.out.println("5 - Refrigerante - R$ 8.00\n");
		System.out.println("6 - Suco de laranja - R$ 13.00\n");
		opcoes = leia.nextInt();
		
		System.out.println("Digite a quantidade desejada: ");
		qnt = leia.nextInt();
		
		switch (opcoes) {
		case 1:
			preco = 10.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu Cachorro Quente, e o total ficou de: R$ %.2f.",valorT);
			break;
		case 2:
			preco = 15.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu X-Salada, e o total ficou de: R$ %.2f.",valorT);
			break;
		case 3:
			preco = 18.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu X-Bacon, e o total ficou de: R$ %.2f.",valorT);
			break;
		case 4:
			preco = 12.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu Bauru, e o total ficou de: R$ %.2f.",valorT);
			break;
		case 5:
			preco = 8.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu Refrigerante, e o total ficou de: R$ %.2f.",valorT);
			break;
		case 6:
			preco = 13.00f;
			valorT = qnt * preco;
			System.out.printf("Você escolheu Suco de laranja, e o total ficou de: R$ %.2f.",valorT);
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		
	}

}
