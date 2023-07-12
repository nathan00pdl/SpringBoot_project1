package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	//Declarando atributos
	private Long id;
	private String name;
	
	//Declarando construtores
	public GameListDTO() {}
	
	public GameListDTO(GameList entity	) {
		id = entity.getId();
		name = entity.getName();
	}

	//Declarando métodos getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
