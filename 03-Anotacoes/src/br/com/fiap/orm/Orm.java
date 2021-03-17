package br.com.fiap.orm;

import br.com.fiap.tds.annotation.Tabela;

public class Orm {

	public String gerarPesquisa(Object object) {
		// Obter a anota��o @Tabela da classe
		Tabela anotacao = object.getClass().getAnnotation(Tabela.class);

		// Recuperar o par�metro nome da anota��o
		String nome = anotacao.nome();
		return "SELECT * FROM " + nome;
	}

}
