package com.persona.Backend.Entity.Operational.GestionFormativa;

import com.persona.Backend.Entity.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name=" modalidad")
public class Modalidad extends BaseEntity{
	
	@Column(name = "codigo", length = 45, nullable = false)
	private String codigo;

	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;
	
	@Column(name = "descripcion", length = 45, nullable = false)
	private String descripcion;
	
	@Column(name = "requiere_presencialidad", length = 45, nullable = false)
	private Boolean requierePresencialidad;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getRequierePresencialidad() {
		return requierePresencialidad;
	}

	public void setRequierePresencialidad(Boolean requierePresencialidad) {
		this.requierePresencialidad = requierePresencialidad;
	}

}
