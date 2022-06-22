package studentrecords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsDemo {

	public static void main(String[] args) {
		//add student records
		Students std1=new Students(1,"raj",98,97,93,95,99);
		Students std2=new Students(2,"ravi",90,87,100,93,97);
		Students std3=new Students(3,"ram",96,90,89,91,93);
		//add the objects to the list
		List<Students>list=new ArrayList<>();
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
       //comparator for to get marks list in each subject-list from max to minimum
	   Collections.sort(list,new English());
	   System.out.println("Students who get max marks in English: ");
	   for(Students p:list)
	   {
		   System.out.println("Roll_no: "+p.getRoll_no()+" Name: "+p.getStud_name()+" "+p.toStringEnglish());
	   }
	   
	   Collections.sort(list,new Tamil());
	   System.out.println("Students who get max marks in Tamil: ");
	   for(Students p:list)
	   {
		   System.out.println("Roll_no: "+p.getRoll_no()+" Name: "+p.getStud_name()+" "+p.toStringTamil());
	   }
	   
	   Collections.sort(list,new Maths());
	   System.out.println("Students who get max marks in Maths: ");
	   for(Students p:list)
	   {
		   System.out.println("Roll_no: "+p.getRoll_no()+" Name: "+p.getStud_name()+" "+p.toStringMaths());
	   }
	   
	   Collections.sort(list,new Science());
	   System.out.println("Students who get max marks in Science: ");
	   for(Students p:list)
	   {
		   System.out.println("Roll_no: "+p.getRoll_no()+" Name: "+p.getStud_name()+" "+p.toStringScience());
	   }
	   
	   Collections.sort(list,new Envs());
	   System.out.println("Students who get max marks in Environment: ");
	   for(Students p:list)
	   {
		   System.out.println("Roll_no: "+p.getRoll_no()+" Name: "+p.getStud_name()+" "+p.toStringEnvs());
	   }
	        
	        
	}
}
