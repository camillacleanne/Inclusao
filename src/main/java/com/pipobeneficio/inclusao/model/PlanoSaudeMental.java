package com.pipobeneficio.inclusao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class PlanoSaudeMental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	 
	private long id;
	
	@NotBlank (message = "O campo nao pode ser nulo")
	@Size(min = 5, max = 100, message = "O campo deve ter no minimo 100 caracteres")
	private String nome;
	
	@Min(value = 0, message = "O campo deve ter no minimo valor maior do que zero" )
	private double horas;

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

	public double getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}
}
