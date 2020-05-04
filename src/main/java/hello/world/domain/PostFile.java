package hello.world.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PostFile {
	@Id
	@GeneratedValue
	private Long		id;
	@OneToOne(fetch = FetchType.LAZY)
	private Post		post;
	private String	fileName;
	private byte[]	data;
	private String	type;

	public PostFile() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}