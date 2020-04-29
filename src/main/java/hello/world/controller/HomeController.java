package hello.world.controller;

import java.security.Principal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;

@Secured("isAuthenticated()") 
@Controller("/")  
public class HomeController {

    @Get("/pippo") 
    public String index(Principal principal) {  
        return principal.getName();
    }
}
