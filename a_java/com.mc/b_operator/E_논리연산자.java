package b_operator;

public class E_논리연산자 {
	
	
	
	// 논리연산자 : && , ||
	// && : 두 항이 모두 true일 때 true, ~면서 그리고 and
	// || : 두 항이 모두 false 일 때 false, 또는, ~거 or

	public static void main(String[] args) {
		
	System.out.println(2 >= 2 || 2 > 3); // true || false == true
	System.out.println(2 > 1 || 3 > 2); // true || ture == true
	System.out.println(3 < 2 || 2 > 3); // false || false == false
	System.out.println(2 < 2 || 2 < 3); // flase || true == true
	
	System.out.println(2 >= 2 && 2 > 3); // true || false == false
	System.out.println(2 > 1 && 3 > 2); // true || ture == true
	System.out.println(3 < 2 && 2 > 3); // false || false == false
	System.out.println(2 < 2 && 2 < 3); // flase || true == false
	
	boolean a = true;
	boolean b = false;
	boolean c = false;
	boolean d = false;
	
	System.out.print(a || b && c || d);

	}

}
