package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.bean.Combustivel;
import br.com.fiap.bean.Veiculo;

public class CadastroTeste {

	public static void main(String[] args) {

		// Obter uma inst�ncia da fabrica de EntityManager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");

		// Obter uma inst�ncia do EntityManager
		EntityManager em = fabrica.createEntityManager();

		// Instancia um veiculo sem o codigo (Estado : novo n�o gerenciado)
		Veiculo veiculo = new Veiculo("FIAT", "PRETO", new GregorianCalendar(2021, Calendar.MAY, 5), Combustivel.FLEX,
				false);

		// Cadastrar o veiculo
		// Passar o objeto veicuylo para o entity manger gerenciar
		em.persist(veiculo);

		// Come�ar uma transa��o
		em.getTransaction().begin();

		// Finalizar a transa��o com commit
		em.getTransaction().commit();

		System.out.println("Veiculo registrado");

		// Fechar
		em.close();
		fabrica.close();

	}

}
