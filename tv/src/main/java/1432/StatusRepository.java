package 1432;

import org.eiichiro.gig.Repository;
import org.eiichiro.jaguar.inject.Name;

@Name("1432.StatusRepository")
@Repository
public class StatusRepository {

	public Status get() {
		// It's OK to get it from database.
		Status status = new Status();
		status.message = "READY";
		return status;
	}
	
}
