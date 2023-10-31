package com.lamlvbank.homebanking.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 11)
    @Column(unique = true, nullable = false)
    private String accountN;

    @NotNull
    @NotBlank
    @Size(min = 1, max = 22)
    @Column(unique = true, nullable = false)
    private String cbu;


    @NotNull @NotBlank
    //@Pattern(regexp = "^[a-z]+\\\\.[a-z]+\\\\.[a-z]+$")//asigna el patron para el alias
    @Column(unique = true,nullable = false)
    private String alias;

    @NotNull @DecimalMin(value="0.0") @DecimalMax(value="20000000.0")
    private float balance;

}
