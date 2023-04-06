import java.util.HashMap;
public class TestG {
    static class UMap extends HashMap<TestG, String> {}
    ;
    static HashMap<TestG, String> m =
            new HashMap<TestG, String>();

    static int foo(HashMap<TestG, String> map) {
        return map.size();
    }
    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }
    public static String add(TestG b, String s) {
        return m.put(b, s);
    }
    public static String get(TestG b) {
        return m.get(b);
    }
}