package com.letscode.controller;

import java.util.List;

import com.letscode.domain.Extrato;
import com.letscode.service.ExtratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtratoController {
	
	@Autowired
	private ExtratoService extratoService;
	
	@GetMapping("/extratos")
    public ResponseEntity<List<Extrato>> getAllExtratos() {
		List<Extrato> list = extratoService.getAllExtrato();
		return ResponseEntity.ok().body(list);
    }
	
	@GetMapping("/extrato/{id}")
    public ResponseEntity<List<Extrato>> getAllExtratosById(@PathVariable("id") long id) {
			List<Extrato> obj = extratoService.getAllExtratoporCliente(id);
    		return ResponseEntity.ok().body(obj);
	
}
	}
    