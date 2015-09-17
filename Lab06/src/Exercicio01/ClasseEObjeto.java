package Exercicio01;

public class ClasseEObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strObjeto1 = new String("Este objeto é uma instância da classe String");
		System.out.println("Estado da instância de strObjeto1 = " + strObjeto1);
		String strObjeto2 = "Este objeto é uma instância da classe String";
		System.out.println("Estado da instância de strObjeto2 = " + strObjeto2);
		String strObjeto3 = new String("Este objeto é uma outra instância da classe String");
		System.out.println("Estado da instância de strObjeto3 = " + strObjeto3);
		int intObjeto1 = new Integer(20);
		System.out.println("Estado da instância de intObjeto1 = " + intObjeto1);
	}

}
