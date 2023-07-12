package com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.dslist.entities.Game;

//Observações:
//Essa classe servirá apenas para padronização 
//(padrão de camadas -> controllers, services, repository)
//A camada 'services' irá retornar para a camada 'controllers' dados padronizados em DTO enão como entidade (entity -> classe Game)

public class GameDTO {

	//Declarando atributos
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	//Declarando construtores
	public GameDTO() {}
	
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);  //Passagem de tudo que está na entidade (Game) para esse DTO (GameDTO)
	}

	//Obs: Com o uso do método 'BeansUtils' é necessário a declaração tanto dos métodos getters como setters  
	
	//Declarando métodos getters e setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

}
 	