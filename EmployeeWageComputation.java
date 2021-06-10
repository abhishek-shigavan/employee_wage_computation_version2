/**
 * EmployeeWageComputation 
 * 		--- Program to compute employee wage.
 * 
 * Checking attendance (i.e present / part time / absent)
 * Computing daily wage of employee
 * 
 * 
 * @author    Abhishek Shigavan
 */
public class EmployeeWageComputation {

	//constant
	public static final int IS_PRESENT=1;
	public static final int IS_PART_TIEM=2;
	public static final int WAGE_PER_HOUR=20;

/**
   * Generate random attendance 
   * (i.e present / part time / absent)
   * and store it in variable
	   * @return return attendance.
	   * 
	   *
   */	
	public static int attendanceChecker() {
		
		int attendance = (int)(Math.floor(Math.random() * 10) % 3);
		return attendance;
	}

/**
   * Calculate Daily wage 
   * and store it in variable
	   * @return return Daily wage.
	   * 
	   *
   */	
	public static int getDailyWage(int workingHour) {
		int dailyWage = workingHour * WAGE_PER_HOUR;
		return dailyWage;
	}
	
	public static void main(String[] args) {
	
		//variables
		int empWorkingHour=0;
		int empAttendance = attendanceChecker();
		
		System.out.println("Welcome To Employee Wage Computation...!!!");		

		switch(empAttendance) {
		case IS_PRESENT: {
			empWorkingHour=8;
			System.out.println("Employee is Present");
			break;
		}
		case IS_PART_TIEM: {
			empWorkingHour=4;
			System.out.println("Employee is Part Time Present");
			break;
		}
		default:
			System.out.println("Employee is Absent");
			break;
		}
		
		int empDailyWage=getDailyWage(empWorkingHour);
		System.out.println("Daily Wage of Employee : "+empDailyWage);
	}

}

