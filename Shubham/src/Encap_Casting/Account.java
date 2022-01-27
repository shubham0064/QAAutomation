package Encap_Casting;

class Account {

	private long acc_no;
	private String name, email;
	private float amount;
	
	//GETTER AND SETTER METHOD
	
	public long getacc_no() {
		return acc_no;
	}
	public void setacc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	
	public float getamount() {
		return amount;
	}
	public void setamount(float amount) {
		this.amount = amount;
	}
}
