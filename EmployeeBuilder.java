import java.util.*;
public class EmployeeBuilder {
	public static void main(String args[]) {
		int ratePerHr=20,empHr=0,Total_hrs=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		int full_time=1,part_time=2,Working_days=20;
		for (int i=0;i<Working_days;i++) {
			double empCheck=Math.floor(Math.random()*10)%3;
			switch((int)empCheck) {
				case 1: empHr=8;
				break;
				case 2: empHr=8;
				break;
				default:empHr=0;
			}	
		System.out.println("DailyWage="+ratePerHr*empHr);
		Total_hrs+=empHr;
		}
		System.out.println("Monthly Wage="+(ratePerHr*Total_hrs));
	}
}
