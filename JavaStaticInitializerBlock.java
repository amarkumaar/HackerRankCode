
import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static int h;
	static int b;
	static boolean flag;
	static {
		Scanner sc = new Scanner(System.in);
		b= sc.nextInt();
		h=sc.nextInt();
		if(b>0 && h>0) {
			flag= true;
		}
		else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
	public static void main(String[] args) {
	if(flag) {
		int area = b*h;
		System.out.println(area);
	}
		
		
	}
}