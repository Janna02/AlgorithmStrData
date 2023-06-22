package seminar3;

public class TreeTry {
    public static void main(String[] args) {
        BlackRedTree<String> tree = new BlackRedTree();
        tree.add("a");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("b");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("c");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("d");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("f");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("e");
        System.out.println("-------------------------");
        tree.print(tree.root);
        tree.add("w");
        System.out.println("-------------------------");
        tree.print(tree.root);
        System.out.println("-------------------------");
    }
}