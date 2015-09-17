package Exercicio05;

public class CastingPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numInt = 10;
		double numDouble = numInt;
		System.out.println("int = " + numInt + " implicitamente moldado para double = " + numDouble);
		
		int numInt1 = 3;
		int numInt2 = 2;
		double numDouble2 = numInt1 / numInt2;
		System.out.println("numInt1 / numInt2 = " + numInt1 / numInt2 + " implicitamente moldado para double = " + numDouble2);
		
		double valDouble = 10.12;
		int valInt = (int) valDouble;
		System.out.println("double = " + valDouble + " explicitamente moldado para int = " + valInt);

		double x = 10.2;
		int y = 2;
		int res = (int) (x / y);
		System.out.println("x / y = " + (x / y) + " explicitamente moldado para int = " + res);
	
	
	}

}
