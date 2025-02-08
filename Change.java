package training;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input;
		String input1;
		System.out.println("Enter the text:");
		input=sc.nextLine();
		
		 input1=input.replace("hte", "the").replace("recieve","receive" );
		// input1=input.replace("recieve","receive");
			System.out.println("The replaced string:");
		System.out.println(input1);
	}

}
