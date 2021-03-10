package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Funcionario;
import br.com.fiap.revisao.bean.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		//Instanciar um funcion�rio
		Funcionario funcionario = new Funcionario(1, "Jonas");
		
		//Atribuir um valor para o genero
		funcionario.setGenero(Genero.MASCULINO);
		
		//Validar se o funcion�rio � Feminino
		if (funcionario.getGenero() == Genero.FEMININO) {
			System.out.println("Feminino");
		}
		
		System.out.println(funcionario.getGenero());

	}

}
