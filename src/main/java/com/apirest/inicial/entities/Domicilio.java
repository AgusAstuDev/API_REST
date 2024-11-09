package com.apirest.inicial.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="calle")
    private String calle;
    @Column(name = "numero")
    private int numero;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_LOCALIDAD")
    private Localidad localidad;
}
