public class Patterns2 {

    static void BtrflyPattern(int n){

        for(int i = 0 ; i<n ; i++ ){

            //
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }

            for(int k = 0 ; k<n-i-1 ; k++){
                System.out.print("  ");
            }

            for(int l = 0 ; l<=i ; l++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for(int i = n-1 ; 0<i ; i-- ){

            //
            for(int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }

            for(int k = 0 ; k<n-i-1 ; k++){
                System.out.print("  ");
            }

            for(int l = 0 ; l<=i ; l++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    static void RhombusPattern(int n){

        for(int i = 0 ; i<n ; i++){

            // for spaces
            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k <n ; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    static void HollowRhombusPattern(int n){

        for(int i = 0 ; i<n ; i++){

            // for spaces
            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k <n ; k++){
                if(i==0 || i==(n-1) || k==0 || k==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }

    static void DiamondPattern(int n){

        for(int i = 0 ; i<n ; i++){

            // for spaces
            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k <=(i*2) ; k++){
                System.out.print("*");
            }

            System.out.println("");
        }

        for(int i = n-1 ; i>=0 ; i--){

            // for spaces
            for(int j = 0 ; j <n-i-1 ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k <=(i*2) ; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void main(String[ ] args){
        // BtrflyPattern(4);
        //HollowRhombusPattern(5);

        DiamondPattern(4);
    }
}
