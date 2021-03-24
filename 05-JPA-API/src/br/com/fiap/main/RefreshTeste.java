package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.bean.Veiculo;

public class RefreshTeste {

	// Atualiza o objeto com os dados do banco
	public static void main(String[] args) {

		// Obter uma inst�ncia da fabrica de EntityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		// Obter uma inst�ncia do EntityManager
		EntityManager em = fabrica.createEntityManager();

		// Pesquisar um ve�culo de codigo 1
		Veiculo veiculo = em.find(Veiculo.class, 1);

		// Alterar a marca e cor no objeto
		veiculo.setMarca("Honda");
		veiculo.setCor("Vermelho");

		// Exibir os dados do ve�culo
		System.out.println(veiculo);

		// Realizar o refresh
		em.refresh(veiculo);

		// Exibir os dados do ve�culo
		System.out.println(veiculo);

		// Fechar
		em.close();
		em.close();

	}

}
