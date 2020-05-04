package hello.world.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= -1369806756901572516L;
	@Id
	@GeneratedValue
	private Integer						id;
	@Column(name = "password")
	private String						password;
	@Column(name = "username")
	private String						username;
	@JsonIgnore
	@Column(name = "enabled")
	private int								enabled;
	@Enumerated(EnumType.ORDINAL)
	private AccountRole				role;

	public Account() {
	}

	public Account(Account account) {
		this.setId(account.getId());
		this.username = account.username;
		this.password = account.password;
		this.enabled = account.enabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() > 15)
			this.password = password;
		// else
		// this.password = EncryptHelper.encode(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public AccountRole getRole() {
		return role;
	}

	public void setRole(AccountRole role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
