package com.hfsystems.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfsystems.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
