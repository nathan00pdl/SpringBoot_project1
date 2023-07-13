package com.devsuperior.dslist.projections;

//Classe relacionada a consulta SQL feita em 'GameRepository'
public interface GameMinProjection {

	//Declarando métodos getters para cada dado que a consulta irá retornar
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
