package rafaelgoncalves.mapskills.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/people")
@Transactional
public class PersonService {

	@Inject
	private SearchPeople searchPeople;

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonDTO> people() {
		return searchPeople.search();
    }
	
}
