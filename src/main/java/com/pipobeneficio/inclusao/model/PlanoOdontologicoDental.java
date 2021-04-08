package com.pipobeneficio.inclusao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;


@Entity
@Table(name = "tb_plano_odontologico_dental")
public class PlanoOdontologicoDental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Min(value = 1, message = "O campo deve ter no minimo valor maior do que zero")
	private float peso;

	@Min(value = 1, message = "O campo deve ter no minimo valor maior do que zero")
	private float altura;

	@OneToOne
	@JoinColumn(name="usuario_id", referencedColumnName = "id")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
