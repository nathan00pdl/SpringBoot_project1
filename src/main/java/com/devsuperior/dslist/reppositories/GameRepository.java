package com.devsuperior.dslist.reppositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

//Essa interface representa um 'objeto de acesso a dados', responsável por fazer as consultas no banco de dados
//OBS: Será utilizado uma ferramenta disponibilizada pelo próprio Spring (jpaRepository)

public interface GameRepository extends JpaRepository<Game, Long>{

	//Consulta SQL customizada
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	
	List<GameMinProjection> searchByList(Long listId);
	
}
