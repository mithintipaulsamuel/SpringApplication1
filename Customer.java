package Application_own;

public class Customer 
{
	String c_name;
	int c_mobile_no;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_mobile_no() {
		return c_mobile_no;
	}
	public void setC_mobile_no(int c_mobile_no) {
		this.c_mobile_no = c_mobile_no;
	}
	@Override
	public String toString() {
		return "Customer [c_name=" + c_name + ", c_mobile_no=" + c_mobile_no + "]";
	}
	
	
	
}
