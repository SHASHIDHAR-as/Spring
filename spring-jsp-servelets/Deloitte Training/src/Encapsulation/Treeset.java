package Encapsulation;
import java.util.*;

public class Treeset {
	public static void main(String []args) {
		TreeSet<Data>dt=new TreeSet<>();
		dt.add(new Data(1,"shashi"));
		dt.add(new Data(2,"Karun"));
		
//		for(Data a:dt) {
//			System.out.println(a);
//		}
		
		ArrayList<Data>l1=new ArrayList<Data>();
		l1.add(new Data(1,"shashi"));
		l1.add(new Data(2,"Karun"));
		
		Collections.sort(l1,new IdComparator());
		System.out.println(l1);
		
		Collections.sort(l1,new NameComparator());
		
		System.out.println(l1);

	}

}



class NameComparator implements Comparator<Data>{
	
	@Override
	public int compare(Data a1,Data a2) {
		return a1.getName().compareTo(a2.getName());
	}
}


