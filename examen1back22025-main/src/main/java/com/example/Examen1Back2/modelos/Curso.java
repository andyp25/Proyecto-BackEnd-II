package com.example.Examen1Back2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Curso {

    @Id // se corrigio
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se corrigio
    private Integer id;

    private String nombre; // se agrego punto y coma

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id") //Se quito el punto y coma que sobra
    @JsonBackReference(value = "docente-curso")
     private Docente docente; //Se agrego private y el punto y coma

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Se agrego set y get


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
