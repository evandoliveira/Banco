package Exercicio02;
import java.util.Date;
public class ExemploMetodoEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		System.out.println("1 " + UtilData.agora(data));
		
		UtilData idata = new UtilData();
		System.out.println("2 " + idata.agora(data));
		System.out.println("3 " + idata.DDMMAAAAHHMM(data));
		//UtilData.DDMMAAAAHHMM(data);
	}
}
