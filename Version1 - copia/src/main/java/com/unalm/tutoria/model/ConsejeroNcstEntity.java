package com.unalm.tutoria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consejero_ncst", catalog = "elbernab")
public class ConsejeroNcstEntity implements Serializable {

	@Id
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "PRO_CODIGO")
	private String proCodigo;

	@Column(name = "PREGUNTA")
	private String pregunta;
	@Column(name = "RESPUESTA")
	private String respuesta;

	@Column(name = "CICLO")
	private String ciclo;

	@Column(name = "FECHA_ING")
	private String fechaIng;
	@Column(name = "HORA_ING")
	private String horaIng;
	

	public ConsejeroNcstEntity() {
		super();
	}
	
	public ConsejeroNcstEntity(String matricula) {
		super();
		this.matricula = matricula;
	}
	public ConsejeroNcstEntity(String matricula, String proCodigo,
			String pregunta, String respuesta, String ciclo, String fechaIng,
			String horaIng) {
		super();
		this.matricula = matricula;
		this.proCodigo = proCodigo;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.ciclo = ciclo;
		this.fechaIng = fechaIng;
		this.horaIng = horaIng;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getProCodigo() {
		return proCodigo;
	}
	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getFechaIng() {
		return fechaIng;
	}
	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}
	public String getHoraIng() {
		return horaIng;
	}
	public void setHoraIng(String horaIng) {
		this.horaIng = horaIng;
	}
	
	
	

}
