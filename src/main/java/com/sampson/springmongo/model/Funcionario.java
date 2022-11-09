package com.sampson.springmongo.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Funcionario {

    private String codigo;

    private  String nome;

    private Integer idade;

    private BigDecimal salario;

    private Funcionario chefe;
}
