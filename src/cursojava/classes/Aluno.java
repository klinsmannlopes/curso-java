package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAlunos;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Aluno() {
		
	}
	
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setNome(String nome) {
		super.nome = nome;
	}
	
	public String getNome() {
		return super.nome;
	}

	public int getIdade() {
		return super.idade;
	}

	public void setIdade(int idade) {
		super.idade = idade;
	}

	public String getDataNascimento() {
		return super.dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		super.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return super.registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		super.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return super.numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		super.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return super.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		super.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricula() {
		return serieMatricula;
	}

	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}	

	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNota();
		}
		
		return (somaNotas / disciplinas.size());
	}
	
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		
		if(media >= 50) {
			if(media >= 70) {
				return StatusAlunos.APROVADO;
			} else {
				return StatusAlunos.RECUPERACAO;
			}
		} else {
			return StatusAlunos.REPROVADO;
		}
		
		
		//return media >= 70 ? true : false ;
	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
				+ serieMatricula + ", disciplinas=" + this.disciplinas.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
}
