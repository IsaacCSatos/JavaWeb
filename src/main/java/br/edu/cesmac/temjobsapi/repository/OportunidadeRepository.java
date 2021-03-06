package br.edu.cesmac.temjobsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.cesmac.temjobsapi.domain.Oportunidade;

@Repository
public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long> {

}
