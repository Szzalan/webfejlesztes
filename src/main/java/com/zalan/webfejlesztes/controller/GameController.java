package com.zalan.webfejlesztes.controller;

import com.zalan.webfejlesztes.dto.GameDto;
import com.zalan.webfejlesztes.service.GameService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @PostMapping("/createGame")
    public ResponseEntity<String> saveGame(@Valid @RequestBody GameDto gameDto) {
        gameService.saveGame(gameDto);
        return ResponseEntity.ok().body("Game successfully saved");
    }
    @GetMapping("/getAllGames")
    public ResponseEntity<List<GameDto>> getAllGames(){
        return ResponseEntity.ok().body(gameService.getAllGames());
    }
    @DeleteMapping("/deleteGameById/{id}")
    public ResponseEntity<String> deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
        return ResponseEntity.ok().body("Game successfully deleted");
    }
    @PutMapping("/updateGameById/{id}")
    public ResponseEntity<String> setPrice(@PathVariable Long id, @Valid @RequestBody int price) {
        gameService.updateGame(id, price);
        return ResponseEntity.ok().body("Price successfully updated");
    }
}
