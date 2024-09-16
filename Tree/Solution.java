class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode prev = null, curr = slow, temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 3: Merge the two halves
        ListNode first = head, second = prev;
        while (second.next != null) {
            
            first.next = second;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        solution.reorderList(head);

        // Output should be 1 -> 5 -> 2 -> 4 -> 3
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}

/* 
public class Solution {

    public static boolean isVowel(char ch) {
        // Convert character to lowercase to handle both upper and lower case letters
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void permutaions(char[] str, int index, List<String> result, StringBuilder curr) {
        if (index == str.length) {
            result.add(curr.toString());
            return;
        }
        
        if(isVowel(str[index])){
            if(str[index] == '#') return;
            char temp = str[index];
            curr.append(str[index]);
            str[index] = '#';
            permutaions(str, index+1, result, new StringBuilder(curr));
            str[index] = temp;
            curr.deleteCharAt(curr.length()-1);
            return;
        }

        for (int i = 0; i < str.length; i++) {
            if(isVowel(str[i])) continue;
            if(str[i] == '#') continue;
            char temp = str[i];
            curr.append(temp);
            str[i] = '#';
            permutaions(str, index + 1, result , new StringBuilder(curr) );
            str[i] = temp;
            curr.deleteCharAt(curr.length()-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        List<String> result = new ArrayList<>();

        permutaions(str.toCharArray(), 0, result, new StringBuilder());

        System.out.println(result);
        System.out.println(result.size());
    }
}
*/