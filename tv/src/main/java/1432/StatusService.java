package 1432;

import org.eiichiro.gig.Service;
import org.eiichiro.jaguar.inject.Inject;
import org.eiichiro.jaguar.inject.Name;

@Name("1432.StatusService")
@Service
public class StatusService {

	@Inject private StatusRepository repository;
	
	public Status get() {
		return repository.get();
	}
	
}
