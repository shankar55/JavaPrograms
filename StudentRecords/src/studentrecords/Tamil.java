package studentrecords;

import java.util.Comparator;

public class Tamil implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.valueOf(o2.getTamil()).compareTo(o1.getTamil());
	}

}
