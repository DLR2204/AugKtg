package oops;

public class Employee {
	
	private String empName;
	
	private int empId;
	
	private String empAdd ;
	
	private int empSal;
	
	public void setEmpName(String empName) {  //setters :-to give i/p
		this.empName = empName;
	}
	
	public String getEmpName() {              //gettes:-to check o/p
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAdd=" + empAdd + ", empSal=" + empSal + "]";
	}

	public Employee(String empName, int empId, String empAdd, int empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAdd = empAdd;
		this.empSal = empSal;
	}
	
	
	

}
