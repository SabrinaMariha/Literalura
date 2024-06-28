package com.sabrinamariha.bibilioteca.model.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record LivroDTO(@JsonAlias("title") String titulo,
                       @JsonAlias("authors")List<AutorDTO> listaAutores,
                       @JsonAlias("languages")List<String> listaIdioma,
                       @JsonAlias("download_count") Double numeroDeDownloads) {
}
