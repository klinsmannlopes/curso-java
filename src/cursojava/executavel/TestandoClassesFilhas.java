package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Diretor;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutentificacao;
import cursojava.interfaces.PermitirAcesso;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe o senha");
		
		PermitirAcesso secretario = new Secretario(login , senha);
		PermitirAcesso diretor = new Diretor(login , senha);
		
		if(new FuncaoAutentificacao(new Secretario(login , senha)).autentificarCursoJava()) {
			System.out.println("Login secretario feito com sucesso!!!!");
		} else {
			System.out.println("Falha secretario ao realizar login!!!!");
		}
		
		if(new FuncaoAutentificacao(new Diretor(login , senha)).autentificarCursoJava()) {
			System.out.println("Login diretor feito com sucesso!!!!");
		} else {
			System.out.println("Falha diretor ao realizar login!!!!");
		}
	}
}
