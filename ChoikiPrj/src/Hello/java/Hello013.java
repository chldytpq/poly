package Hello.java;
import java.util.Scanner;

public class Hello013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a;
		System.out.println("1~4까지 선택하시오");
		a = s.nextInt();
		switch(a) 
		{
		case 1:
			System.out.println(a+"을 선택했다.");
			break;
		case 2:
			System.out.println(a+"을 선택했다.");
			break;
		case 3:
			System.out.println(a+"을 선택했다.");
			break;
		case 4:
			System.out.println(a+"을 선택했다.");
			break;
			
			default:
				System.out.println("이상한걸 선택함");
				break;
				
			}
		

	}

}
