import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Calvin", "David", "Gordon"));
        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            String switchedName = switchFirstAndLast(name);
            switchedNames.add(switchedName);
        }

        System.out.println("Names = {" + String.join(", ", names) + "}");
        System.out.println("Names (switched) = {" + String.join(", ", switchedNames) + "}");
    }

    private static String switchFirstAndLast(String name) {
        if (name.length() > 1) {
            char firstChar = Character.toUpperCase(name.charAt(name.length() - 1));
            char lastChar = Character.toLowerCase(name.charAt(0));
            return firstChar + name.substring(1, name.length() - 1) + lastChar;
        }
        return name;
    }
}
