package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Gerencia a �nica inst�ncia da EntityManagerFactory
public class EntityManagerFactorySingleton {

	// 1 - Atributo est�tico que armazena a �nica inst�ncia
	private static EntityManagerFactory fabrica;

	// 2- M�todo est�tico que retorna a �nica inst�ncia
	public static EntityManagerFactory getInstace() {
		// Valida se j� existe uma inst�ncia da fabrica
		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("oracle");
		}
		return fabrica;
	}

	// 3 - Construtor privado, nenhuma classe consegue instanciar
	private EntityManagerFactorySingleton() {
	}

}
