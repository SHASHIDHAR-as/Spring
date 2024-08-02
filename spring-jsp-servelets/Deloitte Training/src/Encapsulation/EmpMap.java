package Encapsulation;
import java.util.*;
public class EmpMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Data> hm = new HashMap<>();
        Data a = new Data(1, "shashi");

        hm.put(101, a);
        hm.put(102, new Data(2, "sham"));

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the key: ");
            int n = sc.nextInt();

            if (hm.containsKey(n)) {
                System.out.println(hm.get(n));
            } else {
                System.out.println("Enter proper key");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer key.");
        } finally {
            sc.close();
        }
   
		

	}

}
