package controler;
import java.util.ArrayList; 

import model.aluno;

public class ControleAluno {
	public ArrayList<aluno> alunosCadastrados = new ArrayList<aluno>();
	
	public ControleAluno() {
		this.alunosCadastrados = new ArrayList<>();
		this.alunosCadastrados.add(new aluno("Bruno", 27, 07607600,"Masculino", 100));
		this.alunosCadastrados.add(new aluno("Breno", 26, 07607600,"Masculino", 60));
		this.alunosCadastrados.add(new aluno("Joao", 24, 07607600,"Masculino", 150));
		this.alunosCadastrados.add(new aluno("Paula", 20, 07607600,"Feminino", 100));
	}
	
	public void cadastrarAluno(String nome, int idade, long cpf, String genero, float plano) {
		aluno novoAluno = new aluno(nome, idade, cpf, genero, plano);
		alunosCadastrados.add(novoAluno);
	}
	 public ArrayList<aluno> listarAlunos() {
	        return alunosCadastrados;
	    }

}
