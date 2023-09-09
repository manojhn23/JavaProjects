package work;

public class Pgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb";
//		for(int i=0;i<s.length();i++) {
//			System.out.print(s.charAt(i)+",");
//		}
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length();j++) {
//				System.out.print(s.charAt(i)+""+s.charAt(j)+",");
//			}
//		}
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.print(s.substring(i,j)+" ");
				
			}
		}
		
	}
}
