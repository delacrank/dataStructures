package hackerRank;

import java.util.*;

class Test1 {


   static void miniMaxSum(int[] arr) {

       int sum = 0;
       int max = arr[0];
       int min = arr[0];
       for(int i = 0; i < arr.length; i++) {
	   if(arr[i] > max) {
	       max = arr[i];
	   }
	   
	   if(arr[i] < min) {
	       min = arr[i];
	   }
	   
 	   sum += arr[i];
	   
       }

	System.out.println(sum - max);
	System.out.println(sum - min);
	System.out.println(sum);

    }

    public static void main(String[] args) {

	int[] x  = {1,3,5,7,9};
	
	miniMaxSum(x);

    }

}


