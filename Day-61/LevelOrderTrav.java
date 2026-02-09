import java.util.*;
 class TreeNode {
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
 
class LevelOrderTrav {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)  return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
           
            int lev=q.size();
            List<Integer> currlist=new ArrayList<>();
            for(int i=0;i<lev;i++)
            {
              TreeNode curr=q.poll();
              currlist.add(curr.val);
              if(curr.left!=null)   q.offer(curr.left);
              if(curr.right!=null)  q.offer(curr.right);

            }
            res.add(currlist);
        }
        return res;
    }
}