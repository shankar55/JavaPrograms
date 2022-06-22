import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiDemo {

	//https://www.geeksforgeeks.org/stream-in-java/#:~:text=Introduced%20in%20Java%208%2C%20the,to%20produce%20the%20desired%20result.&text=A%20stream%20is%20not%20a,Arrays%20or%20I%2FO%20channels.
	
	public static void main(String[] args) {
		//Intermediate Operators
		// create a list of integers
	    List<Integer> number = Arrays.asList(2,3,4,5);
	  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x*x).
	                           collect(Collectors.toList());
	    System.out.println(square);
	  
	    // create a list of String
	    List<String> names =
	                Arrays.asList("Reflection","Collection","Stream");
	  
	    // demonstration of filter method
	    List<String> result = names.stream().filter(s->s.startsWith("S")).
	                          collect(Collectors.toList());
	    System.out.println(result);
	  
	    // demonstration of sorted method
	    List<String> show =
	            names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);
	  //Terminate operators
	    // create a list of integers
	    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
	 // collect method returns a set
	    Set<Integer> squareSet =
	         numbers.stream().map(x->x*x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	  
	    // demonstration of forEach method
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	  
	    // demonstration of reduce method
	    int even =
	       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	  
	    System.out.println(even);
	    
	    //Lambda Expressions
	    ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.forEach(p->System.out.println(p));
        arrL.forEach(p->{if(p%2==0) System.out.println(p);});

	}

}
