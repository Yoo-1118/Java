import java.util.Scanner;

//60p 예제2-7
public class B_JAVA_CH02_EX01 {
	public static void main(String[] args){
		//Scanner
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d = %d입니다.\n",x,y,x*y);
		
		//산술연산자
		int reminder = 25 % 2; //%는 나머지
		System.out.println("25 / 2 의 나머지는 " + reminder +"입니다.");
		
	}
}