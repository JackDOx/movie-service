package com.vinsguru.dto;

import com.vinsguru.domain.Genre;

// Movie DTO
public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
