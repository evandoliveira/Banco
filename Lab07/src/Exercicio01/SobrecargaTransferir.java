package Exercicio01;

public class SobrecargaTransferir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaService operacoesConta = new ContaService();
		
		Conta conta1 = new Conta();
		conta1.setNumero(1234567890);
		conta1.setSaldo(500.00);
		
		Conta conta2 = new Conta();
		conta2.setSaldo(50.00);
		
		Conta conta3 = new Conta();
		
		System.out.println("Transferir 400,00 de conta1 para conta2");
		operacoesConta.transferir(conta1, 400.00, conta2);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());

		operacoesConta.transferir(conta1, 200.00, conta2, 300);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());

		System.out.println("Transferir 100,00 de conta2 para conta3");
		operacoesConta.transferir(conta2, 100.00, conta3);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());

		operacoesConta.transferir(conta2, 100.00, conta3,500);
		System.out.println("O saldo da conta1 é " + conta1.getSaldo());
		System.out.println("O saldo da conta2 é " + conta2.getSaldo());
		System.out.println("O saldo da conta3 é " + conta3.getSaldo());

	}

}
