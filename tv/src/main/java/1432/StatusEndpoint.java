package 1432;

import static org.eiichiro.bootleg.MediaType.*;
import static org.eiichiro.bootleg.Verb.*;

import org.eiichiro.jaguar.inject.Inject;
import org.eiichiro.bootleg.annotation.Allows;
import org.eiichiro.bootleg.annotation.Endpoint;
import org.eiichiro.bootleg.annotation.Generates;

@Endpoint
public class StatusEndpoint {

	@Inject private StatusService service;
	
	@Allows(GET)
	@Generates(APPLICATION_JSON)
	public Status get() {
		return service.get();
	}
	
}
