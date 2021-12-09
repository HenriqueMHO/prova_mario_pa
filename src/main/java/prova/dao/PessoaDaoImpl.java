package prova.dao;

import org.springframework.stereotype.Repository;

import prova.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Long> implements PessoaDao{

}
