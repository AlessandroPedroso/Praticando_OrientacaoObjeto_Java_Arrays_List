package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		/*Thread processando em pararelo do envio de e-mail*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//**********************************DIVIS�O DAS THREADS
		
		Thread threadNotas = new Thread(thread2);
		threadNotas.start();
		
		//********************************************
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DA THREAD");
		/*Fluxo do sistema, cadastro de venda, uma emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continuo executando para o usu�rio");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*codigo da rotina*/
			/*C�digo da rotina que eu querro executar em pararelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo evio de e-mail " + (pos + 1));
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}/*da um tempo*/
				
			}
			/*Fim do c�digo em pararelo*/
			
		}
	};
	
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			/*codigo da rotina*/
			/*C�digo da rotina que eu querro executar em pararelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo evio de nota fiscal " + (pos + 1));
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}/*da um tempo*/
				
			}
			/*Fim do c�digo em pararelo*/
		}
	};
}
