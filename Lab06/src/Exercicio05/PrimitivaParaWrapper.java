package Exercicio05;

public class PrimitivaParaWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj = new Integer(7801);
		int intPrimitiva = intObj.intValue();
		System.out.println("int intPrimitiva " + intPrimitiva);
		
		String strInt = "65000";
		int intConvertida = Integer.parseInt(strInt);
		System.out.println("int intConvertida " + intConvertida);
		
		Integer intObj2 = new Integer(intConvertida);
		
	}

}
