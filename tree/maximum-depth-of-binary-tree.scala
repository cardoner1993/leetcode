/*
Pattern matching binary tree. null case means Treenode is empty if both a and b defined calculates max between them.
*/
object Solution {
  def maxDepth(root: TreeNode): Int = {
    def helper(node: TreeNode, acc: Int): Int = {
      (node.left, node.right) match {
        case (null, null) => acc
        case (_, null) => helper(node.left, acc + 1)
        case (null, _) => helper(node.right, acc + 1)
        case (a, b) => Math.max(
          helper(node.left, acc + 1), 
          helper(node.right, acc + 1))
      }
    }
    if (root == null) 0 else helper(root, 1)
  }
}
