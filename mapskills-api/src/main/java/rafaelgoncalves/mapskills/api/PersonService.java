package rafaelgoncalves.mapskills.api;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/people")
public class PersonService {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonDTO> people() {
		PersonDTO personDTO1 = new PersonDTO("Rafael");
		PersonDTO personDTO2 = new PersonDTO("Nathalia");
		PersonDTO personDTO3 = new PersonDTO("Alcir");
        return Arrays.asList(personDTO1, personDTO2, personDTO3);
    }
	
}
