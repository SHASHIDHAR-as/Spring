package EmpJDBC;



import java.sql.Date;

public class Employee {
    private int empid;
    private String name;
    private int deptid;
    private Date dob;
    private int salary;

    public Employee(int empid, String name, int deptid, Date dob, int salary) {
        this.empid = empid;
        this.name = name;
        this.deptid = deptid;
        this.dob = dob;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public int getDeptid() {
        return deptid;
    }

    public Date getDob() {
        return dob;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "\t" + empid + "\t" + deptid + "\t" + dob + "\t" + salary;
    }
}

