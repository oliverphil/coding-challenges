final class Tree {
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
                java.util.Objects.equals(left, tree.left) &&
                java.util.Objects.equals(right, tree.right);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(left, right, value);
    }
}

public static int[] flatten(Tree tree) {
    return new int[0];
}
