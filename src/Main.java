import java.util.HashSet;

public class Main {

    public static HashSet<String> createHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Value1");
        hashSet.add("Value2");
        hashSet.add("Value3");

        return hashSet;
    }

    public static void main(String[] args) {

        HashSet<String> myHashSet = createHashSet();


        String objectToCheck = "Value2";


        boolean isPresent = myHashSet.contains(objectToCheck);

        // Print the result
        if (isPresent) {
            System.out.println("The element '" + objectToCheck + "' is part of the HashSet.");
        } else {
            System.out.println("The element '" + objectToCheck + "' is not part of the HashSet.");
        }
    }
}