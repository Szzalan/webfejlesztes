package com.zalan.webfejlesztes.service;

import com.zalan.webfejlesztes.dto.GameDto;
import com.zalan.webfejlesztes.entity.Game;
import com.zalan.webfejlesztes.mapper.GameMapper;
import com.zalan.webfejlesztes.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameMapper gameMapper;
    private final GameRepository gameRepository;

    @Override
    public GameDto saveGame(GameDto game) {
        Game savedGame = gameRepository.save(gameMapper.mapGameDtoToGameEntity(game));

        return gameMapper.mapGameEntityToGameDto(savedGame);
    }
}
