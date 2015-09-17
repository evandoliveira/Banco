package exercicio04;

public class TresTiposDeVariaveis {

	static String staticVariable = "Variável de classe ou estática";
	String instanceVariable = "Variável de instância";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String localVariable = "Variável local";
		System.out.println("Variável estática = " + staticVariable);
		System.out.println("Variável de instância = " + new TresTiposDeVariaveis().instanceVariable);
		System.out.println("Variável local = " + localVariable);
	}

}
