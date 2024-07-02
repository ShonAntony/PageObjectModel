package learningString;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int yr;
		Scanner sc = new Scanner(System.in);
		yr = sc.nextInt();
		if((yr%4==0) && (yr%100!=0))
		{
		System.out.println("This is a Leap Year");
		}
		else if(yr%100==0)
		{
			System.out.println("This is not a Leap Year");
		}
		else if(yr%400==0)
		{
			System.out.println("This is a Leap Year");
		}
		else
		{
			System.out.println("This is not a Leap Year");
		}
	}
	

}
