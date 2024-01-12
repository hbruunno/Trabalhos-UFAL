package model;



public class aluno {
	private String nome;
	private int idade;
	private long cpf;
	private String genero;
	private float plano;
	
	public aluno(String nome, int idade, long cpf, String genero, float plano){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.plano = plano;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPlano() {
		return plano;
	}
	public void setPlano(float plano) {
		this.plano = plano;
	}

}
