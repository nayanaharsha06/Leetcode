/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        traversal(root, res, 0);
        return res;
    }

    public void traversal(TreeNode root, List<List<Integer>> res, int level){
        if(root == null)  return;
        if(level >= res.size()){
            res.add(new ArrayList<>());
        }
        if(level % 2 == 1){
            res.get(level).add(0,root.val);
        }else{
            res.get(level).add(root.val);
        }
        traversal(root.left, res, level+1);
        traversal(root.right, res, level+1);

    }
}