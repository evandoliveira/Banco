package Exercicio02;

public class ExemploVariavelEstatica {
	
	public static void main(String[] args) {
		System.out.println("DOMINGO " + UtilData.DOMINGO);
		System.out.println("SEGUNDA " + UtilData.SEGUNDA);
		System.out.println("QUARTA " + UtilData.QUARTA);
		System.out.println("SABADO " + UtilData.SABADO);
	
		UtilData data = new UtilData();
		System.out.println("JANEIRO " + data.JANEIRO);
		System.out.println("FEVEREIRO " + data.FEVEREIRO);
		System.out.println("ABRIL " + UtilData.ABRIL);
		System.out.println("MARÇO " + data.MARCO);
		
		System.out.println("Dia da semana " + data.DiaDaSemana);
		data.DiaDaSemana = 3;
		System.out.println("Mudou dia da semana " + data.DiaDaSemana);

		UtilData data2 = new UtilData();
		System.out.println("Instância 1 - Dia do mes " + UtilData.DiaDoMes);
		System.out.println("Instância 2 - Dia do mes " + data2.DiaDoMes);
		data2.DiaDoMes = 20;
		System.out.println("Instância 1 - Mudou Dia do mes " + UtilData.DiaDoMes);
		System.out.println("Instância 2 - Mudou Dia do mes " + data2.DiaDoMes);
		
	}
	
}
