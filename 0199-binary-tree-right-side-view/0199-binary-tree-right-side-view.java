/** https://www.youtube.com/watch?v=XB8pVqKiI9k&t=69s
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res, 0);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> res, int level){
        if(root == null) return;
        if(level == res.size()){
            res.add(root.val);
        }
        traversal(root.right, res, level+1);
        traversal(root.left, res, level+1);

    }
}