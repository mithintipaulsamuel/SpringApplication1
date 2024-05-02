package Application_own;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainHead 
{
	public static void main(String args[])
	{
		//This is the example of using config.xml file.
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ExpertListnMaps elm=context.getBean("expert1",ExpertListnMaps.class);
		System.out.println(elm);
//		Customer customer=context.getBean("customer1",Customer.class);
//		System.out.println(customer);
		
//		Order order=context.getBean("order1",Order.class);
//		System.out.println(order);
		
		//In dmart class i have injected customer n order class 
//		DMart dmart=context.getBean("dmart1",DMart.class);
//		System.out.println(dmart);
		
		
		//This is the example of using annotation approach
//		ApplicationContext context= new AnnotationConfigApplicationContext(HeadConfigClass.class);
		
//		Customer customer=context.getBean(Customer.class);
//		System.out.println(customer);
		
//		Order order=context.getBean(Order.class);
//		System.out.println(order);
		
//		DMart dmart=context.getBean(DMart.class);
//		System.out.println(dmart);

	}
}
