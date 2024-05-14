package com.itcsoluciones.pruebaapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base{

    private String calle;
    private int numero;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
