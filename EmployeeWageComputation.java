/**
 * EmployeeWageComputation 
 * 		--- Program to compute employee wage.
 * 
 * Checking attendance (i.e present / absent)
 * 
 * 
 * @author    Abhishek Shigavan
 */
public class EmployeeWageComputation {

	//constant
	public static final int IS_PRESENT=1;
	
/**
   * Generate random attendance 
   * and store it in variable
	   * @return return attendance.
	   * 
	   *
   */	
	public static int attendanceChecker() {
		
		int attendance = (int)(Math.floor(Math.random() * 10) % 2);
		return attendance;
	}
	
	public static void main(String[] args) {
	
		System.out.println("Welcome To Employee Wage Computation...!!!");

		int empAttendance = attendanceChecker();
		
		if(empAttendance == IS_PRESENT) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

}

