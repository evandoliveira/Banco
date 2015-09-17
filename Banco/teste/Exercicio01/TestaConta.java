package Exercicio01;

import java.util.Scanner;

import modelo.Conta;
import servico.ContaService;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		
		System.out.println("Digite o saldo inicial da conta");
		double saldoConta = c.nextDouble();
		
		System.out.println("Digite o número da conta");
		int numeroConta = c.nextInt();
		
		ContaService operacoesConta = new ContaService();
		Conta conta1 = new Conta();
		conta1.setNumero(numeroConta);
		conta1.setSaldo(saldoConta);
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		System.out.println("Data de abertura da conta1 é " + conta1.getDataAbertura());
		
		System.out.println("O número da conta1 é " + conta1.getNumero());
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("Será creditado 100 reais na conta1 ");
		
		operacoesConta.depositar(conta1, 100.00);		
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		
		System.out.println("Será debitado 56.43 reais da conta1 ");
		operacoesConta.sacar(conta1, 56.43);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());
		
		System.out.println("Transferir 50,00 reais da conta1 para a conta2");
		operacoesConta.transferir(conta1, 50.00, conta2);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());
		
		operacoesConta.transferir(conta2, 100.23, conta3);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());
	}

}
