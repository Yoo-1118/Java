
public class B_JAVA_CH02_EX02 {
	public static void main(String[] args){
		//쇼트서킷
		int x=0, y=1;
		System.out.println((x<1)||(y--<1));
		System.out.println("x="+x+", y="+y); //x=0,y=1
		
		System.out.println((x<1)|(y--<1));
		System.out.println("x="+x+", y="+y); //x=0,y=0
	}
}
