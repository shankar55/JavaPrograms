package stream.flatmap.demo;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args)
	{
		Customer customer=new Customer(101,"john",null,Arrays.asList("397937955","21654725"));
		
		//empty
		//of
		//ofNullable
		
		Optional<Object> emptyOptional=Optional.empty();
		System.out.println(emptyOptional);
		Optional<String> emailOptional=Optional.of(customer.getEmail());
		System.out.println(emailOptional);
		
		Optional<String> emailOptional1=Optional.ofNullable(customer.getEmail());
		System.out.println(emailOptional1);
		if(emailOptional1.isPresent())
		{
			System.out.println(emailOptional1.get());
		}
		System.out.println(emailOptional1.orElse("default@gmail.com"));
		System.out.println(emailOptional1.orElseThrow(()->new IllegalArgumentException("email not present")));
		
		
	}

}
