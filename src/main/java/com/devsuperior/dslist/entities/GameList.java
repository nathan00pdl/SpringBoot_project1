package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  //Configuração da classe java ('GameList') para equivaler a uma tabela do banco relacional
@Table (name = "tb_game_list")
public class GameList {

	//Declarando atributos
	@Id  //Definição do atributo 'id' como primary key 
	@GeneratedValue (strategy = GenerationType.IDENTITY)  //'id' autoincrementado pelo banco de dados
	private Long id;
	private String name;
	
	//Declarando construtores
	public GameList () {}
	
	public GameList (Long id, String name) {
		this.id = id;
		this.name = name;
	}

	//Declarando métodos getters e setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//Declarando métodos equals e hashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return Objects.equals(id, other.id);
	}	
	
}
