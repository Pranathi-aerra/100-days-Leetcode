import java.util.*;
public class ZigZagorder {
  
 // Definition for a binary tree node.
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
 

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)  return res;
        Queue<TreeNode> q=new LinkedList<>();
        boolean ltr=true;
        q.offer(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            LinkedList<Integer> lev=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode node=q.poll();
                if(ltr) lev.addLast(node.val);
                else    lev.addFirst(node.val);
                if(node.left!=null)     q.offer(node.left);
                if(node.right!=null)    q.offer(node.right);

            }
            res.add(lev);
            ltr=!ltr;
 
        }
        return res;
    }
}

