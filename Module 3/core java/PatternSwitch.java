public class PatternSwitch{
    static void identifyType(Object obj) {
        if (obj instanceof Integer) {
            Integer i = (Integer) obj;
            System.out.println("Integer: " + i);
        } else if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String: " + s);
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            System.out.println("Double: " + d);
        } else {
            System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        identifyType(10);
        identifyType("Hello");
        identifyType(3.14);
        identifyType(true); // will print "Unknown type"
    }
}