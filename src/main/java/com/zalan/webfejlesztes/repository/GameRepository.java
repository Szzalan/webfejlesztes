package com.zalan.webfejlesztes.repository;

import com.zalan.webfejlesztes.entity.Game;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    @Modifying
    @Transactional
    @Query("delete from Game g where g.id = ?1")
    void deleteById(@NonNull Long gameId);

    @Modifying
    @Transactional
    @Query("update Game g set g.price = ?2 where g.id = ?1")
    void updatePriceById(@NonNull Long gameId, int price);
}