package prova.dao;

import java.util.List;

import prova.dao.PessoaFisicaDao;
import prova.domain.PessoaFisica;

public interface PessoaFisicaDao {

	void save(PessoaFisica pessoafisica);

	void update(PessoaFisica pessoafisica);

	void delete(Long id);

	PessoaFisica findById(Long id);

	List<PessoaFisica> findAll();

}
