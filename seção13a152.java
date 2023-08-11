package Enumerações_e_Composição;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Oder;
import entities.OderItem;
import entities.Product1;
import entities.enums.OderStatus;

public class seção13a152 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Enter cliente data: ");
		System.out.println();
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date(\"dd/MM/yyyy\"): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);	
				
		System.out.print("Enter order data: ");
		System.out.println();
		System.out.print("Status: ");
		OderStatus status = OderStatus.valueOf(sc.next());
		Oder order = new Oder(new Date(), status, client);
		
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1 ; i <= n; i ++ ) {
			System.out.printf("Enter %d# item date\n", i);
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product1 product = new Product1(productName, productPrice);			
			OderItem it = new OderItem(quantity, productPrice, product);

			order.addItem(it);

			
		}
		
		System.out.println();
		System.out.println(order);

	}

}
