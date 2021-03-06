package br.edu.cesmac.temjobsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.cesmac.temjobsapi.domain.Habilidade;
import br.edu.cesmac.temjobsapi.repository.HabilidadeRepository;

@Service
public class HabilidadeService {
	@Autowired
	private HabilidadeRepository habilidadeRepository;
	
	public Habilidade salvar(Habilidade habilidade) {
		return this.habilidadeRepository.save(habilidade);
	}
	
	public Habilidade atualizar(Habilidade habilidade) {
		return this.habilidadeRepository.save(habilidade);
	}
	
	public List<Habilidade> listar() {
		return this.habilidadeRepository.findAll();
	}
	
	public Optional<Habilidade> pesquisarPorId(Long id) {
		return this.habilidadeRepository.findById(id);
	}
	
	public void remover(Habilidade habilidade) {
		this.habilidadeRepository.delete(habilidade);
	}
	
	public void removerPorId(Long id) {
		this.habilidadeRepository.deleteById(id);
	}
}
