package atividade2java;

import java.util.Scanner;

public class LacoCondicionalSwitch8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float saldo = 1000.00f;
		float saldoAtual, valorDep, saque;
		int banco;
		
		System.out.println("Digite um número de 1 a 3 para as opções abaixo:");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		
		banco = leia.nextInt();

		switch(banco) {
		case 1:
			System.out.printf("\nOperação - Saldo \nO seu saldo é: R$ %.2f",saldo);
			break;
		case 2:
			System.out.println("\nOperação - Saque \nDigite o valor a sacar: ");
			saque = leia.nextFloat();
			if (saldo < saque) {
				System.out.println("\nSaldo Insuficiente!");
			} else {
				saldoAtual = saldo - saque;
				System.out.printf("\nO seu saldo agora é: R$ %.2f",saldoAtual);
			}
			break;
		case 3:
			System.out.println("Operação - Depósito \nDigite o valor a depositar: ");
			valorDep = leia.nextFloat();
			saldoAtual = saldo + valorDep;
			System.out.printf("\nO seu novo saldo é de: R$ %.2f",saldoAtual);
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}

	}

}
