package Application_own;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeadConfigClass
{
	@Bean
	public Customer customer1()
	{
		Customer customer=new Customer();
		customer.setC_name("Adithya");
		customer.setC_mobile_no(7654321);
		return customer;
	}
	@Bean
	public Order order1()
	{
		Order order=new Order(101,26.90);

		return order;
	}
	@Bean
	public DMart dmart1()
	{
		DMart dmart=new DMart();
				dmart.setCustomer(customer1());
				dmart.setOrder(order1());
				dmart.setLocation("DSNR");
		return dmart;
	}
}
