package hello.world.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Person {

	@Id
	@GeneratedValue
	private Long	id;

	private Long	bitrixId;

	private Long	hrproId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBitrixId() {
		return bitrixId;
	}

	public void setBitrixId(Long bitrixId) {
		this.bitrixId = bitrixId;
	}

	public Long getHrproId() {
		return hrproId;
	}

	public void setHrproId(Long hrproId) {
		this.hrproId = hrproId;
	}
}
