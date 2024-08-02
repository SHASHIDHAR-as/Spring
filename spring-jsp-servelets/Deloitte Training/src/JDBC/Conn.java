package JDBC;

import java.sql.*;


public class Conn {
	Statement s;

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "shashi3927");
            System.out.println("Connection created");
            Statement st=con.createStatement();
            
           
//            String query=("INSERT INTO employee (empid, name, deptid, dob, salary) VALUES\r\n"
//            		+ "(33, 'Shashidhar', 101, '1985-01-15', 50000)");
//            st.executeUpdate(query);
            
            
            String q2="Delete from employee where empid=37";
            st.executeUpdate(q2);
            
            
            ResultSet rs=st.executeQuery("select *from employee");
            System.out.println("Name\t\tEmpId\tDeptId\tDOB\t\tSalary");
            while(rs.next()) {
            	int empid =rs.getInt("empid");
            	String name =rs.getString("name");
            	int deptid  =rs.getInt("deptid") ;
            	Date dob =rs.getDate("dob");
            	int salary =rs.getInt("salary");
            	
            	System.out.println(name+"\t"+empid+"\t"+deptid+"\t"+dob+"\t"+salary);
//            	System.out.println("Name "+name+"EMPID "+empid+"DeptId"+deptid
//            			+"DOB"+dob+"Salary"+salary);
            }
    }
}
