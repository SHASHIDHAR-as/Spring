package Encapsulation;
import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student(1,"Shashidhar",100));
		list.add(new Student(3,"Karun",90));
		list.add(new Student(2,"Abhi",80));
		list.add(new Student(4,"Xavier",93));
		
//		System.out.println(list);
		for(Student s:list) {
			System.out.println(s);
		}
		System.out.println("=========================");
		//collections sort by name
		Collections.sort(list);
		for(Student s:list) {
			System.out.println(s);
		}
		//sort by marks
		System.out.println("=========================");
		Collections.sort(list,new marksComparator());
		for(Student s:list) {
			System.out.println(s);
		}
		

	}

}

class marksComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student s1,Student s2) {
		return Integer.compare(s1.getMarks(), s2.getMarks());
	}
}
