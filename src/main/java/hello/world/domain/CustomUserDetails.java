package hello.world.domain;

import java.util.List;

import io.micronaut.security.authentication.UserDetails;


public class CustomUserDetails extends UserDetails {

	private static final long	serialVersionUID	= 1L;

	public CustomUserDetails(String username, List<String> roles) {
		super(username,roles);
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

}
