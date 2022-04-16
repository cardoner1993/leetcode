/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
 
// Clean implementation of binary tree partition

object Solution {
    def preorderTraversal(root: TreeNode): List[Int] = {
        if (root == null) {
            return List()
        }

        return List(root.value) ++ preorderTraversal(root.left) ++ preorderTraversal(root.right)
    }
}
