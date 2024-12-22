package com.zalan.webfejlesztes.service;

import com.zalan.webfejlesztes.dto.GameDto;
import com.zalan.webfejlesztes.entity.Game;
import com.zalan.webfejlesztes.mapper.GameMapper;
import com.zalan.webfejlesztes.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameMapper gameMapper;
    private final GameRepository gameRepository;

    @Override
    public void saveGame(GameDto game) {
        gameRepository.save(gameMapper.mapGameDtoToGameEntity(game));
    }

    @Override
    public List<GameDto> getAllGames() {
        return gameRepository.findAll().stream().map(gameMapper::mapGameEntityToGameDto).collect(Collectors.toList());
    }

    @Override
    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    @Override
    public void updateGame(Long id, int price) {
        gameRepository.updatePriceById(id, price);
    }
}
