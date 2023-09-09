package work;

public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,7,5,9,10};
		int tarSum=14;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j]==tarSum)
					System.out.println(arr[i]+","+arr[j]);
			}
		}	
	}

}
