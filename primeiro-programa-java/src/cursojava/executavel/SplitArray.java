package cursojava.executavel;


import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		String texto = "Alessandro, curso java, 80, 70, 90, 89";
		
		
		String[] ValoresArray = texto.split(",");
		
		
		/*Convertendo um array em uma lista*/
		List<String> list = Arrays.asList(ValoresArray);
		
		for (String valorString : list) {
			
			System.out.println(valorString);
			
		}
		
		/*Converter uma lista para Array*/
		String[] conversaoArray = list.toArray(new String[list.size()]);
		
		for(int posicao = 0; posicao < conversaoArray.length;posicao++) {
			System.out.println(conversaoArray[posicao]);
		}
		
	}

}
