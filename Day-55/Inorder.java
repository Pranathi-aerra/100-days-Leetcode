import java.util.*;
public class Inorder {
  
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> ans=new ArrayList<>();
       inorder(root,ans);
       return ans;
    }
    public void inorder(TreeNode root,List<Integer> l)
    {
         if(root==null) return;
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);

        
    }
}

