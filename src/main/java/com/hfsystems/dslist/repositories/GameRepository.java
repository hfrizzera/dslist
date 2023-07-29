package com.hfsystems.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfsystems.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
