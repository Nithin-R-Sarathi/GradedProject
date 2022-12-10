package Week2_Graded_Coding_Challenge;
public class Drive extends DataStructureB {
public void getEmployeeData() throws Exception{
	employeeData();
	}
public void employeeNamesSorted(){
	sortingNames();
	}
public void cityName(){
	cityNameCount();
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Drive main=new Drive();
        main.employeeData();
        main.sortingNames();
        main.cityNameCount();
        main.monthlySalary();
	}
}
