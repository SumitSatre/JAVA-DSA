import java.util.ArrayList;

class ContainerWithMostWater{

    public static void storeWater(ArrayList<Integer> list){
        int area = 0;

        for(int i = 0 ; i<list.size()-1 ; i++){
            for(int j = i+1 ; j<list.size() ; j++){
                
                int height = list.get(i) < list.get(j) ? list.get(i) : list.get(j);
                int width = j-i;

                if(height*width > area){
                    area = height*width;
                }  
            }
        }

        System.out.println(area);
    }

    public static void storeWaterByTwoPointerApproach(ArrayList<Integer> list){
        int area = 0;

        int left = 0 , right = list.size()-1;

        while(left<right){
            
            int height = list.get(left) < list.get(right) ? list.get(left) : list.get(right);
            int width = right-left;

            area = (height*width) > area ? (height*width) : area;

            if(list.get(left) < list.get(right)){
                left++;
            }
            else{
                right--;
            }
        }

        System.out.println(area);
    }

    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(10);
        list.add(7);
        
        storeWater(list);

storeWaterByTwoPointerApproach(list);
        
    }
}