public class FindOdd {
	public static int findIt(int[] A) {
    // 1. need an array to count frequency (occurances)
    // 2. for each occurance, mod each to see which is odd perhaps the highest odd appearance.
  
    if (A.length == 0) return 0;
    if (A.length == 1) return A[0]; // return the loner straightway.
    //System.out.printf("%s%10d","Input array length: ", A.length);

    int frequency[] = new int [A.length];
    

    for (int idx = 0;idx < A.length; idx++){
       
    }  
    
    System.out.printf("%s%10s","Entry","Frequency");    
    System.out.println();

    for (int val = 0; val < frequency.length; val++)
      System.out.printf("%d%10d",A[val],frequency[val]);

  
    return 10/2;
  	//return odd;
  }
}
