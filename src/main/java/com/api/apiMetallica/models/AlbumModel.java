package com.api.apiMetallica.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "album")
public class AlbumModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;

    @Column
    private LocalDate fechaLanzamiento;

    @Column
    private String portadaPath;

    @Column
    private String selloDiscografico;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<SongModel> songs = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getPortadaPath() {
        return portadaPath;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setPortadaPath(String portadaPath) {
        this.portadaPath = portadaPath;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
