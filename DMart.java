package Application_own;

public class DMart
{
	String location;
	Customer customer;
	Order order;
	@Override
	public String toString() {
		return "DMart [location=" + location + ", customer=" + customer + ", order=" + order + "]";
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
