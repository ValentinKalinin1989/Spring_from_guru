package guru.srpingframework.webapp.repositories;

import guru.srpingframework.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
