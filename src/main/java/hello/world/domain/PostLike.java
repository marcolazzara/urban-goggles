package hello.world.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class PostLike {
	@Id
	@GeneratedValue
	private Long id;
	private PersonalData author;
	private Post post;
	private Date date;

	public PostLike() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PersonalData getAuthor() {
		return author;
	}

	public void setAuthor(PersonalData author) {
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

}