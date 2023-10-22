package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(8);
		product1.setUnitsInStock(10);
		product1.setImageURl("Bilmemne.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(5500);
		product2.setDiscount(20);
		product2.setUnitsInStock(190);
		product2.setImageURl("Bilmemne2.jpg");



		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(10500);
		product3.setDiscount(0);
		product3.setUnitsInStock(10);
		product3.setImageURl("Bilmemne3.jpg");


		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}

		System.out.println("</ul>");
		
		
		
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("050052042142");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Toprak");
		individualCustomer.setLastName("Çavuşdağ");
		
		
		
			CorporateCustom corporateCustom = new CorporateCustom();
			
			
			corporateCustom.setId(2);
			corporateCustom.setCompanyName("MooMoo Games");
			corporateCustom.setPhone("055200554540");
			corporateCustom.setTaxNumber("1232321");
			corporateCustom.setCustomerNumber("22153");
			
			
			Customer[] customers = {individualCustomer, corporateCustom};
		
		
	}

}
