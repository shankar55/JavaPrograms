package studentrecords;

import java.util.Comparator;

public class Maths implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.valueOf(o2.getMaths()).compareTo(o1.getMaths());
	}

}
