
public class Employee {
	
	private String name;
	private int id;
	private String skills[]=new String [5];

	public Employee(String name, int id, String[] skills) {
		super();
		this.name = name;
		this.id = id;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getEmployee() {
		return skills;
	}

	public void setEmployee(String[] skills) {
		this.skills = skills;
	}
	
	public void showDetails() {
		System.out.println(name);
		for(int i=0;i<skills.length;i++) {
			System.out.println(skills[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skills[]= {"Java","HTmL"};
		Employee e=new Employee("Shashi",1,skills);
		e.showDetails();

	}

}
