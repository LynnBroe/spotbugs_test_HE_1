import java.util.HashMap;
public class TestH {
    static class UMap extends HashMap<TestH, String> {}
    ;
    static HashMap<TestH, String> m =
            new HashMap<TestH, String>();

    static int foo(HashMap<TestH, String> map) {
        return map.size();
    }
    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }
    public static String add(TestH b, String s) {
        return m.put(b, s);
    }
    public static String get(TestH b) {
        return m.get(b);
    }
}