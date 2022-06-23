package Day5Java;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int x = 25, y = 42;
		 
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
		// TODO Auto-generated method stub

	}