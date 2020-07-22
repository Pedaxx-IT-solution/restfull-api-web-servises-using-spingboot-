package in.pdx.restfullapi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/*dao(data access object )  is the class where we have written all the database code
i.e seperate from the controller class 
*/


/* by writting @component anotations now our class is eligible for dependancy injection
  It means that Spring framework will autodetect these classes for dependency injection 
*/

@Component
public class CustomerDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	// various databases queries r written in various methods
	public boolean insertdb(Customer cust) {

		String sql = "insert into customer(cust_name , cust_no , cust_mail) values(?,?,?)";

		jdbctemplate.update(sql, cust.getCust_name(), cust.getCust_no(), cust.getCust_mail());

		return true;
	}

	public List<Map<String, Object>> listdb() {

		String sql = "select * from customer";
		List<Map<String, Object>> dblist = jdbctemplate.queryForList(sql);

		return dblist;
	}

	public List<Customer> listdbmapper() {

		String sql = "select * from customer";
		List<Customer> cust_list = jdbctemplate.query(sql, new CustomerRowmapper());

		return cust_list;
	}

	public void updatedb(Customer cust) {
		
String sql = "update customer set cust_name=? ,cust_no=?,cust_mail=?  where cust_id=? ";
		
		jdbctemplate.update(sql, cust.getCust_name(),cust.getCust_no(),cust.getCust_mail(),cust.getCust_id());
		
		
	}

	public void deletedb(Customer cust) {
		
		String sql = "delete  from customer where cust_id=?";
		jdbctemplate.update(sql , cust.getCust_id());
		
		System.out.println("deleted check database");
		
	}

}
