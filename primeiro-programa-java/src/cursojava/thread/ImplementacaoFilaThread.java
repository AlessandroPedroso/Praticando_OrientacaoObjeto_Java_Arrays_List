package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread  extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void adiciona(ObjetoFilaThread filaThread) {
		pilha_fila.add(filaThread);
	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
			
			synchronized (pilha_fila) { /*Bloquear o acesso a esta lista por outro processos*/
				
				Iterator iteracao = pilha_fila.iterator();
				
				while(iteracao.hasNext()) {/*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); /*pega o objeto atual*/
					
					/*Processar 10 mil notas fiscais*/
					/*gerar uma lista enorme de pdf*/
					/*gerar um envio em massa de email*/
					
					System.out.println("-------------------------------------------");
					
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					iteracao.remove();
					
					try {
						Thread.sleep(1000);/*dar um tempo para descarga de memoria*/
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			try {
				Thread.sleep(1000);/*processou toda a lista da um tempo para limpeza de memoria*/
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}
}
	
	

