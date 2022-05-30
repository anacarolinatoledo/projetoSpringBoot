package com.letscode.interfaces;

import java.util.List;

import com.letscode.domain.Agencia;

public interface AgenciaCRUD {

	
	/*CRIAÇÃO DE INTERFACE PARA AS OPERAÇÕES
	* PRINCIPAIS DE UMA AGENCIA
	*/
	
	public List<Agencia> getAllAgencia();


	public Agencia getAgenciaById(long id);
		
	
	public Agencia save(Agencia obj);
	
	public void delete(long id);
	
	public Agencia update(long id, Agencia obj);
	
	
	
}
