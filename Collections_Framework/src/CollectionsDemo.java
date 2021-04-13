

// Java program to demonstrate adding
// elements using addAll() method
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
class CollectionsDemo {
    public static void main(String[] args)
    {
        // create a list
        List<String> items = new ArrayList<>();
 
        // add items to the list
        items.add("Shoes");
        items.add("Toys");
 
        // Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball");
 
        // print the list contents
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}




