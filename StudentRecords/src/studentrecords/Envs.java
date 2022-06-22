package studentrecords;

import java.util.Comparator;

public class Envs implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return Integer.valueOf(o2.getEnvs()).compareTo(o1.getEnvs());
	}
}
