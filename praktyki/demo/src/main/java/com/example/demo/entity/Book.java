package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
@DynamicUpdate
public class Book {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @ManyToOne
        @JoinColumn(name = "foreignKey")
        private Customer customer;
        private String name;
        private String autor;
        private int iloscStron;
        private int rokWydania;
        private String wydawnictwo;
        private int cena;

    public long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getIloscStron() {
        return this.iloscStron;
    }
    public int getRokWydania() {
        return this.rokWydania;
    }
    public String getWydawnictwo() {
        return this.wydawnictwo;
    }
    public int getCena() {
        return this.cena;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }
    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }
    public Book(String name, String autor, int iloscStron, int rokWydania, String wydawnictwo, int cena) {
        this.name = name;
        this.autor = autor;
        this.iloscStron = iloscStron;
        this.rokWydania = rokWydania;
        this.wydawnictwo = wydawnictwo;
        this.cena = cena;
    }
}
