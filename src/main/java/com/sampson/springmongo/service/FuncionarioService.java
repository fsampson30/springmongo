package com.sampson.springmongo.service;

import com.sampson.springmongo.model.Funcionario;

import java.util.List;

public interface FuncionarioService {

    public List<Funcionario> obterTodos();

    public Funcionario obterPorCodigo(String codigo);

    public Funcionario criar(Funcionario funcionario);

    public List<Funcionario> obterFuncionariosPorRangeDeIdade(Integer de, Integer ate);
}
