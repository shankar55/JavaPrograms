package studentrecords;

import java.util.Comparator;

public class Science implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.valueOf(o2.getScience()).compareTo(o1.getScience());
	}

}
