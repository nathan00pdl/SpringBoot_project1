package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

//Camada 'controller' -> Porta de entrada para o back end

@RestController
@RequestMapping (value = "/lists")  //Especificação do nome do endpoint
public class GameListController {

	@Autowired //"injeção" de uma instância da classe 'GameListService' na classe 'GameListController'
	private GameListService gameListService;

	//Declarando formato das requisições que serão retornadas pelo 'Postman'
	//Busca por todos os dados
	@GetMapping
	public List<GameListDTO> findAll(){
		 return gameListService.findAll();
	}
}
