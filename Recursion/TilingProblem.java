class TilingProblem{

    static int tilingProblem(int n){
        if(n == 0 || n==1){
            return 1;
        }

        // horizontal choice
        int h = tilingProblem(n-2);

        // vertical choice
        int v = tilingProblem(n-1);

        return h+v;
    }

    public static void main(String[] args){
        System.out.println("Number of choices : " + tilingProblem(4));
    }
}