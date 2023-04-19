public class Referenzen {
    
    public static void stringTests() {
        String a = "abc";
        String b = a;
        String c = "abc";
        String d = new String("abc");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(d));
    }
}