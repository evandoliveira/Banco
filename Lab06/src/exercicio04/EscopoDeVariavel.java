package exercicio04;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		int var2 = 15;
		if (var1 < 100) {
			var2 = 20;
		} else {
			var2 = 21;
		}
		System.out.println("Valor de var1 = " + var1);
		System.out.println("Valor de var2 = " + var2);		
	}

}
