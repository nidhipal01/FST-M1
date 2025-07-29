package Activities;

public class Activity2_class {

	public static void main(String[] args) {
		// Initialize the array
		
		int[] numArr = {10, 77, 10, 54, -11,10,10};
        int sum = 0;
      
			 for (int num : numArr) {
			 //If value is 10
	            if (num == 10) {
	                //Add them
	                sum +=num;
	            }
	            //Sum should not be more than 30
	            if (sum > 30) {
	                break;
	            }
		 }
		 //Return true if condition satisfies
			 if (sum ==30)
				 System.out.println("sum value is :" +sum);
			 else
			 System.out.println("Sum value is not 30");
	}

}
