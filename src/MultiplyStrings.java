
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		String result = "";
		
		int i1 = Integer.parseInt(num1);
		int i2 = Integer.parseInt(num2);
		
		int product = i1 * i2;
		
		result = Integer.toString(product);
		
		return result;
	}

}
