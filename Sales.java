package training;
import java.util.Scanner;
public class Sales {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the sales for "+n+" days");
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();// TODO Auto-generated method stub
		}

		System.out.println("The sales for "+n+" days are:");
		for(int i=0;i<n;i++)
		{
		System.out.println("The sales number is :"+arr[i]);

		}
		int max=arr[0];
		int day=0;
		for(int i=1;i<n;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
				day=i;
				}
			
		}
		System.out.println("The highesh sale in the day"+(day+1)+" with sales of"+max);
	}

}
