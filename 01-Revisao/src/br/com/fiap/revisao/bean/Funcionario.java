package br.com.fiap.revisao.bean;

public class Funcionario {

	// Modificadores de acesso:
	// public - todos;>
	// private - somente a prorpia classe>
	// protected - classes filhas, classes no mesmo pacote>
	// default (package) - > classes no mesmo pacote

	// Tipos primitivos: boolean, byte, short, int, long, char, float, double (s�
	// armazena valor)
	// Valor padr�o: n�meros = 0, boolean = ?

	// Tipos de refer�ncia: String, Integer, Double e classes criadas
	// (cont�m atributos e m�todos)
	// Valor padr�o: null

	// Atributos
	private int id;
	private String nome;
	private int anoNascimento;
	private Genero genero;
	

	// Construtores
	public Funcionario() {
	}

	public Funcionario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	// M�todos
	public void trabalhar() {
		System.out.println("Funcion�rio trabalhando...");
	}

	public void receberBonificacao() {
		System.out.println("Funcion�rio recebendo bonus");
	}

	// Sobrecarga - > mesmo m�todo com parametros diferentes
	public void trabalhar(int horas) {
		System.out.println("Trabalhando " + horas);
	}

	public void trabalhar(int horas, boolean extra) {
		System.out.println("Trabalhando " + horas + " extras: " + extra);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
