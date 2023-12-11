import java.util.HashSet;

public interface OperationsOnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(8);
        set.add(55);

        System.out.println(set);
      
        set.remove(55);
        System.out.println("After removed : "+set);


        System.out.println(set.size());
    }
}

/* https://chat.openai.com/share/523dc037-d7a2-4910-92b8-39b14914717d */