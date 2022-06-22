package studentrecords;

import java.util.Comparator;

public class English implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.valueOf(o2.getEnglish()).compareTo(o1.getEnglish());
	}
	
}
