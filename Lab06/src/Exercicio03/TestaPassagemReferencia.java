package Exercicio03;

import java.util.Arrays;

public class TestaPassagemReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {10, 20, 30};
		System.out.println("Inicia método main e i = " + Arrays.toString(i));
		test(i);
		System.out.println("Termina método main e i = " + Arrays.toString(i));		
	}
	public static void test(int[] j){
		System.out.println("Inicia método test e j = " + Arrays.toString(j));
		j[0] = 33;
		j[1] = 66;
		System.out.println("Termina método test e j = " + Arrays.toString(j));		
	}
}
