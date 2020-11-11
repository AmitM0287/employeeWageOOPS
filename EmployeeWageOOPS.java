import java.util.Random;

public class EmployeeWageOOPS {

	public static void main(String[] args) {

		System.out.println("\nWelcome to Employee Wage Computation Program!\n");

		Employee emp = new Employee();

		System.out.println("Day N0." + "	" + "Status" + "	    " + "Daily Wage" + "	    " + "Total Wage");
		for (int i=1; i<=30; i++) {
			if (emp.attendance()) {
				emp.dailyEmpWage();
				System.out.println("Day " + i + "	" + "Present" + "		" + emp.dailyWage + "		" + emp.totalWage);

			} else {
				emp.dailyWage=0;
				System.out.println("Day " + i + "	" + "Absent" + "		" + emp.dailyWage + "		" + emp.totalWage);
			}
		}

		System.out.println("\nHence, Total employee wage for a month = " + emp.totalWage);



	}

}

class Employee {
        Random random = new Random();

	int wageHour = 20;
	int fullDay = 8;
	int halfDay = 4;
	int totalWage = 0;
	int dailyWage = 0;

        public boolean attendance() {
                int rand = random.nextInt(2);

                if(rand == 1) {
                        return true;

                } else {
                        return false;
                }
        }

	public void dailyEmpWage() {
		int t = random.nextInt(2);

		switch (t) {
		case 0:
			dailyWage = fullDay * wageHour;
			totalWage += dailyWage;
			break;

		case 1:
			dailyWage = halfDay * wageHour;
			totalWage += dailyWage;
			break;

		default:
			System.err.println("Invalid Operation!");
		}
	}
}
