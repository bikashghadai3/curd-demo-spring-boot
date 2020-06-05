import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikashghadai.springboot.curddemo.dao.CustomerDAO;
import com.bikashghadai.springboot.curddemo.entity.Customer;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	private CustomerDAO customerDAO;
	
	@Autowired
	public CustomerRestController(CustomerDAO theCustomerDAO) {
		customerDAO = theCustomerDAO;
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerDAO.findAll();
	}
}