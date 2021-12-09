package prova.dao;

import java.util.List;

import prova.dao.PessoaDao;
import prova.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);

	void update(Pessoa pessoa);

	void delete(Long id);

	Pessoa findById(Long id);

	List<Pessoa> findAll();

}
