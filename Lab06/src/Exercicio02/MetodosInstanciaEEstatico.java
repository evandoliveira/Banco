package Exercicio02;

public class MetodosInstanciaEEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strInst1 = new String("Sou uma instância de objeto da classe String");
		String strInst2 = new String("Viva com paixão!");
		char x = strInst1.charAt(2);
		char y = strInst2.charAt(1);
		char z = strInst2.charAt(0);
		System.out.println("O 3º caracter da strInst1 é = " + x);
		System.out.println("O 2º caracter da strInst2 é = " + y);
		System.out.println("O 1º caracter da strInst2 é = " + z);
		
		boolean b = strInst1.equalsIgnoreCase(strInst2);
		String strInst3 = b ? "Sim" : "Não";
		System.out.println("As variáveis strString1" + " e strInst2 tem o mesmo" + " conjunto de caracteres? " + strInst3);
		
		int i = 23;
		String strInst4 = String.valueOf(i);
		System.out.println("Valor de strInst4 = " + strInst4);
		
		String strInst5 = new String("34");
		int ii = Integer.parseInt(strInst5);
		System.out.println("Valor de ii = " + ii);
		
		String str = "Hello";
		System.out.println(str.endsWith("slo"));
		System.out.println(Math.floor(3.14));
		System.out.println("0=" + Character.isDigit('0'));
		System.out.println("A=" + Character.isDigit('A'));
		
		
		
		
		
	}

}
