import java.util.Scanner;

public class taskGugudan {

	public static void main(String[] args) {
		
		
		 //3단 구구단 출력
	
		        	// for (int i = 1; i < 10; i++) {
		        		// System.out.println("3 * " + i+ " = " + (3 * i));
		        	    //System.out.printf("3 * %d = %d%n", i, (3 * i));
		        		 //System.out.printf( String.format("3 * %d = %d", i, (3 * i)));
		        	// }
		        	 
		        	 // 전체 구구단 (가로 모드, 세로모드) 출력하자
		        	 
		        	/*for (int i = 1; i < 10; i++) {
		        		for(int n =1; n < 10; n++) {
		        		System.out.printf("%d * %d = %d%n",i, n, (n * i));} } *///세로 출력
		        	
	            	/*for (int i = 1; i < 10; i++) {
    	             	for(int n =1; n < 10; n++) {
    	              	System.out.printf("%3d * %d = %d",i, n, (n * i));}} // 가로 출력*/
		        	
		        	// 사용자에게 원하는 구구단을 입력받아 출력해보자
		
		         Scanner scanner = new Scanner(System.in);
		         
		         int inputNumber = scanner.nextInt();
		         
		         for (int i = 1; i < 10; i++) {
		        		
		        	    System.out.printf("%d * %d = %d%n", inputNumber,i,(inputNumber * i));
		        		 
		        	 }
		         
		        scanner.close();		

	}

}
