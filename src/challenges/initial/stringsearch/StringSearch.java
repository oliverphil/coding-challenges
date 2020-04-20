package challenges.initial.stringsearch;

public class StringSearch {
    public static boolean search(char[] text, char[] searchString) {
        String t = String.valueOf(text);
        String s = String.valueOf(searchString);
        return t.contains(s);
    }
}
