package stringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String message = sb.toString();
        System.out.println(message);

        // append
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.append("Java");
        System.out.println(sb1);

        // insert
        StringBuffer sb2 = new StringBuffer("Hello ");
        sb2.insert(1, "java");
        System.out.println(sb2);

        // replace
        StringBuffer sb3 = new StringBuffer("Hello ");
        sb3.replace(1, 3, "java");
        System.out.println(sb3);

        // delete
        StringBuffer sb4 = new StringBuffer("Hello ");
        sb4.delete(1, 3);
        System.out.println(sb4);

        // reverse
        StringBuffer sb5 = new StringBuffer("Hello");
        sb5.reverse();
        System.out.println(sb5);

        // capacity
        StringBuffer sb6 = new StringBuffer();
        System.out.println(sb6.capacity());
        sb6.append("Hello");
        System.out.println(sb6.capacity());
        sb6.append("java is my favourite language");
        System.out.println(sb6.capacity());

    }
}
