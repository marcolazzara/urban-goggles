package hello.world;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Secured(SecurityRule.IS_AUTHENTICATED) 
@Controller("/hello")
public class HelloController {

	@Get(produces = MediaType.TEXT_PLAIN)
	public String index() {
		System.out.println("ciao");
		return "Hello World";
	}
}
