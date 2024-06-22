/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder b = new StringBuilder();
        preOrder(root,b);
        return b.toString();

    }
    void preOrder(TreeNode root, StringBuilder b){
        if(root == null){
            b.append("null,");
        }else{
            b.append(root.val+",");
            preOrder(root.left,b);
            preOrder(root.right,b);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list = new ArrayList(Arrays.asList(split));
        return preOrder(list);
    }
    TreeNode preOrder(List<String> list){
        String s = list.get(0);
        if(s.equals("null")){
            list.remove(0);
            return null;
        }else{
            int num = Integer.parseInt(s);
            TreeNode root = new TreeNode(num);
            list.remove(0);
            root.left = preOrder(list);
            root.right = preOrder(list);
            return root;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));