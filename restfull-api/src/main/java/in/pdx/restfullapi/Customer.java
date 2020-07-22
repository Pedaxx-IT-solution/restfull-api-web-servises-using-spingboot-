package in.pdx.restfullapi;

// this is a customer class and customer has various attributes and also we  have generated getter and setter

public class Customer {
	// note while making tables in databses using same name as in this class 
	// primary key
	private Integer cust_id;
	private String cust_name;
	private Integer cust_no;
	private String cust_mail;

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Integer getCust_no() {
		return cust_no;
	}

	public void setCust_no(Integer cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_mail() {
		return cust_mail;
	}

	public void setCust_mail(String cust_mail) {
		this.cust_mail = cust_mail;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_no=" + cust_no + ", cust_mail="
				+ cust_mail + "]";
	}

}
