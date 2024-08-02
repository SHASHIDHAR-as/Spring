package Encapsulation;

import java.util.Comparator;
import java.util.Objects;

public class Data implements Comparable<Data>{
	private int n;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Data(int n) {
		super();
		this.n = n;
	}

	@Override
	public String toString() {
		return "Data [n=" + n + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(n, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		return n == other.n && Objects.equals(name, other.name);
	}

	public Data(int n, String name) {
		super();
		this.n = n;
		this.name = name;
	}
	
	
//	@Override
//	public int compareTo(Data a) {
//		if(this.n<a.n) {
//			return this.n;
//		}		
//			return a.n;	
//	}
//	@Override
//    public int compareTo(Data a) {
//        return Integer.compare(this.n, a.n);
//    }
	public int compareTo(Data a) {
	    return this.name.compareTo(a.name);
	}
	
	
}


class IdComparator implements Comparator<Data>{
	
	@Override
	public int compare(Data a1,Data a2) {
		if(a1.getN()<a2.getN()) {
			return-1;
		}
		if(a1.getN()>a2.getN()) {
			return 1;
		}
		return 0;
	}
	
}
