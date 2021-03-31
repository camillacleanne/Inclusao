package com.pipobeneficio.inclusao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PlanoOdontologicoDental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	 
	private long id;
	
	@NotBlank (message = "O campo nao pode ser nulo")
	@Size(min = 5, max = 100, message = "O campo deve ter no minimo 100 caracteres")
	private String nome;
	
	@NotBlank (message = "O campo nao pode ser nulo")
	@Size(min = 2, max = 12, message = "O campo deve ter no minimo 12 caracteres")
	private String cpf;
	
	@Min(value = 0, message = "O campo deve ter no minimo valor maior do que zero" )
	private float peso;
	
	@Min(value = 0, message = "O campo deve ter no minimo valor maior do que zero" )
	private float altura;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
}
