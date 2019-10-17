package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelExperiencia;
	private String experiencia;
	
	private String login; 
	private String senha;
	
	
	public Secretario() {
		super();
	}
	
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	@Override
	public boolean autentificar() {
		return this.login.equals("admin") && this.senha.equals("admin");
	}
	
	@Override
	public boolean autentificar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autentificar();
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelExperiencia() {
		return nivelExperiencia;
	}
	public void setNivelExperiencia(String nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}
