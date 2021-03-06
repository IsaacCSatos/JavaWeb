package br.edu.cesmac.temjobsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.cesmac.temjobsapi.domain.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {

}
