package Application_own;

public class Order
{
	int o_id;
	double o_quantity;
	Order(){
		
	}
	public Order(int o_id, double o_quantity) {
		super();
		this.o_id = o_id;
		this.o_quantity = o_quantity;
	}
	@Override
	public String toString() {
		return "Order [o_id=" + o_id + ", o_quantity=" + o_quantity + "]";
	}
	
}
