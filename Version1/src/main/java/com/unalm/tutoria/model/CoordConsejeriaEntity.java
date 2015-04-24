package com.unalm.tutoria.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coord_consejeria",catalog="oficina")
public class CoordConsejeriaEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="CO_COORD_CONSEJERIA",unique = true, nullable = false)
	private String id;
	
	@Column(name = "ESP_CODIGO")
	private String espCodigo;
	
	@JoinColumn(name = "pro_codigo", referencedColumnName = "pro_codigo")
	@ManyToOne(fetch = FetchType.LAZY)
	private  Profesor profesor;
	
	
	@Column(name = "TPROFE")
	private String tProfe;
	
	@Column(name = "CICLO")
	private String ciclo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEspCodigo() {
		return espCodigo;
	}

	public void setEspCodigo(String espCodigo) {
		this.espCodigo = espCodigo;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String gettProfe() {
		return tProfe;
	}

	public void settProfe(String tProfe) {
		this.tProfe = tProfe;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	
	
	

}
