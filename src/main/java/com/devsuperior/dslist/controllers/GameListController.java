package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.ReplacementDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

//Camada 'controller' -> Porta de entrada para o back end

@RestController
@RequestMapping (value = "/lists")  //Especificação do nome do endpoint
public class GameListController {

	@Autowired //"injeção" de uma instância da classe 'GameListService' na classe 'GameListController'
	private GameListService gameListService;
	
	@Autowired //"injeção" de uma instância da classe 'GameService' na classe 'GameListController'
	private GameService gameService;
	

	//Declarando formato das requisições que serão retornadas pelo 'Postman'
	//Busca por todos os dados
	@GetMapping
	public List<GameListDTO> findAll(){
		 return gameListService.findAll();
	}
	
	//Busca por todos os dados
	@GetMapping (value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		return gameService.findByList(listId);
	}
	
	@PostMapping (value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
