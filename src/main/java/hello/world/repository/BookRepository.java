package hello.world.repository;

import hello.world.domain.Book;
import io.micronaut.context.annotation.Prototype;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	Book find(String title);
}