package com.api.apiMetallica.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "song")
public class SongModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String letra;


    @ManyToOne
    @JoinColumn(name = "album_id")   // clave foránea
    @JsonBackReference
    private AlbumModel album;


     // Getters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLetra() {
        return letra;
    }

    public AlbumModel getAlbum() {
        return album;
    }

    // Setters (opcional)
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setAlbum(AlbumModel album) {
        this.album = album;
    }



}
