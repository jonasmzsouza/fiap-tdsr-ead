package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NANO_COURSE")
@SequenceGenerator(name = "nanoCourse", sequenceName = "SQ_TB_NANO_COURSE", allocationSize = 1)
public class NanoCourse {

	@Id
	@Column(name = "cd_nano_course")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nanoCourse")
	private int codigo;

	@Column(name = "nm_nano_course", length = 100, nullable = false)
	private String nome;

	@Column(name = "nr_creditos", nullable = false)
	private Integer creditos;

	@Enumerated(EnumType.STRING)
	@Column(name = "ds_nivel")
	private NivelCurso nivel;

	// Mapemaneto do relacionamento muitos-para-muitos bidirecional
	@ManyToMany(mappedBy = "nanoCourses")
	private List<Aluno> alunos;

	public NanoCourse() {
	}

	public NanoCourse(String nome, Integer creditos, NivelCurso nivel) {
		super();
		this.nome = nome;
		this.creditos = creditos;
		this.nivel = nivel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public NivelCurso getNivel() {
		return nivel;
	}

	public void setNivel(NivelCurso nivel) {
		this.nivel = nivel;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
