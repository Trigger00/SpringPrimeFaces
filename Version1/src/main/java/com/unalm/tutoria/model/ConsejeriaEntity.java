package com.unalm.tutoria.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "consejeria", catalog = "elbernab")
public class ConsejeriaEntity implements Serializable {

	/*
	 * @Column(name = "CO_CONSEJERIA" ,nullable = true) private Integer id;
	 */

	@Id
	@JoinColumn(name = "matricula")
	@ManyToOne(fetch = FetchType.LAZY)
	private AlumnosEntity alumnos;

	@Column(name = "co_consejeria")
	private Long coConsejeria;

	@Column(name = "CICLO")
	private String ciclo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pro_codigo")
	private Profesor profesor;

	/*
	 * @Column(name = "pro_codigo") private String proCodigo;
	 */
	public ConsejeriaEntity() {
		super();
	}

	/*
	 * public ConsejeriaEntity( AlumnosEntity alumnos, String proCodigo, String
	 * ciclo) { super(); // this.id = id; this.alumnos = alumnos; this.proCodigo
	 * = proCodigo; this.ciclo = ciclo; }
	 */

	/*
	 * public ConsejeriaEntity(Long coConsejeria) { super(); this.coConsejeria =
	 * coConsejeria;
	 * 
	 * }
	 */
	public ConsejeriaEntity(AlumnosEntity alumnos) {
		super();
		this.alumnos = alumnos;
	}

	/*
	 * public ConsejeriaEntity(AlumnosEntity alumnos, String proCodigo, String
	 * ciclo, Long coConsejeria) { super(); this.alumnos = alumnos;
	 * this.proCodigo = proCodigo; this.ciclo = ciclo; this.coConsejeria =
	 * coConsejeria; }
	 */

	public Long getCoConsejeria() {
		return coConsejeria;
	}

	public ConsejeriaEntity(AlumnosEntity alumnos, Long coConsejeria,
			String ciclo, Profesor profesor) {
		super();
		this.alumnos = alumnos;
		this.coConsejeria = coConsejeria;
		this.ciclo = ciclo;
		this.profesor = profesor;
	}

	public void setCoConsejeria(Long coConsejeria) {
		this.coConsejeria = coConsejeria;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public AlumnosEntity getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(AlumnosEntity alumnos) {
		this.alumnos = alumnos;
	}

	/*
	 * public String getProCodigo() { return proCodigo; }
	 * 
	 * public void setProCodigo(String proCodigo) { this.proCodigo = proCodigo;
	 * }
	 */

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	/*
	 * public Integer getId() { return id; }
	 * 
	 * public void setId(Integer id) { this.id = id; }
	 */

}
