package Exercicio02;

import java.util.Calendar;
import java.util.Date;

public class UtilData {
	static int DOMINGO = Calendar.SUNDAY;
	static int SEGUNDA = Calendar.MONDAY;
	static int TERCA = Calendar.TUESDAY;
	static int QUARTA = Calendar.WEDNESDAY;
	static int QUINTA = Calendar.THURSDAY;
	static int SEXTA = Calendar.FRIDAY;
	static int SABADO = Calendar.SATURDAY;
	
	int JANEIRO = Calendar.JANUARY;
	int FEVEREIRO = Calendar.FEBRUARY;
	static int MARCO = Calendar.MARCH;
	static int ABRIL = Calendar.APRIL;
	static int MAIO = Calendar.MAY;
	static int JUNHO = Calendar.JUNE;
	static int JULHO = Calendar.JULY;
	static int AGOSTO = Calendar.AUGUST;
	static int SETEMBRO = Calendar.SEPTEMBER;
	static int OUTUBRO = Calendar.OCTOBER;
	static int NOVEMBRO = Calendar.NOVEMBER;
	static int DEZEMBRO = Calendar.DECEMBER;
	
	static int DiaDoMes = Calendar.DAY_OF_MONTH;
	
	static int DiaDaSemana = Calendar.DAY_OF_WEEK;
	
	static {
		System.out.println("Entrando no bloco estático");
		Date data = Calendar.getInstance().getTime();
		System.out.println("Saindo do bloco estático. Data = " + agora(data));
	}
	static String agora(Date data) {
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
	String DDMMAAAAHHMM (Date data) {
		return new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm").format(data);
	}
}
