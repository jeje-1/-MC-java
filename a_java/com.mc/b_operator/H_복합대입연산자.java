package b_operator;

public class H_복합대입연산자 {
	
	//대입연산자와 다른 연산자를 함께 사용하면 복합대입연산자.
	public static void main(String[] args) {
		
		int num = 12 ;
		num = num + 12;
		System.out.println(num);
		
		num += 12;
		System.out.println(num);
		
		num -= 12;
		System.out.println(num);
		
		num *= 12;
		System.out.println(num);
		
		num /= 12;
		System.out.println(num);
		
		num %= 11;
		System.out.println(num);
		
		String a = "1번";
		String b = "2번";
		String c = a;
		a = b;
		b = c;
		
		
		
			
	
	}

}
