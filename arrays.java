/**
 * 		arrays
 *
 * 				Methods for dealing with arrays
 *
 * 		Kyle Vigil
 */


public class arrays {

	public static void main(String[] args) {
		int[] nums = {3, 6, 4, 3, 2, 1, 5, 6};

		System.out.println(avg(nums));
	}


	/**
	 * avg
	 * 		Finds the mean value of an array
	 *
	 * @param nums - the array
	 * @return the mean
	 */
	public static double avg(int[] nums) {
		return ((double) sum(nums)/nums.length);
	}


	/**
	 * sum
	 * 		Finds the sum of an array
	 *
	 * @param nums - the array
	 * @return the sum
	 */
	public static int sum(int[] nums) {
		int sum = 0;

		for(int i = 0; i<nums.length; i++){
			sum += nums[i];
		}

		return sum;

	}


	/**
	 * threes
	 * 		Finds the number of threes in an array
	 *
	 * @param nums - the array
	 * @return the number of threes
	 */
	public static int threes(int[] nums) {
		int counter = 0;

		for(int i = 0; i<nums.length; i++){
			if(nums[i]==3){
				counter++;
			}
		}
		return counter;
	}

}