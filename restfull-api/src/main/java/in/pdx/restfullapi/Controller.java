package in.pdx.restfullapi;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// to mark this class as a controller restcontroller anotation is used 

@RestController
public class Controller {

	/*
	 * by using this anotation object is creeated by spring and that also without
	 * using new keyword
	 */
	@Autowired
	private CustomerDao custdao;

	@RequestMapping("/insert")
	public String insertuser(Customer cust) {

		this.custdao.insertdb(cust);

		return "inserted";
	}

	@RequestMapping("/update")
	public String updateuser(Customer cust) {

		this.custdao.updatedb(cust);

		return "updated";
	}

	@RequestMapping("/delete")
	public String deleteuser(Customer cust) {

		this.custdao.deletedb(cust);

		// displayed at html page
		return "deleted";
	}

	@RequestMapping("list")
	public List<Map<String, Object>> listuser() {

		List<Map<String, Object>> list = this.custdao.listdb();

		return list;
	}

	@RequestMapping("listmapper")
	public List<Customer> listusermapper(HttpServletRequest req) {
		String hello = req.getParameter("hello");

		List<Customer> list = this.custdao.listdbmapper();

		return list;
	}

}
