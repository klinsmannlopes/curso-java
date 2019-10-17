package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutentificacao {

	private PermitirAcesso acesso;
	
	public FuncaoAutentificacao(PermitirAcesso acesso) {
		this.acesso = acesso;
	}
	
	public boolean autentificarCursoJava() {
		return acesso.autentificar();
	}
	
}
