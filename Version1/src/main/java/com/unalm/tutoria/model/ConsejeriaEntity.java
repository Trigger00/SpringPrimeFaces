package com.unalm.tutoria.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "consejeria", catalog = "oficina")
public class ConsejeriaEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CICLO", unique = true, nullable = false)
	private String ciclo;

	@JoinColumn(name = "matricula", referencedColumnName = "matricula")
	@ManyToOne(fetch = FetchType.LAZY)
	private AlumnosEntity alumnos;

	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_codigo", nullable = false)
	private Profesor profesor;

	public ConsejeriaEntity() {
		super();
	}

	public ConsejeriaEntity(String ciclo, AlumnosEntity alumnos,
			Profesor profesor) {
		super();
		this.ciclo = ciclo;
		this.alumnos = alumnos;
		this.profesor = profesor;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public AlumnosEntity getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(AlumnosEntity alumnos) {
		this.alumnos = alumnos;
	}

}

