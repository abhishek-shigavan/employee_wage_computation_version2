/**
 * EmployeeWageComputation 
 * 		--- Program to compute employee wage.
 * 
 * Checking attendance (i.e present / part time / absent)
 * Computing daily wage of employee
 * Computing monthly wage of employee
 * 
 * 
 * @author    Abhishek Shigavan
 */
public class EmployeeWageComputation {

	//constant
	public static final int IS_PRESENT=1;
	public static final int IS_PART_TIEM=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int WORKING_DAY_PER_MONTH=20;
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
	
		int monthlyWage=0;
		
		System.out.println("Welcome To Employee Wage Computation...!!!");
		
		for(int day=1; day<=WORKING_DAY_PER_MONTH; day++) {
		
			//variables
			int empWorkingHour=0;
			int empAttendance = attendanceChecker();
		
			switch(empAttendance) {
			case IS_PRESENT: {
				empWorkingHour=8;
				break;
			}
			case IS_PART_TIEM: {
				empWorkingHour=4;
				break;
			}
			default:
				break;
			}
		
			int empDailyWage=getDailyWage(empWorkingHour);
			monthlyWage +=empDailyWage;
		}

		System.out.println("Monthly Wage of Employee : "+monthlyWage);
	}	
}

