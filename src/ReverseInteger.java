
public class ReverseInteger {
	public int reverse(int x) {
		int result=0;
		
		while(x != 0) {
			int remainder = x%10;
			x = x/10;
			result = result*10 + remainder;
		}
		
		return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE? 0 : result);
	}

}
