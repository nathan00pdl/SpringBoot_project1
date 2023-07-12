package com.devsuperior.dslist.reppositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

//Essa interface representa um 'objeto de acesso a dados', responsável por fazer as consultas no banco de dados
//OBS: Será utilizado uma ferramenta disponibilizada pelo próprio Spring (jpaRepository)

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
