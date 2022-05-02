import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestEmployee {

	Employee emp;
	@Before
	public void setUp() throws Exception {
		emp=new Employee(101,"Anita",1000,25);
	}

	@After
	public void tearDown() throws Exception {
		emp=null;
	}

	@Test
	public void testGrossSalary() {
		assertEquals(1160.0f, emp.calculateGrossSalary(), 0.01f);
	}
	
	@Test
	public void testBonus() {
		assertEquals(1000, emp.calculateBonus());
	}
	
	@Test(expected=AgeException.class)
	public void testAgeException() throws AgeException{
		emp.setAge(22);
	}
	
	
	@Test(timeout=1000)
	public void testSortPerformance() {
		int arr[]= {1,4,9,16,25,36,49,64,81,100,121,144,169,196,225,256,289,324,361,400};
		for(int i=1;i<1000000;i++) {
			arr[0]=i;
			Arrays.sort(arr);
		}
	}

}
