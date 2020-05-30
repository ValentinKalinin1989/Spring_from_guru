package guru.srpingframework.webapp.repositories;

import guru.srpingframework.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
