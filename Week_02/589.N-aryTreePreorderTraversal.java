/*
time complexity: O(n)
space complexity: O(N)
thought process: Iteration method
use stack to pop the last node, from top to bottom, left to right
*/
class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) {
            return output;
        }
        
        stack.add(root);

        while(!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for(Node item: node.children) {
                stack.add(item);
            }
        }

        return output;
    }
}
/*
time complexity: O(n)
space complexity: O(n)
throught process: recursive 
add the vaule to the list and go through each node and call preorder method
*/
class Solution {
    public List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return list;
        }
        
        list.add(root.val);

        for(Node node: root.children) {
            preorder(node);
        }

        return list;
    }
}