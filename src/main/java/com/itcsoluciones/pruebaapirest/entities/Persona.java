package com.itcsoluciones.pruebaapirest.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Persona extends Base {

    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "",cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Domicilio> domicilios = new ArrayList<>();
    private String numeroTelefono;
}
