import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlattenTests {

    private void addNode(Pair<Tree, Integer> node, boolean left, List<Pair<Tree, Integer>> nodes, Random r) {
        if (left) {
            if (node.first.left == null) {
                node.first.left = new Tree(r.nextInt());
                if (node.second < 16) {
                    nodes.add(new Pair(node.first.left, node.second + 1));
                }
                if (node.first.right != null) {
                    nodes.remove(node);
                }
            } else {
                node.first.right = new Tree(r.nextInt());
                if (node.second < 16) {
                    nodes.add(new Pair(node.first.right, node.second + 1));
                }
                nodes.remove(node);
            }
        } else {
            if (node.first.right == null) {
                node.first.right = new Tree(r.nextInt());
                if (node.second < 16) {
                    nodes.add(new Pair(node.first.right, node.second + 1));
                }
                if (node.first.left != null) {
                    nodes.remove(node);
                }
            } else {
                node.first.left = new Tree(r.nextInt());
                if (node.second < 16) {
                    nodes.add(new Pair(node.first.left, node.second + 1));
                }
                nodes.remove(node);
            }
        }
    }

    private int[] flatten(Tree tree) {
        int size = count(tree);
        int[] arr = new int[size];
        traverse(tree, 0, arr);
        return arr;
    }

    private int count(Tree tree) {
        int size = 1;
        if (tree.left != null) {
            size += count(tree.left);
        }
        if (tree.right != null) {
            size += count(tree.right);
        }
        return size;
    }

    private int traverse(Tree tree, int index, int[] arr) {
        if (tree.left != null) {
            index = traverse(tree.left, index, arr);
        }
        arr[index++] = tree.value;
        if (tree.right != null) {
            index = traverse(tree.right, index, arr);
        }
        return index;
    }

    @Test
    public void testFlatten_01() {
        Random r = new Random();
        Tree root = new Tree(r.nextInt());

        List<Pair<Tree, Integer>> nodes = new ArrayList<>();
        nodes.add(new Pair(root, 0));

        for (int i=0; i<100; i++) {
            Pair node = nodes.get(r.nextInt(nodes.size()));
            addNode(node, r.nextBoolean(), nodes, r);
        }

        int[] expectedResult = flatten(root);
        int[] actualResult = Flatten.flatten(root);

        assertTrue(Arrays.equals(expectedResult, actualResult));
    }

    class Pair<K, V> {
        public K first;
        public V second;
        public Pair(K first, V second) {
            this.first = first;
            this.second = second;
        }
    }
}
