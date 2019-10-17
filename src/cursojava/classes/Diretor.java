package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login; 
	private String senha;
	
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	@Override
	public boolean autentificar() {
		return this.login.equals("diretor") && this.senha.equals("diretor");
	}
	
	@Override
	public boolean autentificar(String login, String senha) {
		return this.autentificar();
	}
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	
}
