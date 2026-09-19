package com.example.sistema_alunos.repository;

import com.example.sistema_alunos.model.Aluno; //Diz ao Repository que irá trabalhar com a classe Aluno.
import org.springframework.data.jpa.repository.JpaRepository; //Interface fornecida pelo Spring Data JPA. (findALL, findById, etc...)

public interface AlunoRepository extends JpaRepository<Aluno, Long> { //Cria um repositório para a entidade Aluno.
}