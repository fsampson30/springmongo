package com.sampson.springmongo.repository;

import com.sampson.springmongo.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}
