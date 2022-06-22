import java.util.function.Consumer;

public class ConsumerDemo  {

	public static void main(String[] args) {
		//There are three functional Interfaces
		//consumer-->void method takes generic input-->accept()
		//predicate-->boolean method takes generic input-->test()
		//supplier-->generic method takes no input -->get()
		
		//Lambda expression 
		Consumer<Integer> consumer=(t)->{System.out.println(t);};
		consumer.accept(567);
	}
	
}
