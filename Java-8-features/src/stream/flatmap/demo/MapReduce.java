package stream.flatmap.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduce {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(3,7,9,5,9);
		int sum=0;
		for(int no:numbers)
		{
			sum=sum+no;
		}
		System.out.println(sum);
		int sum1=numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum1);
		
		Integer reduceSum=numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(reduceSum);
		
		Optional<Integer>reduceSumWithMethodReference=numbers.stream().reduce(Integer::sum);
		System.out.println(reduceSumWithMethodReference);
		

	}

}
