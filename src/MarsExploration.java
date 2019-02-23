import java.util.Scanner;

public class MarsExploration {
	static Scanner sc=new Scanner(System.in);
	static char[] b;
	static char[] a=new char[3];
	public static void main(String[] args) {
		
		check(getvalues());
		

	}

	private static void check(char[] getvalues) {
		a[0]='S';
		a[1]='O';
		a[2]='S';
		int x=0,y=0,z=0;
		for(int i=0;i<b.length;i++) {
			if(i%3==0) {
				if(b[i]!=a[0]) {
					x++;
				}
			}
			if(i%3==1) {
				if(b[i]!=a[1]) {
					y++;
				}
			}
			if(i%3==2) {
				if(b[i]!=a[2]) {
					z++;
				}
			}
			
		}
		System.out.println((x+y+z));
		
	}

	private static char[] getvalues() {
		
		System.out.println("enter the message");
		String s=sc.next();
		 b=s.toCharArray();
		return b;
	}

}
