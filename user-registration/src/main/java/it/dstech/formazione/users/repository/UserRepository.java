package it.dstech.formazione.users.repository;

import it.dstech.formazione.users.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}