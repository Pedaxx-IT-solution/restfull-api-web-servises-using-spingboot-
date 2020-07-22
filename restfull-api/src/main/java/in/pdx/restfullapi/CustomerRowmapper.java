package in.pdx.restfullapi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/*
customer row-mapper is used to display the list of customer(raw data)
row-mapper consists of result set so result set fetch the data from table 
and from result-set we catching the data and put it into customer object
*/
public class CustomerRowmapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer cust = new Customer();
		cust.setCust_id(rs.getInt("cust_id"));
		cust.setCust_name(rs.getString("cust_name"));
		cust.setCust_no(rs.getInt("cust_no"));
		cust.setCust_mail(rs.getString("cust_mail"));
		
		
		
		return cust;
	}

}
