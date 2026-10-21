import java.util.Scanner;

public class project1021 {

	public static void main(String[] args) {
		/*
    	 * *
    	 * **
    	 * ***
    	 * ****
    	 * *****
    	 * *****
    	 * ****
    	 * ***
    	 * **
    	 */
    	 
//    	 for( int i = 1; i <= 5; i++) {
//    		 for( int j = 0; j < i; j++) {
//    			 System.out.print("*");
//    		 }
//    		 System.out.println();
//    	 }
//    	 
//    	 
//    	 for( int i = 1; i <= 5; i++) {
//    		 for( int j = 0; j <= 5 - i; j++) {
//    			 System.out.print("*");
//    		 }
//    		 System.out.println();
//    	 }
//    	 
//    	 
//    	 for( int i = 1; i <= 5; i++) {
//    		 for( int j = 0; j < 5 - i; j++) {
//    			 System.out.print(" ");
//    		 }
//    		 for( int k = 0; k < i; k++) {
//    			 System.out.print("*");
//    		 }
//    		 System.out.println(); 
//    	 }
    	 
    	//과제//사용자가 입력한 숫자로 트리모양 만들기+=
		
		Scanner scanner = new Scanner(System.in);
		
		int  inputNumber = scanner.nextInt();
		
		for (int i = 1; i <= inputNumber; i++ ) {
		    for (int j = 1; j <= inputNumber - i; j++) {
		        System.out.print(" "); 
		    }

		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
		scanner.close();
	}

}
