package br.edu.cesmac.temjobsapi.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Oportunidade {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "oportunidade_id")
	private Long id;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descricao;
	
	@NotEmpty
	private String dataInicio;
	
	@NotEmpty
	private String dataTermino;
	
	@NotNull
	@JsonIgnoreProperties("oportunidades")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	
	@NotNull
	@NotEmpty
	@ManyToMany
	@JoinTable(
		name = "oportunidade_habilidade",
		joinColumns = @JoinColumn(name = "oportunidade_id"),
		inverseJoinColumns = @JoinColumn(name = "habilidade_id")
	)
	private List<Habilidade> habilidades;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
}
