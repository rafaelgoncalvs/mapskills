package rafaelgoncalves.mapskills.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDTO {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
