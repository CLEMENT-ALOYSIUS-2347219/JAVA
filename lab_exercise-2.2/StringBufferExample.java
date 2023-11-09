import java.util.Scanner;

public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // append() method
        sb.append(" World");
        System.out.println("String after append(): " + sb);

        // insert() method
        sb.insert(5, "Java");
        System.out.println("String after insert(): " + sb);

        // replace() method
        sb.replace(5, 9, "Programming");
        System.out.println("String after replace(): " + sb);

        // delete() method
        sb.delete(11, 15);
        System.out.println("String after delete(): " + sb);

        // charAt() method
        char ch = sb.charAt(6);
        System.out.println("Character at index 6: " + ch);

        // setCharAt() method
        sb.setCharAt(6, 'g');
        System.out.println("String after setCharAt(): " + sb);

        // length() method
        int len = sb.length();
        System.out.println("Length of the string: " + len);

        // capacity() method
        int cap = sb.capacity();
        System.out.println("Capacity of the string buffer: " + cap);

        // ensureCapacity() method
        sb.ensureCapacity(25);
        System.out.println("Capacity after ensureCapacity(): " + sb.capacity());

        // toString() method
        String str = sb.toString();
        System.out.println("String representation: " + str);

        // substring(int start) method
        String sub1 = sb.substring(5);
        System.out.println("Substring starting from index 5: " + sub1);

        // substring(int start, int end) method
        String sub2 = sb.substring(5, 11);
        System.out.println("Substring from index 5 to index 10: " + sub2);
    }
}
