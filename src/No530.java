public class No530 {
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

    int diff;
    int parent;
    public int getMinimumDifference(TreeNode root) {
        diff = Integer.MAX_VALUE;
        parent = -1;
        dfs(root);
        return diff;
    }
    public void dfs(TreeNode root){
        if(root == null)
            return;
        dfs(root.left);
        if(parent == -1)
            parent = root.val;
        else {
            diff = Math.min(diff, root.val - parent);
            parent = root.val;
        }
        dfs(root.right);
    }
}
