import java.util.HashMap;
public class TestF {
    static class UMap extends HashMap<TestF, String> {}
    ;
    static HashMap<TestF, String> m =
            new HashMap<TestF, String>();

    static int foo(HashMap<TestF, String> map) {
        return map.size();
    }
    @Override
    public boolean equals(Object o) {
        return hashCode() == o.hashCode();
    }
    public static String add(TestF b, String s) {
        return m.put(b, s);
    }
    public static String get(TestF b) {
        return m.get(b);
    }
}