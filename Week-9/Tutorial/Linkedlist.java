import java.util.LinkedList;

    // 4 . Write a program to insert elements into the linked list at the first and last positions. 
    // Check if the linked list is empty or not. Also,  get the first and last occurrence of the elements in a linked list
        

public class Linkedlist{
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert elements at the first and last positions
        insertFirstAndLast(linkedList, "Element1");
        insertFirstAndLast(linkedList, "Element2");
        insertFirstAndLast(linkedList, "Element3");

        // Check if the linked list is empty
        System.out.println("Is the linked list empty? " + (linkedList.isEmpty() ? "Yes" : "No"));

        // Print the linked list
        System.out.println("Linked List:");
        printLinkedList(linkedList);

        // Get the first and last occurrences of elements
        getFirstAndLastOccurrences(linkedList, "Element1");
        getFirstAndLastOccurrences(linkedList, "Element3");
        getFirstAndLastOccurrences(linkedList, "Element4");
    }

    // Method to insert elements at the first and last positions
    private static void insertFirstAndLast(LinkedList<String> list, String element) {
        list.addFirst(element);
        list.addLast(element);
    }

    // Method to print the linked list
    private static void printLinkedList(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    // Method to get the first and last occurrences of an element
    private static void getFirstAndLastOccurrences(LinkedList<String> list, String element) {
        int firstIndex = list.indexOf(element);
        int lastIndex = list.lastIndexOf(element);

        System.out.println("\nOccurrences of '" + element + "':");
        if (firstIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
        } else {
            System.out.println("Element not found in the linked list.");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Element not found in the linked list.");
        }
    }
}
