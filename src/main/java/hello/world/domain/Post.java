package hello.world.domain;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private Long		id;
	private String	title;
	private String	message;
	@OneToOne(fetch = FetchType.LAZY)
	private Person	author;
	private Integer	numLikes;
	private Date		creationDate;

	public Post() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumLikes() {
		return numLikes;
	}

	public void setNumLikes(Integer numLikes) {
		this.numLikes = numLikes;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}