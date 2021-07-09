
import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


int i=0;
while(sc.hasNext()) {
	String s = sc.nextLine();
	if(s.contains("End-Of-file"))
	{
		
		System.out.println(i+" "+s);
		i++;
		break;
	}
	else {
		i++;
		System.out.println(i+" "+s);
	}
}

	}

}