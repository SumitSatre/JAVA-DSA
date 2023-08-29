public class DiagonalSum {
    
    public static void FindDiagonalSum(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows==cols){
            int sum = 0;
            
            // Primary column
            for(int r = 0  ; r<rows ; r++){
                sum += arr[r][r];
            }

            // Secondary column
            for(int r = 0 , c = cols-1 ; r<rows ; r++ , c-- ){
                if(r==c){
                    continue;   
                }
                sum += arr[r][c];
            }

            System.out.println("Diagonal Sum is : " +sum);
        }
        else{
            System.out.print("Please enter correct matrix");
        }
    }

    public static void main(String[] args){

        // 4*4 matrix
        int arr4[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};
        
        // 3*3 matrix
        int arr3[][] = {{1,2,3} , {4,5,6} , {7,8,9} };  

        FindDiagonalSum(arr3);
        FindDiagonalSum(arr4);
    }
}
