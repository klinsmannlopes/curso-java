package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.excecao.ExcecaoProcessarNota;
import cursojava.classesauxiliares.FuncaoAutentificacao;
import cursojava.constantes.StatusAlunos;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//lerArquivo();
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe o senha");
			
			
			if(new FuncaoAutentificacao(new Diretor(login, senha) ).autentificarCursoJava() ) 
			{
			
				List<Aluno> alunos = new ArrayList<Aluno>();
				
				HashMap<String , List<Aluno>> maps = new HashMap<String , List<Aluno>>();
				
		
				for (int qtd = 1; qtd <= 1; qtd++) {
					Aluno aluno = new Aluno();
					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					aluno.setNome(nome);
					/*
					 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
					 * dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
					 * String rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
					 * JOptionPane.showInputDialog("CPF?"); String nomeMae =
					 * JOptionPane.showInputDialog("Nome da mãe?"); String dataMatricula =
					 * JOptionPane.showInputDialog("Data Matricula?"); String nomeEscola =
					 * JOptionPane.showInputDialog("Nome da Escola?"); String serieMatricula =
					 * JOptionPane.showInputDialog("Serie da matricula?");
					 * 
					 * 
					 * Aluno aluno = new Aluno(); 
					 * aluno.setNome(nome);
					 * aluno.setIdade(Integer.valueOf(idade));
					 * aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
					 * aluno.setNumeroCpf(cpf); aluno.setNomeMae(nomeMae);
					 * aluno.setDataMatricula(dataMatricula); aluno.setNomeEscola(nomeEscola);
					 * aluno.setSerieMatricula(serieMatricula);
					 */
		
					for (int i = 0; i <= 0; i++) {
		
						String nomeDisciplina = JOptionPane.showInputDialog("Disciplina?");
						String nota = JOptionPane.showInputDialog("Nota da disciplina?");
		
						
						
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						//disciplina.setNota(Double.valueOf(nota));
		
						aluno.getDisciplinas().add(disciplina);
					}
		
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
		
					if (escolha == 0) {
		
						int continueRemover = 0;
						int pos = 1;
		
						while (continueRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
							aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - pos);
							pos++;
							continueRemover = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
						}
					}
					
					
					System.out.println(aluno.getAlunoAprovado());
					alunos.add(aluno);
				}
				
				maps.put(StatusAlunos.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.RECUPERACAO, new ArrayList<Aluno>());
				
				for (Aluno aluno : alunos) {
					if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAlunos.APROVADO)) {
						maps.get(StatusAlunos.APROVADO).add(aluno);
					}
					else 
					if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAlunos.REPROVADO) ) {
						maps.get(StatusAlunos.REPROVADO).add(aluno);
					} 
					else 
					if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
						maps.get(StatusAlunos.RECUPERACAO).add(aluno);
					}
					
					
					/*
					switch (aluno.getAlunoAprovado()) {
					case StatusAlunos.APROVADO:
						alunosAprovados.add(aluno);
						break;
					case StatusAlunos.REPROVADO:
						alunosAprovados.add(aluno);
						break;
					case StatusAlunos.RECUPERACAO:
						alunosAprovados.add(aluno);
						break;
					default:
						break;
					}
					*/
					
				}
				
				System.out.println("******************* Lista Aprovados *******************");
				for(Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
					System.out.println("Resultado: "+aluno.getNome() + " Media: " + aluno.getMediaNota());
				}
				
				System.out.println("******************* Lista Reprovados *******************");
				for(Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
					System.out.println("Resultado: "+aluno.getNome() + " Media: " + aluno.getMediaNota());
				}
				
				System.out.println("******************* Lista Recuperação *******************"); 
				for(Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
					System.out.println("Resultado: "+aluno.getNome() + " Media: " + aluno.getMediaNota());
				}
				
				
				/*
				 * Aluno aluno1 = new Aluno(); aluno1.setNome("Alex");
				 * 
				 * Aluno aluno2 = new Aluno(); aluno2.setNome("Alex");
				 * 
				 * if(aluno1.equals(aluno2)) { System.out.println("Alunos são iguais"); } else {
				 * System.out.println("Alunos não são iguais"); }
				 */
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showConfirmDialog(null, "Erro inesperado: " + e.getClass().getName());
		}
		finally {
			JOptionPane.showConfirmDialog(null, "Obrigado por aprender java");
		}
	}
	
	public static void lerArquivo() throws ExcecaoProcessarNota {
	
		try {
			File fil = new File("C:\\lines.txt");
			Scanner scanner = new Scanner(fil);
		} catch (FileNotFoundException e) {
			throw new ExcecaoProcessarNota("teste");
		}
	}
}
