import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate=t->t%2==0;
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().filter(predicate).forEach(t->System.out.println("print Even: "+t));
		predicate.test(5);
	}

}
