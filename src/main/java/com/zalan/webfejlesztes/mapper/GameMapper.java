package com.zalan.webfejlesztes.mapper;

import com.zalan.webfejlesztes.dto.GameDto;
import com.zalan.webfejlesztes.entity.Game;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {
    public GameDto mapGameEntityToGameDto(Game game){
        return GameDto.builder()
                .gameName(game.getGameName())
                .creationDate(game.getCreationDate())
                .genre(game.getGenre())
                .price(game.getPrice())
                .studioName(game.getStudioName())
                .build();
    }

    public Game mapGameDtoToGameEntity(GameDto gameDto){
        return Game.builder()
                .gameName(gameDto.getGameName())
                .creationDate(gameDto.getCreationDate())
                .genre(gameDto.getGenre())
                .price(gameDto.getPrice())
                .studioName(gameDto.getStudioName())
                .build();
    }
}
