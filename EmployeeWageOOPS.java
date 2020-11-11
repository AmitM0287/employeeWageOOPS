import java.util.Random;

public class EmployeeWageOOPS {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program!");

		Employee emp = new Employee();

		if (emp.attendance()) {
			System.out.println("Present");

		} else {
			System.out.println("Absent");
		}
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
		int t = random.nextInt(1);

		switch (t) {
		case 0:
			dailyWage = fullDay * wageHour;
			break;

		default:
			System.err.println("Invalid Operation!");
		}
	}
}
