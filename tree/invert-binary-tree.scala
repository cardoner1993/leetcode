/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def invertTree(root: TreeNode): TreeNode = {
        
        def helper(n: TreeNode): TreeNode = {
            if(n==null){
                return root
            }

            var t = n.left;
            n.left = n.right;
            n.right = t;

            helper(n.left);
            helper(n.right);
        }
        
        helper(root)
        return root
 
        
    }
}
