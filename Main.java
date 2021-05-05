package coffeeShop;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer=new Customer();
		customer.setFirstName("sura");
		
		CustomerManager check=new StarbucksCustomerManager();
		check.save(customer);
		
		
		
	

	}

}
