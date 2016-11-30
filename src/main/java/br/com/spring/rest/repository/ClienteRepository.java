package br.com.spring.rest.repository;

import br.com.spring.rest.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "clientes", path = "clientes")
public interface ClienteRepository extends MongoRepository<Cliente, String> {

	List<Cliente> findAll();

	List<Cliente> findByNome(@Param("nome") String nome);

}
