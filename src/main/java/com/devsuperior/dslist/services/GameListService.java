package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.reppositories.GameListRepository;



@Service  //"Registrando" a classe 'GameService' no sistemas   
public class GameListService {

	@Autowired //"injeção" de uma instância da classe 'GameListRepository' na classe 'GameListService'
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();  //'findAll()' é um método disponibilizado pelo próprio Spring
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
