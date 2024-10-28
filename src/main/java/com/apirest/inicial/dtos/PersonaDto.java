package com.apirest.inicial.dtos;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonaDto {

    private Long id;
    private String nombre;
    private String apellido;
}
