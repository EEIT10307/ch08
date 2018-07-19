package ch08.Q08_02;
import java.io.* ; 
import java.net.*; 

public class Q08_02 {

	public static void main(String[] args) {
		try {
			methodA();
		} catch (IOException e) {
		
		} catch (ArithmeticException r) {
			
		}
		
		System.out.println("Program ends");

		
	}
	
	static void methodA() throws  IOException {
		int i = 3/0  ;  
		URL urlA = new URL("http;//www.seed.net.tw") ; 
		FileInputStream fis = new FileInputStream("D:\\Test.txt") ; 
		
		
		
	}

}
