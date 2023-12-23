package com.reneafranco.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "User")
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
@EqualsAndHashCode
public class User {

    private Long id;

    private String name;

    private String email;
}
