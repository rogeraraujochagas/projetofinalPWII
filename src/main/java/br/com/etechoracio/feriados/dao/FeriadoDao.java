package br.com.etechoracio.feriados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.feriados.model.Feriado;

public interface FeriadoDao extends JpaRepository<Feriado, Integer> {

}