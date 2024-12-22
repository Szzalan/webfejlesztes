package com.zalan.webfejlesztes.service;

import com.zalan.webfejlesztes.dto.GameDto;

import java.util.List;

public interface GameService {
    void saveGame(GameDto game);
    List<GameDto> getAllGames();
    void deleteGame(Long id);

    void updateGame(Long id, int price);
}
