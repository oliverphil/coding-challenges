package challenges.initial.flatten;

import java.util.Objects;

class Tree {
    public Tree left;
    public Tree right;
    public int value;

    public Tree(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return value == tree.value &&
                Objects.equals(left, tree.left) &&
                Objects.equals(right, tree.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, value);
    }
}

public class Flatten {
    public static int[] flatten(Tree tree) {
        return new int[0];
    }
}
