package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		product1.setName("Delonghi KahveMakinası");
		product1.setGetdisCount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(10);
		product1.setImageUrl("bilmemne.jpg");

		Product product2 = new Product();
		product2.setName("Smeng KahveMakinası");
		product2.setGetdisCount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(10);
		product2.setImageUrl("2bilmemne.jpg"); 

		Product product3 = new Product();
		product3.setName("Kitchen Age KahveMakinası");
		product3.setGetdisCount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(10);
		product3.setImageUrl("3bilmemne.jpg");
	 		
		
		System.out.println("<ul>");	
			
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {

			System.out.println("<li>"+product.getName()+"</li>");

		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("054312345");
		individualCustomer.setCustomerNumber("123456");		
		individualCustomer.setFirstName("Hasan Cihad Örgün");
		individualCustomer.setLastName("örgün");
		
		
		CorporateCustomer corpeCustomer = new CorporateCustomer();
		corpeCustomer.setId(2);
		corpeCustomer.setCompanyName("Kodlama.io");
		corpeCustomer.setPhone("054326546546");
		corpeCustomer.setTaxNumber("1111111111");
		corpeCustomer.setCustomerNumber("54321");
		
		
		Customer[] customers = {individualCustomer,corpeCustomer};
		
		
	}
}
