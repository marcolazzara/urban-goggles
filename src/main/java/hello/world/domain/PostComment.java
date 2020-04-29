package hello.world.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class PostComment {
	@Id
	@GeneratedValue
	private Long		id;
	private Person	author;
	private Post		post;
	private Date		date;
	private String	message;

	public PostComment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}