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

        public boolean attendance() {
                int rand = random.nextInt(2);

                if(rand == 1) {
                        return true;

                } else {
                        return false;
                }
        }
}
