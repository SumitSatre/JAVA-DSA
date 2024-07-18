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

class NodeInfo {
  int diameter;
  int height;

  NodeInfo(int height, int diameter) {
    this.height = height;
    this.diameter = diameter;
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

  // int height(Node node) {
  // if (node == null) {
  // return 0;
  // }
  //
  // int left = height(node.left);
  // int right = height(node.right);
  //
  // return Math.max(left, right) + 1;
  // }

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
    if (root == null) {
      return;
    }

    QueueUsingArray<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node temp = q.remove();

      if (temp == null) {
        System.out.println();

        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(temp.data + " ");
        if (temp.left != null) {
          q.add(temp.left);
        }
        if (temp.right != null) {
          q.add(temp.right);
        }
      }
    }
  }
  /*
   * static int j = -1;
   * public static Node buildTreeByInOrder(int[] arr) {
   * j++;
   * 
   * if (j >= arr.length || arr[j] == -1) {
   * return null;
   * }
   * 
   * Node temp = new Node(arr[j]);
   * 
   * temp.left = buildTreeByInOrder(arr);
   * temp.right = buildTreeByInOrder(arr);
   * 
   * return temp;
   * }
   */

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }

    int left = height(root.left);
    int right = height(root.right);

    return Math.max(left, right) + 1;
  }

  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }

    int ld = diameter(root.left);
    int rd = diameter(root.right);

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int selfDiameter = leftHeight + rightHeight + 1;

    return Math.max(selfDiameter, Math.max(ld, rd));
  }

  public static NodeInfo diameterOptimal(Node root) {
    if (root == null) {
      return new NodeInfo(0, 0);
    }

    NodeInfo leftNodeInfo = diameterOptimal(root.left);
    NodeInfo rightNodeInfo = diameterOptimal(root.right);

    int selfDiameter = leftNodeInfo.height + rightNodeInfo.height + 1;

    int diameter = Math.max(selfDiameter, Math.max(leftNodeInfo.diameter, rightNodeInfo.diameter));
    int height = Math.max(leftNodeInfo.height, rightNodeInfo.height) + 1;

    return new NodeInfo(height, diameter);
  }

  public static boolean isIdentical(Node root1, Node root2) {
    // Base case: if both nodes are null, they are equal
    if (root1 == null && root2 == null) {
      return true;
    }

    // If one of the nodes is null and the other is not, they are not equal
    if (root1 == null || root2 == null) {
      return false;
    }

    // Check if the data of the current nodes is equal
    if (root1.data != root2.data) {
      return false;
    }

    // Recursively check the left and right subtrees
    boolean left = isIdentical(root1.left, root2.left);
    boolean right = isIdentical(root1.right, root2.right);

    // Return true only if both left and right subtrees are equal
    return left && right;
  }

  public static boolean isSubtree(Node root, Node subRoot) {
    if (root == null) {
      return false;
    }

    if (root.data == subRoot.data) {
      if (isIdentical(root, subRoot)) {
        return true;
      }
    }

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  public static void main(String[] args) {
    int arrPre[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1 };

    int[] arrIn = { -1, 4, -1, 2, -1, 5, -1, 1, -1, 6, -1, 3, -1 };

    Node root = buildTree(arrPre);

    System.out.println("this is data of root : " + root.data);

    preorderTraversal(root);

    System.out.println();

    postorderTraversal(root);

    System.out.println();

    inorderTraversal(root);

    System.out.println();

    levelOrderTraversal(root);

    System.out.println("The maximum diameter of tree is : " + diameter(root));
    System.out.println("The maximum diameter of tree by optimal method is : " + diameterOptimal(root).diameter);
    System.out.println("The maximum height of tree by optimal method is : " + diameterOptimal(root).height);

    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

    System.out.println("check is sub tree present : " + isSubtree(root , subRoot));

  }

}