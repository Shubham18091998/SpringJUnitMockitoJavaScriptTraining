
public class Employee {

	private int empno;
	private String name;
	private int basicSalary;
	private int age;
	public Employee() {
		super();
	}
	public Employee(int empno, String name, int basicSalary,int age) {
		super();
		this.empno = empno;
		this.name = name;
		this.basicSalary = basicSalary;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException{
		if(age>21 && age<50) {
			this.age = age;
		}
		else {
			throw new AgeException("Invalid Age");
		}
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float calculateGrossSalary() {
		float ta=basicSalary*0.05f;
		float da=basicSalary*0.07f;
		float hra=basicSalary*0.04f;
		float grossSalary=basicSalary+ta+da+hra;
		return grossSalary;
	}
	public int calculateBonus() {
		int bonus;
		if(age>=22 && age<=40) {
			bonus=1000;
		}
		else if(age>=41 && age<=50) {
			bonus=2000;
		}
		else if(age>=51 && age<=60) {
			bonus=3000;
		}
		else {
			bonus=0;
		}
		return bonus;
	}
}
