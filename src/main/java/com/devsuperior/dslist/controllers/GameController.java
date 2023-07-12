package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

//Camada 'controller' -> Porta de entrada para o back end

@RestController
@RequestMapping (value = "/games")
public class GameController {

	@Autowired //"injeção" de uma instância da classe 'GameService' na classe 'GameController'
	private GameService gameService;

	//Declarando o formato das requisoções - 'endpoint' (Postman)
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		 return gameService.findById(id);
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		 return gameService.findAll();
	}
}
