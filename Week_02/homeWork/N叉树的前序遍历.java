/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
         LinkedList<Integer> output = new LinkedList<>();
         Deque<Node> stack = new LinkedList<>();
        stack.addFirst(root);
        while(!stack.isEmpty()){
            
            Node nTree = stack.pollLast();
            //这里需要加个判空处理 可能是[1,null,3,2,4,null,5,6]
            if(nTree ==null){
                return output;
            }
            output.add(nTree.val);
            Collections.reverse(nTree.children);
            for(Node node : nTree.children){
                if (node != null) {
                  stack.add(node); //等于addLast
              } 
            }
            
        }
        return  output;
    }
    }