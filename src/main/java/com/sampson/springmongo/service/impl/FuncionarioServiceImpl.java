package com.sampson.springmongo.service.impl;

import com.sampson.springmongo.model.Funcionario;
import com.sampson.springmongo.repository.FuncionarioRepository;
import com.sampson.springmongo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> obterTodos() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario obterPorCodigo(String codigo) {
        return this.funcionarioRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não existe."));
    }

    @Override
    public Funcionario criar(Funcionario funcionario) {
        return this.funcionarioRepository.save(funcionario);
    }
}
