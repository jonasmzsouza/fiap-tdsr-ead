package br.com.fiap.revisao.main;

public class TesteTernario {

	public static void main(String[] args) {

		int x = 10;

		if (x > 10) {
			System.out.println("X � maior do que 10");
		} else {
			System.out.println("X � menor ou igual a 10");
		}

		// Tern�rio
		System.out.println(x > 10 ? "X � maior do que 10" : "X � menor ou igual a 10");

	}

}
