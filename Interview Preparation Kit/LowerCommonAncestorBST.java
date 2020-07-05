import java.util.*;

class BSTNode {
    BSTNode left;
    BSTNode right;
    int data;
    
    BSTNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LowerCommonAncestorBST {

	/*
    class BSTNode 
    	int data;
    	BSTNode left;
    	BSTNode right;
	*/
public static BSTNode lca(BSTNode root, int v1, int v2) 
{
    while(root != null)    
    {
        if(root.data>v1 && root.data>v2)
        {
            root = root.left;
        }
        else if(root.data<v1 && root.data<v2)
        {
            root = root.right;
        }
        else
        {
            break;
        }
    }
    return root;
}

public static BSTNode insert(BSTNode root, int data) {
    if(root == null) {
        return new BSTNode(data);
    } else {
        BSTNode cur;
        if(data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    BSTNode root = null;
    while(t-- > 0) {
        int data = scan.nextInt();
        root = insert(root, data);
    }
    int v1 = scan.nextInt();
      int v2 = scan.nextInt();
    scan.close();
    BSTNode ans = lca(root,v1,v2);
    System.out.println(ans.data);
}	
}