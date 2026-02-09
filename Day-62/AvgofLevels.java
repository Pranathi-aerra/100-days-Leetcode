import java.util.*;
public class AvgofLevels {

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

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int lev=q.size();
            double avg=0;
            for(int i=0;i<lev;i++){
             TreeNode curr=q.poll();
             avg+=curr.val;
           
           
            if(curr.left!=null)   q.offer(curr.left);
            if(curr.right!=null)    q.offer(curr.right);
            }
            avg=avg/lev;
            res.add(avg);

        }
        return res;
    }
}
}
