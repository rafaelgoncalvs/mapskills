package rafaelgoncalves.mapskills.api;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserService {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDTO> users() {
		UserDTO userDTO1 = new UserDTO();
		userDTO1.setName("Rafael");
		UserDTO userDTO2 = new UserDTO();
		userDTO2.setName("Nathalia");
        return Arrays.asList(userDTO1, userDTO2);
    }
	
}
