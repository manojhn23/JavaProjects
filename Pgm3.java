package work;
import java.util.*;
public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4};
		int arr2[]=new int[arr.length+1];
		int inp=sc.nextInt();
		int ind=sc.nextInt();
		for(int i=0;i<arr2.length;i++) {
			if(i==ind)
				arr2[i]=inp;
			else if(i>ind)
				arr2[i]=arr[i-1];
			else
				arr2[i]=arr[i];
		}
		for(int a:arr2)
			System.out.println(a);
		
	}

}
