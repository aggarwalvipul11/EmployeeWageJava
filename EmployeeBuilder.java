public class EmployeeWageUC1 {

	public static void main(String[] args) {
		int ratePerHr=20,empHr=0,Total_hrs=0,Total_days=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		int full_time=1,part_time=2,Working_days=20,max_hrs=100;
			while(Total_hrs<max_hrs && Total_days<Working_days) {
				Total_days++;
				double empCheck=Math.floor(Math.random()*10)%3;
				switch((int)empCheck) {
					case 1: empHr=8;
					break;
					case 2: empHr=4;
					break;
					default:empHr=0;
				}	
			Total_hrs+=empHr;
			}
		System.out.println("Total Salary="+(ratePerHr*Total_hrs));
	 }

}
