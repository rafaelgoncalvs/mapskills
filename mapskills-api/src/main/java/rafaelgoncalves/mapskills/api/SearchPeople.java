package rafaelgoncalves.mapskills.api;

import java.util.Arrays;
import java.util.List;

public class SearchPeople {

	public List<PersonDTO> search() {
		PersonDTO personDTO1 = new PersonDTO("Rafael");
		PersonDTO personDTO2 = new PersonDTO("Nathalia");
		PersonDTO personDTO3 = new PersonDTO("Alcir");
        return Arrays.asList(personDTO1, personDTO2, personDTO3);
	}

}
