package com.letscode.service;

import java.util.List;

import com.letscode.domain.Cliente;
import com.letscode.domain.ContaCorrente;
import com.letscode.domain.Extrato;
import com.letscode.repositories.ExtratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letscode.exceptions.ContaCorrenteNotFoundException;
import com.letscode.interfaces.ExtratoCRUD;
import com.letscode.repositories.ContaCorrenteRepository;

@Service
public class ExtratoService implements ExtratoCRUD {

	@Autowired
    ExtratoRepository extratoRepository;
	@Autowired
	ClienteService clienteService;
	@Autowired
	ContaCorrenteService contaCorrenteService;
	@Autowired
	ContaCorrenteRepository contaCorrenteRepository;

	public List<Extrato> getAllExtrato() {
		return extratoRepository.findAll();
	}

	public List<Extrato> getAllExtratoporCliente(Long id) {
		Cliente cliente = clienteService.getClienteById(id);
		ContaCorrente contaCorrente = contaCorrenteService.getContaCorrenteByCliente(cliente);
		List<Extrato> extratoContaCorrenteId = extratoRepository.findByContaCorrente(contaCorrente);

		if (extratoContaCorrenteId.isEmpty() || extratoContaCorrenteId == null) {
			throw new ContaCorrenteNotFoundException("Extrato vazio.");
		} 
		return extratoContaCorrenteId;
	}

}
