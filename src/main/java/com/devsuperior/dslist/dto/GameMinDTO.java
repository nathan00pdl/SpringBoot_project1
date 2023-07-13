package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

//Versão da classe 'Game', porém com apenas alguns atributos selecionados
public class GameMinDTO {

	// Declarando atributos 
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	//Declarando construtores
	public GameMinDTO() {}
	
	//Construtor que recebe dados da entidade
	//OBS: não seria necessário o uso do comando 'this' nesse caso (não há ambiguidade)
	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	//Declarando métodos 'getters' 
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public Integer getYear() {
		return year;
	}

	
	public String getImgUrl() {
		return imgUrl;
	}

	
	public String getShortDescription() {
		return shortDescription;
	}
}
