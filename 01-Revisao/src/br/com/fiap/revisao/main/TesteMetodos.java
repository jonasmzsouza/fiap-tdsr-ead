package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Gerente;

public class TesteMetodos {

	public static void main(String[] args) {

		// Instaciar um funcion�rio
		Funcionario f = new Funcionario();

		// Chamar o m�todo receberBonificacao
		f.receberBonificacao();

		// Instaciar um gerente
		Gerente g = new Gerente();

		// Chamar o m�todo receberBonificacao
		g.receberBonificacao();

		Funcionario func = new Gerente();
		func.receberBonificacao();

	}

}
