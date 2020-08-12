package Search;
import Search.Search;

public class SearchCompileTests {

    public static void main(String[] args) {
        SearchCompileTests tests = new SearchCompileTests();
        tests.testStringSearch_01();
    }

    public void testStringSearch_01() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] searchArr = new int[]{5, 6, 7};

        boolean b = Search.search(searchArr, arr);
    }

}
