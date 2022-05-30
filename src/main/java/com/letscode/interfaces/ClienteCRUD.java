package com.letscode.interfaces;

import java.util.List;

import com.letscode.domain.Cliente;

public interface ClienteCRUD {

	
	/*CRIAÇÃO DE INTERFACE PARA AS OPERAÇÕES
	* PRINCIPAIS DE UMA AGENCIA
	*/
	
	public List<Cliente> getAllCliente();

	public Cliente getClienteById(long id);		
	
	public Cliente save(Cliente obj);
	
	public void delete(long id);
	
	public Cliente update(long id, Cliente obj);
	
	
	
}
