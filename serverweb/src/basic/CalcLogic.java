package basic;
//비즈니스로직
public class CalcLogic {
	public int calc(int num1, String method, int num2) {
		System.out.println("비즈니스메소드 호출....");
		int result =0;
		switch(method){
		case "+":
			result = (num1)+(num2);
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		}
		return result;
	}
}
