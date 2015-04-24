package com.unalm.tutoria.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="profesor")
public class Profesor implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "pro_codigo")
	private String pro_codigo;
	
	@Column(name = "pro_paterno")
	private String pro_paterno;
	
	@Column(name = "pro_materno")
	private String pro_materno;
	
	@Column(name = "pro_nom")
	private String pro_nom;
	
	@Column(name = "pro_nombre")
	private String pro_nombre;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "dep_codigo")
	private String dep_codigo;
	
	@Column(name = "ubigeo")
	private String ubigeo;
	
	@Column(name = "direccion")
	private String direccion;
	
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "activo")
	private String activo;
	
	@Column(name = "email_unalm")
	private String email_unalm;

	@Column(name = "perso")
	private Long perso;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor")
	private Set<ConsejeriaEntity> consejeroEntity = new HashSet<ConsejeriaEntity>(
			0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profesor")
	private Set<CoordConsejeriaEntity> coordConsejeria = new HashSet<CoordConsejeriaEntity>(0);

	public Profesor() {
		super();
	}

	public String getPro_codigo() {
		return pro_codigo;
	}

	public void setPro_codigo(String pro_codigo) {
		this.pro_codigo = pro_codigo;
	}

	public String getPro_paterno() {
		return pro_paterno;
	}

	public void setPro_paterno(String pro_paterno) {
		this.pro_paterno = pro_paterno;
	}

	public String getPro_materno() {
		return pro_materno;
	}

	public void setPro_materno(String pro_materno) {
		this.pro_materno = pro_materno;
	}

	public String getPro_nom() {
		return pro_nom;
	}

	public void setPro_nom(String pro_nom) {
		this.pro_nom = pro_nom;
	}

	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDep_codigo() {
		return dep_codigo;
	}

	public void setDep_codigo(String dep_codigo) {
		this.dep_codigo = dep_codigo;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getEmail_unalm() {
		return email_unalm;
	}

	public void setEmail_unalm(String email_unalm) {
		this.email_unalm = email_unalm;
	}

	public Long getPerso() {
		return perso;
	}

	public void setPerso(Long perso) {
		this.perso = perso;
	}

	public Set<ConsejeriaEntity> getConsejeroEntity() {
		return consejeroEntity;
	}

	public void setConsejeroEntity(Set<ConsejeriaEntity> consejeroEntity) {
		this.consejeroEntity = consejeroEntity;
	}

	public Set<CoordConsejeriaEntity> getCoordConsejeria() {
		return coordConsejeria;
	}

	public void setCoordConsejeria(Set<CoordConsejeriaEntity> coordConsejeria) {
		this.coordConsejeria = coordConsejeria;
	}
	
	
	
}