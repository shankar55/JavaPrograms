package studentrecords;

import java.util.HashMap;

public class Students {
	private int roll_no;
	private String stud_name;
	private int English;
	private int tamil;
	private int Maths;
	private int science;
	private int envs;
	HashMap<String,Integer> lang=new HashMap<>();
	int [] subjects=new int[5];
	public Students(int roll_no, String stud_name, int english, int tamil, int maths, int science, int envs) {
		this.roll_no = roll_no;
		this.stud_name = stud_name;
		this.English = english;
		this.tamil = tamil;
		this.Maths = maths;
		this.science = science;
		this.envs = envs;
	}
	public HashMap<String,Integer> assignSubjects()
	{
		lang.put("English",getEnglish());
		lang.put("Tamil",getTamil());
		lang.put("Maths",getMaths());
		lang.put("Science",getScience());
		lang.put("EnvironmentScience",getEnvs());
	return lang;	
	}
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnvs() {
		return envs;
	}

	public void setEnvs(int envs) {
		this.envs = envs;
	}
	public int[] assignMarks()
	{
		subjects[0]=getEnglish();
		subjects[1]=getTamil();
		subjects[2]=getMaths();
		subjects[3]=getScience();
		subjects[4]=getEnvs();
		return subjects;
	}
	public int Max_marks()
	{
		int[] marks=assignMarks();
		int max=marks[0];
		for(int i=0;i<marks.length;i++)
		{
			if(max<marks[i])
			{
				max=marks[i];
			}
		}
		return max;
	}
	public String toStringEnglish() {
		return "Students [English=" + English + "]";
	}
	public String toStringTamil() {
		return "Students [tamil=" + tamil + "]";
	}
	public String toStringMaths() {
		return "Students [Maths=" + Maths + "]";
	}
	public String toStringScience() {
		return "Students [science=" + science + "]";
	}
	public String toStringEnvs() {
		return "Students [envs=" + envs + "]";
	}
	
	
	
	
}
