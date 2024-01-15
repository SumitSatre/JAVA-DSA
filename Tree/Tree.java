import java.util.*; 

class Node {
  int data;
  Node left;
  Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class Tree {

  static int i = -1;

  static Node buildTree(int arr[]) {
    i++;
    if (arr[i] == -1) {
      return null;
    }

    Node temp = new Node(arr[i]);

    temp.left = buildTree(arr);
    temp.right = buildTree(arr);

    return temp;
  }

  int height(Node node) 
    {
        if(node == null){
            return 0;
        }
        
        int left = height(node.left);
        int right = height(node.right);
        
        return Math.max(left , right)+1;
    }

  public static void preorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");

    preorderTraversal(root.left);
    preorderTraversal(root.right);
  }

  public static void postorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    postorderTraversal(root.left);
    postorderTraversal(root.right);
    System.out.print(root.data + " ");
  }

  public static void inorderTraversal(Node root) {
    if (root == null) {
      return;
    }

    inorderTraversal(root.left);
    System.out.print(root.data + " ");
    inorderTraversal(root.right);
  }

  public static void levelOrderTraversal(Node root) {
    if(root == null){
      return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
      Node temp = q.remove();

      if(temp == null){
        System.out.println();

        if(q.isEmpty()){
          break;
        }
        else{
          q.add(null);
        }
      }
      else{
        System.out.print(temp.data + " ");
        if(temp.left != null){
          q.add(temp.left);
        }
        if(temp.right != null){
          q.add(temp.right);
        }
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1 };

    Node root = buildTree(arr);

    preorderTraversal(root);

    System.out.println();

    postorderTraversal(root);

    System.out.println();

    inorderTraversal(root);

    System.out.println();

    levelOrderTraversal(root);
  }

}
