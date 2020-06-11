import java.util.*;
public class EmployeeBuilder {
	public static void main(String args[]) {
		int ratePerHr=20,empHr=0;
		System.out.println("Welcome to Employee Wage Computation Program");
		int full_time=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck==full_time){
			empHr=8;
		    }
		else {
			empHr=0;
		    }
		System.out.println("DailyWage="+ratePerHr*empHr);
	}
}
