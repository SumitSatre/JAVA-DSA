class Occurrence{
    static int i = 0  , j=0 , k = 0 ,index = -1;

    static int firstOccurrence(int arr[] , int key){
        
        // base case 
        if(i>=arr.length){
            return -1;
        }

        // if element found
        if(arr[i] == key){
            return i;
        }

        // if not found check for next position
        i++;

        return firstOccurrence(arr , key);
    }

    static int lastOccurrence(int arr[] , int key){
        
        // base case 
        if(j<0){
            return -1;
        }

        // if element found
        if(arr[arr.length - j - 1] == key){
            return (arr.length - j - 1);
        }

        // if not found check for next position
        j++;

        return lastOccurrence(arr , key);
    }

    static int lastOccurrenceFromStart(int arr[] , int key){
        
        // base case 
        if(k>=arr.length){
            return index;
        }

        // if element found
        if(arr[k] == key){
            index = k;
        }

        // if not found check for next position
        k++;

        return lastOccurrenceFromStart(arr , key);
    }

    public static void main(String[] args){
        int arr[] = {1,2,54,41,65,1564,61,65 , 61};
        System.out.println(firstOccurrence(arr , 0));

        System.out.println(lastOccurrence(arr , 61));

        System.out.println(lastOccurrenceFromStart(arr , 65));
    }
}