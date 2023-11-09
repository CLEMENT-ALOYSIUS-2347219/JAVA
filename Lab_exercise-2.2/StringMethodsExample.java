public class StringMethodsExample {
    public static void main(String[] args) {
        // Define a sample string
        String str = "Hello, World!";

        // charAt(int index) - Returns the character at the specified index
        char charAtIndex = str.charAt(7);
        System.out.println("charAt(7): " + charAtIndex);

        // compareTo(String anotherString) - Compares two strings lexicographically
        int compareToResult = str.compareTo("Hello, Java!");
        System.out.println("compareTo(\"Hello, Java!\"): " + compareToResult);

        // concat(String str) - Appends a string to the end of another string
        String concatenated = str.concat(" Welcome");
        System.out.println("concat(\" Welcome\"): " + concatenated);

        // contains(CharSequence sequence) - Checks whether a string contains a sequence of characters
        boolean containsSequence = str.contains("World");
        System.out.println("contains(\"World\"): " + containsSequence);

        // endsWith(String suffix) - Checks whether a string ends with the specified characters
        boolean endsWithSuffix = str.endsWith("!");
        System.out.println("endsWith(\"!\"): " + endsWithSuffix);

        // equals(Object anObject) - Compares two strings for equality
        boolean equalsResult = str.equals("Hello, World!");
        System.out.println("equals(\"Hello, World!\"): " + equalsResult);

        // equalsIgnoreCase(String anotherString) - Compares two strings, ignoring case
        boolean equalsIgnoreCaseResult = str.equalsIgnoreCase("hello, world!");
        System.out.println("equalsIgnoreCase(\"hello, world!\"): " + equalsIgnoreCaseResult);

        // format(String format, Object... args) - Returns a formatted string
        String formattedString = String.format("Value is %.2f", 3.14159);
        System.out.println("format(\"Value is %.2f\", 3.14159): " + formattedString);

        // getBytes() - Encodes the string into a sequence of bytes
        byte[] bytes = str.getBytes();
        System.out.println("getBytes(): " + new String(bytes));

        // hashCode() - Returns the hash code of a string
        int hashCode = str.hashCode();
        System.out.println("hashCode(): " + hashCode);

        // indexOf(int ch) - Returns the position of the first occurrence of a character
        int indexOfChar = str.indexOf('l');
        System.out.println("indexOf('l'): " + indexOfChar);

        // intern() - Returns the canonical representation for the string object
        String internedString = str.intern();
        System.out.println("intern(): " + internedString);

        // isEmpty() - Checks whether a string is empty
        boolean isEmpty = str.isEmpty();
        System.out.println("isEmpty(): " + isEmpty);

        // ... Add more method examples as needed

    }
}
