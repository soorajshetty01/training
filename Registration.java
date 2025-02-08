package training;

import java.util.Scanner;

public class Registration {
	public static boolean checking(String name) {
		char firstchar=name.charAt(0);
		if(!((firstchar>='A')&&(firstchar<='Z'))||((firstchar>='a')&&(firstchar<='z'))) {
			return false;
			
		}
		for(int i=0;i<name.length();i++) {
			char s=name.charAt(i);
			if(!((s>='A')&&(s<='Z') || (s>='a')&&(s<='z') || (s>='0')&&(s<='9') )) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter the name :");
		name=sc.nextLine();	
		int n=name.length();
		
		if((n>5) && (n<15) && checking(name)) {
			System.out.println(name+" Entered name is a valid name");
		}
		else {
			System.out.println(name+" Entered name is a invalid name");
		}
	}

}
