package com.letscode.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letscode.domain.ContaCorrente;
import com.letscode.domain.Extrato;

public interface ExtratoRepository extends JpaRepository<Extrato, Long> {
	List<Extrato> findByContaCorrente(ContaCorrente contaCorrente);
	
	
}