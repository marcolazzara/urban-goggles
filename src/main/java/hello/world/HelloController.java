package hello.world;

import javax.inject.Inject;

import hello.world.domain.Book;
import hello.world.repository.BookRepository;
import io.micronaut.context.BeanContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Secured(SecurityRule.IS_AUTHENTICATED)
@Controller("/hello")
public class HelloController {

	@Inject
	 BookRepository bookRepository;
	

	@Post(produces = MediaType.TEXT_PLAIN)
	public String index() {
		System.out.println("ciao");
		
		Book book = new Book();
		book.setTitle("The Stand");
		book.setPages(1000);
		bookRepository.save(book);
		return "Hello World";
	}
}
