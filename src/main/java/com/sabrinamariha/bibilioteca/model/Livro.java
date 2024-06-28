package com.sabrinamariha.bibilioteca.model;

import com.sabrinamariha.bibilioteca.model.dto.LivroDTO;
import jakarta.persistence.*;

@Entity
@Table(name="livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne(cascade = CascadeType.ALL)
    private Autor autor;
    private String idioma;
    private Double numeroDeDownloads;

    public Livro() {}
    public Livro(LivroDTO livroDTO) {
        this.titulo = livroDTO.titulo();
        this.autor = new Autor(livroDTO.listaAutores().get(0));
        this.idioma = livroDTO.listaIdioma().get(0);
        this.numeroDeDownloads = livroDTO.numeroDeDownloads();
    }
    public Livro(String titulo, Autor autor, String idioma, Double numeroDeDownloads) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.numeroDeDownloads = numeroDeDownloads;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getNumeroDeDownloads() {
        return numeroDeDownloads;
    }

    public void setNumeroDeDownloads(Double numeroDeDownloads) {
        this.numeroDeDownloads = numeroDeDownloads;
    }

    @Override
    public String toString() {
        return "\nLivro:" + titulo
                 + autor + '\'' +
                ",\nidioma='" + idioma + '\'' +
                ",\nnumeroDeDownloads=" + numeroDeDownloads +
                '}';
    }
}
