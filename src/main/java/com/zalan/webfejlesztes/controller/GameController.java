package com.zalan.webfejlesztes.controller;

import com.zalan.webfejlesztes.dto.GameDto;
import com.zalan.webfejlesztes.service.GameService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    @Autowired
    private final GameService gameService;
    @PostMapping("/createGame")
    public ResponseEntity<GameDto> saveGame(@Valid @RequestBody GameDto gameDto) {
        return ResponseEntity.ok().body(gameService.saveGame(gameDto));
    }
}
