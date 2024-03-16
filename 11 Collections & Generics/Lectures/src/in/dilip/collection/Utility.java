package in.dilip.collection;

import java.util.Collection;

public class Utility {
    /**
     * Prints the elements of a collection.
     *
     * @param collection The collection to be printed.
     * @param <E>        The type of elements in the collection.
     */
    public static <E> void print(Collection<E> collection) {
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}
