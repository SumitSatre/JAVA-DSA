import java.util.Scanner;

public class spiral {

    public static void PrintSpiral(int arr[][]){
        int rows = arr.length;
        int cols = arr[0].length;

        int startRow = 0;
        int endRow = rows-1;
        int startCol = 0 ;
        int endCol = cols-1;

        while(startRow <= endRow && startCol <= endCol){

            // Starting row
            for(int i = startCol ; i<=endCol ; i++){
                System.out.print(arr[startRow][i] + "  ");
            }
            startRow++;

            // Ending Col
            for(int j = startRow ; j<=endRow ; j++){
                System.out.print(arr[j][endCol] + "  ");
            }
            endCol--;

            // Starting Row
            for(int k = endCol ; k>=startCol ; k--){
                System.out.print(arr[endRow][k] + "  ");
            }
            endRow--;

            // Starting col
            for(int l = endRow ; l>=startRow ; l--){
                System.out.print(arr[l][startCol] + "  ");
            }
            startCol++;
        }
    }
    public static void main(String[] args){
        int m = 4 , n= 4;
        int arr[][] = new int [m][n];
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j <n ; j++){
                System.out.print("Enter "+i + " " + j + " element: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        sc.close();

        System.out.println("");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j <n ; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println("");
        }

        PrintSpiral(arr);
    }
}
// 1 2 3 4 5 6 7 8 9 10 11 12 14 15 16