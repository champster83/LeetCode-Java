//Given a binary tree, return the inorder traversal of its nodes' values.

//For example:
//Given binary tree {1,#,2,3},

//   1
//    \
//     2
//    /
//   3

//return [1,3,2]
 
 
  public void inorderRecursive(TreeNode root, List<Integer> inorderList)
  {
        if(root == null)
            return;
        inorderRecursive(root.left,inorderList);
        inorderList.add(root.val);
        inorderRecursive(root.right,inorderList);
  }
  
  public List<Integer> inorderTraversal(TreeNode root) 
  {
      List<Integer> inorderList = new ArrayList<Integer>();
      if(root == null)
          return inorderList;
      TreeNode curr= root;
      Stack<TreeNode> stack = new Stack<TreeNode>();
      while(curr != null)
      {
          stack.push(curr);
          curr = curr.left;
      }
      while(!stack.isEmpty())
      {
          curr = stack.pop();
          inorderList.add(curr.val);
          if(curr.right != null)
          {
              curr = curr.right;
              while(curr != null)
              {
                  stack.push(curr);
                  curr = curr.left;
              }
          }
      }
      return inorderList;
  }
