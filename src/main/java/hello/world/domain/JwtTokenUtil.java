package hello.world.domain;

import java.security.Key;
import java.util.Date;

import io.micronaut.security.authentication.UserDetails;
import io.micronaut.security.token.Claims;

public class JwtTokenUtil {

	private Key									key;

	private static JwtTokenUtil	instance;

	private JwtTokenUtil() {
//		key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	}

	public String createToken(UserDetails userDetails, String role) {
		long expires = System.currentTimeMillis() + 1000L * 60 * 60;
//		String token = Jwts.builder().setSubject(userDetails.getUsername()).setExpiration(new Date(expires)).claim("roles", role).signWith(key).compact();
		return "";
	}

	public String getUserNameFromToken(String authToken) {
		if (authToken == null) {
			return null;
		}
		return null;
//		Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(authToken).getBody();
//		return claims.getSubject();
	}

	public boolean validateToken(String authToken) {
		return false;
//		try {
//			Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(authToken).getBody();
//			return claims.getExpiration().getTime() >= System.currentTimeMillis();
//		} catch (JwtException e) {
//			return false;
//		}
	}

	public static JwtTokenUtil getInstance() {
		if (instance == null)
			instance = new JwtTokenUtil();
		return instance;
	}

}
