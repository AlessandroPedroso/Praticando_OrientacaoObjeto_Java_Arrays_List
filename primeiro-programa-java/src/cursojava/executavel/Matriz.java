package cursojava.executavel;

public class Matriz {
	
	/*Executar o código java*/
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 60;
		notas[1][1] = 75;
		notas[1][2] = 31;
		
		/*percorre as linhas*/
		for(int posicaoLinha = 0; posicaoLinha < notas.length; posicaoLinha ++) {
			
			System.out.println("======================================================");
			/*Percorre as colunas*/
			for(int posicaoColuna = 0; posicaoColuna < notas[posicaoLinha].length; posicaoColuna++) {
				
				System.out.println("Valor da matriz: " + notas[posicaoLinha][posicaoColuna]);
				
			}
		}
		
		
		
		
	}
}
