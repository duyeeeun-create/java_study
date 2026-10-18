import java.util.Scanner;

public class review {

	public static void main(String[] args) {
//		String name = "Mr.Du";
//		System.out.println("이름 :" + name);
//		System.out.printf("이름 : %s\n" , name);
//		
//		String uName = "두예은";
//		String uAddr = "대전";
//		System.out.printf("이름 : %s, 주소: %s",uName,uAddr );
//		
//		System.out.printf("이름 : %s, 나이 : %d", "두예은", 24);
//		System.out.println();
//		System.out.printf("결혼유무 : %b", false);
//		System.out.println();
//		System.out.printf("10진수 123 ---> 8진수 %o%n", 123);
//		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 :");		
		String mName = scanner.nextLine();
		
		System.out.println("나이 입력 :");		
		int mAge = scanner.nextInt();
		
		System.out.println("몸무게 입력 :");		
		float mWeight = scanner.nextFloat();
		
		System.out.println("신장 입력 :");		
		double mHeight = scanner.nextDouble();
		
		System.out.printf("이름 : %s, 나이 : %d, 몸무게 : %f, 신장 : %f",
				mName, mAge, mWeight, mHeight  );
		
		scanner.close();
		

	}

}
