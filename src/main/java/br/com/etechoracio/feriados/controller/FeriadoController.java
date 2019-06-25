package br.com.etechoracio.feriados.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.com.etechoracio.feriados.dao.FeriadoDao;
import br.com.etechoracio.feriados.model.Feriado;

@RestController
@RequestMapping("/feriado")

public class FeriadoController {
	
	@Autowired
	private FeriadoDao dao;
	
	@GetMapping
	public List<Feriado> listar() {

		return dao.findAll();
		
}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Feriado> buscar(@PathVariable Integer id) {
		Optional<Feriado> resultado =  dao.findById(id);
		if (resultado.isPresent()) {
			return ResponseEntity.ok(resultado.get());
		}
		
		return ResponseEntity.notFound().build();
		
		}

		@PostMapping
		public void inserir(@RequestBody Feriado f) {
			
		dao.save(f);
			
		}
		
		@DeleteMapping("/{id}")
		public void delete(@RequestBody Integer f) {
			
			dao.deleteById(f);
		}
		
		@PutMapping("/{id}")
		public void update(@RequestBody Feriado f ) {
			
			dao.saveAndFlush(f);
		}
			
}