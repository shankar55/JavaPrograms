package stream.flatmap.demo;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		//Map is a Data transformation operator -->one to one mapping
		List<Customer>customers=EkartDatabase.getAll();
		
		List<String>emails=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		List<List<String>>phonenumbers=customers.stream().map(customer->customer.getPhonenumbers()).collect(Collectors.toList());
		System.out.println(phonenumbers);
		
		//FlatMap-->Map+flattening
		List<String>phones=customers.stream().flatMap(customer->customer.getPhonenumbers().stream()).collect(Collectors.toList());
		System.out.println(phones);
		
		

	}

}
