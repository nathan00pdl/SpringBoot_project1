package com.devsuperior.dslist.reppositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

//Essa interface representa um 'objeto de acesso a dados', responsável por fazer as consultas no banco de dados
//OBS: Será utilizado uma ferramenta disponibilizada pelo Spring (jpaRepository)

public interface GameRepository extends JpaRepository<Game, Long>{

}
