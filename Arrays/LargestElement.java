class LargestElement {

  public static int largestELement(int arr[]) {

    int i = 0;
    int max = Integer.MIN_VALUE;

    while (i < arr.length) {
      if (arr[i] > max) {
        max = arr[i];
      }
      i++;
    }

    return max;

  }

  public static int thirdLargest(int a[], int n)
    {
        if(n<3){
            return -1;
        }

        int firstMax = Integer.MIN_VALUE;        
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
	    for(int x : a){
	        
	        if(x>firstMax){
	            thirdMax = secondMax;
	            secondMax = firstMax;
	            firstMax = x;
	        } 
	        else if(x>secondMax && x!= firstMax){
	            thirdMax = secondMax;
	            secondMax = x;
	        }
	        else if(x>thirdMax && x != secondMax){
	            thirdMax = x;
	        }
	    }
	    
	    if(thirdMax == Integer.MIN_VALUE){
	        return -1;
	    }
	    else{
	        return thirdMax;
	    }
    }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 2, 15, 13, 7, 5, 9, 3, 7 };

    System.out.println("Largest Element : "+ largestELement(arr));
    System.out.println("Third Largest Element : "+ thirdLargest(arr , arr.length));
  }
}