package com.zalan.webfejlesztes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Game name is mandatory")
    private String gameName;

    @NotNull(message = "Creation date is mandatory")
    private Date creationDate;

    @NotNull(message = "Genre is mandatory")
    private String genre;

    @NotBlank(message = "Studio name is mandatory")
    private String studioName;

    @Min(1)
    @NotNull(message = "Price is mandatory")
    private Integer price;
}
