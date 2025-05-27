public class Reflection {
    public void greet() {
        System.out.println("Hello from reflection!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Exercise39_Reflection");
        Object obj = cls.getDeclaredConstructor().newInstance();
        cls.getMethod("greet").invoke(obj);
    }
}
