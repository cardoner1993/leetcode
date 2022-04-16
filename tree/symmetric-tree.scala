/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
        def symetric(left: TreeNode, right: TreeNode): Boolean = {
        (left, right) match {
          case (null, null) => true
          case (left, null) => false
          case (null, right) => false
          case (left, right) if left.value != right.value => false
          case (left, right) => symetric(left.left, right.right) && symetric(left.right, right.left)
        }
      }

      if (root == null) true
      else symetric(root.left, root.right)  
    }
}
