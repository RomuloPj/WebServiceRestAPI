/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uema.cursos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author pltf0
 */


@AllArgsConstructor
@NoArgsConstructor
// Construção dos getter and setters
@Data
// Indica que a classe é uma Entidade, mapeia a classe para o banco
@Entity
public class Cursos {
    
    // Geração de valores
    // Mapeia o id e gera para o banco
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    // Notação para mostrar a obrigatoriedade dos campos
    @NotBlank(message = "Nome é obrigatório")
    private String nomecurso;
    @NotBlank(message = "Carga horária é obrigatória")
    private String cargahoraria;
    @NotBlank(message = "Data de início é obrigatório")
    private String dtinicio;
    
    
}
