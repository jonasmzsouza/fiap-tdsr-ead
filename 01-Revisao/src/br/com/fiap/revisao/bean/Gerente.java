package br.com.fiap.revisao.bean;

public class Gerente extends Funcionario {

	// Sobre escrita > mesmo m�todo da classe pai na classe filha
	@Override
	public void receberBonificacao() {
		System.out.println("Gerente recebeu super b�nus");
	}

}
