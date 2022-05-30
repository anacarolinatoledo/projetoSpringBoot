package com.letscode.repositories;

import com.letscode.domain.Cliente;
import com.letscode.domain.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {
	ContaCorrente findByCliente(Cliente cliente);
	
}