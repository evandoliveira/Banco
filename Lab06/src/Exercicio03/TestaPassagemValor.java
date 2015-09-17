package Exercicio03;

public class TestaPassagemValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println("Inicia método main e i = " + i);
		test(i);
		System.out.println("Termina o método main e i = " + i);
		
	}
	public static void test(int j){
		System.out.println("Inicia método test e j = " + j);
		j = 33;
		System.out.println("Termina o método test e j = " + j);
		
		
	}
	
}
