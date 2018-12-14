/**
 * 
 * @author Karyme Flores
 *
 */
import java.util.Scanner;

public class BirthdayCalender {

		
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in); 
		
		String name2; 
		String name1;
		int day2; 
		int day1;
		int month2; 
		int month1;
		int year2; 
		int year1; 
		System.out.print("Please enter person one's name:   ");
		name1 = kb.nextLine();
		System.out.print("Please enter person two's name:   ");
		name2 = kb.nextLine();
		System.out.println("Please enter " + name1 + "'s birth day in numerical value: ");
		day1 = kb.nextInt();
		System.out.println("Please enter " + name1 + "'s birth month in numerical value:  "); 
		month1 = kb.nextInt();
		System.out.println("Please enter " + name1 + "'s birthyear in numerical value:");
		year1 = kb.nextInt();
		System.out.println("Please enter " + name2 + "'s birth day in numerical value: ");
		day2 = kb.nextInt();
		System.out.println("Please enter " + name2 + "'s birth month in numerical value:  "); 
		month2 = kb.nextInt();
		System.out.println("Please enter " + name2 + "'s birthyear in numerical value:");
		year2 = kb.nextInt();
		
		if(year1>year2)
			{ 
			System.out.print(name1 + " is younger than "+ name2);
			}
			else if(year1<year2)
			{
				System.out.print(name1 + " is older than "+ name2);
			}
			else if(day1==day2)
			{
				System.out.print(name1 + " and " + name2 + " are the same age");
			}
			else if(day1>day2)
			{
				System.out.print(name1 + " is younger than "+ name2);
			}
			else if(day1<day2)
			{
				System.out.print(name1 + " is older than "+ name2);
			}
			else if(month1==month2)
			{
				System.out.print(name1 + " and " + name2 + " are the same age");
			}
			else if(month1>month2)
			{
				System.out.print(name1 + " is younger than "+ name2);
			}
			else if(month1<month2)
			{
				System.out.print(name1 + " is older than "+ name2);
			}
		else
		{
		System.out.print(name1 + " and " + name2 + " are the same age");
		
		}
	}
}

