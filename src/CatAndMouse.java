import java.util.Scanner;

class CatAndMouse {
static Scanner sc=new Scanner(System.in);
static int[] a=new int[3];
	public static void main(String[] args) {
		System.out.println("enter the number of cats");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
	attack(getvalues());
		}
		
	}

	private static void attack(int[] getvalues) {
	int x=a[2]-a[1];
	x=Math.abs(x);
	int y=a[2]-a[0];
	y=Math.abs(y);
			if(x==y) {
				System.out.println("mouse c");
			}
			if(x<y) {
				System.out.println("Cat b");
			}
			if(x>y) {
				System.out.println("Cat a");
			}
	
	}

	private static int[] getvalues() {
		
		System.out.println("enter the positions");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		
		return a;
	}

}
