package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote, Integer> {

	// 3 - Buscar por um transporte (Objecto Transporte
	List<Pacote> buscarPorTransporte(Transporte transporte);

}
