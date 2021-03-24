package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.bean.Veiculo;

public class PesquisaTeste {

	public static void main(String[] args) {

		// Obter uma inst�ncia da fabrica de EntityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		// Obter uma inst�ncia do EntityManager
		EntityManager em = fabrica.createEntityManager();

		// Pesquisar um ve�culo pela PK (codigo)
		// Retorna um objeto gerenciado ou null
		Veiculo veiculo = em.find(Veiculo.class, 1);

		// Exibir os dados do ve�culo
		System.out.println(veiculo);

		veiculo.setCor("Verde");

		em.getTransaction().begin();
		em.getTransaction().commit();

		// Fechar
		em.close();
		fabrica.close();

	}

}
