package enverSpring.northwind.business.abstracts;

import enverSpring.northwind.core.entities.User;
import enverSpring.northwind.core.utilities.results.DataResult;
import enverSpring.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
