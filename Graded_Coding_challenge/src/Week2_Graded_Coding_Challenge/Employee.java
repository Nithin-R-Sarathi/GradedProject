package Week2_Graded_Coding_Challenge;
import java.util.ArrayList;
public class Employee{//
	 int id; 
	 String name; 
	 int age; 
	 int salary; 
	 String department; 
	 String city;
	Employee(String n,int a,int s,String d,String c){
		name=n;
		age=a;
		salary=s;
		department=d;
		city=c;
	}	
	public Employee() {
		super();
	}
	ArrayList<Employee> employees = new ArrayList<>();
	public void employeeData() throws Exception{
		Employee e1=new Employee("Nithin",23,600000,"BSD","Bengaluru");
		e1.setId(500);
		Employee e2=new Employee("Kiran Kumar",22,700000 ,"Intern","Chennai");
		e2.setId(501);
		Employee e3=new Employee("Bharath",22,400000 ,"IT","Mysore");
		e3.setId(503);
		Employee e4=new Employee("Damodar",24,1000000,"Admin","Hyderbad");
		e4.setId(504);
		Employee e5=new Employee("Naveen",22,1300000,"BSD","Bengaluru");
		e5.setId(505);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println("List of employees");
		for(Employee emp:employees){
			System.out.println(emp.getId()+" "+emp.name+" "+emp.age+" "+emp.salary+" "+emp.department+" "+emp.city);
			try {
			if(emp.getId()<0 ||emp.getName()==null ||emp.getAge()<0 
			   ||emp.getAge()<0||emp.getDepartment()==null||emp.city==null){
				throw new Exception("null or <0 value is occured");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}		
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	public String getCity() {
		return city;
	}
}
	
		
		
		
	
	




	

