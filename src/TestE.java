import java.util.HashMap;
public class TestE {
    static class UMap extends HashMap<TestE, String> {}
    ;
    static HashMap<TestE, String> m =
            new HashMap<TestE, String>();

    static int foo(HashMap<TestE, String> map) {
        return map.size();
    }
    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }
    public static String add(TestE b, String s) {
        return m.put(b, s);
    }
    public static String get(TestE b) {
        return m.get(b);
    }
}