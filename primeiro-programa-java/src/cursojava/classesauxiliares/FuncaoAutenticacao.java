package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato da interface de PermitirAcesso e chamar o autenticar*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso acessoPermitir;
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		
		this.acessoPermitir = acesso;
	}
	
	public boolean autenticar() {
		return acessoPermitir.autenticar();
	}
}
