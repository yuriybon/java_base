
public class Task2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int c = 4;
		
		int tmp;
		
		tmp=c;
		c = b;
		b = a;
		a = tmp;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		

	}

}
