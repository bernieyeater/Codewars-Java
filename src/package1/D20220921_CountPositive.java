package package1;

public class D20220921_CountPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
	      int [] returnInt = {0,0};
			for (int i:input)
			{
	      if (i > 0 ) {returnInt[0]++;}
	      if (i < 0) {returnInt[1]=returnInt[1]+i;}
	      
	    }
		System.out.println(returnInt[0]+" "+returnInt[1]);
	}

}
/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

Others solutions

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
       if (input == null || input.length == 0) return new int[] {};
       int count = 0,sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       return new int[] {count,sum};
    }
}

*/