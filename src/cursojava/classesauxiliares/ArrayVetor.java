package cursojava.classesauxiliares;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		Disciplina disciplina = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		
		double[] notas = {2.3, 5.5, 9.8, 10 };
		
		aluno.setNome("klinsmann");
		aluno.setNomeEscola("teste");
		aluno2.setNome("lopes");
		aluno2.setNomeEscola("teste 2");
		
		
		disciplina.setDisciplina("Dados");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		disciplina2.setDisciplina("Java 2");
		disciplina2.setNota(notas);
		aluno2.getDisciplinas().add(disciplina2);
		
		alunos.add(aluno);
		alunos.add(aluno2);
		
		for (Aluno a : alunos) {
			System.out.println(a.getNome());
			
			for (Disciplina dis : a.getDisciplinas()) {				
				System.out.println("Cadeira: " + dis.getDisciplina());
				
				for (double d : dis.getNota()) {
					int bim = 1;
					System.out.println("Nota do " + bim + " bimestre: " + d);
					bim++;
				}
				
				for (int i = 0; i < 4; i++) {
					System.out.println("Nota do " + i + " bimestre: " + dis.getNota()[i]);
					
				}
				
			}
			
		}
		
		System.out.println("***************");
		
		for(Disciplina d : aluno.getDisciplinas() ) {
			System.out.println(d.toString());
		}
		
		
		
		
	}
	
}
