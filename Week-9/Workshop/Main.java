
//     1.	Create an ArrayList to store the names of students in a class. Add, remove, and print the list of students.
// ●	Initialize an empty ArrayList to store examinee names.
// ●	Add the names of five examinee participating in the exam to the ArrayList.
// ●	Remove the name of the examinee who withdrew from the exam.
// ●	Print the updated list of participants.
// import java.util.ArrayList;

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Iterator;
// import java.util.LinkedList;

// public class Main {
    // public static void main(String[] args) {
    //     ArrayList<String> studentList = new ArrayList<>();
    //     studentList.add("Santosh");
    //     studentList.add("Sumit");
    //     studentList.add("Arayan");
    //     studentList.add("Rajni");
    //     studentList.add("Barsigh");

    //     System.out.println("Initial List : " + studentList);

    //     String withdrawnStudent = "Arayan";
    //     studentList.remove(withdrawnStudent);

    //     System.out.println("Updated List : " + studentList);
    // }




    // 2.	Write a program to insert elements into the linked list at the first and last positions. 
    // Also check if the linked list is empty or not.
//     public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();  
//         list.add("SUMIT");
//         list.add("SANTOSH");
//         list.add("RAJNI");

//         Iterator itr = list.iterator();
//         while (itr.hasNext()) {
//             System.out.println(itr.next());
            
//         }
//         list.addFirst("Rukesh");
//         list.addLast("Keshav");

//         System.out.println("Upadted List : ");
//         Iterator<String> upIterator = list.iterator();
//         while (upIterator.hasNext()) {
//             System.out.println(upIterator.next());
//         }
//     }







    // 3.	Rotate the elements of an ArrayList to the right by a given number of positions. 
    // For example, if the ArrayList is [1, 2, 3, 4, 5] and you rotate it by 2 positions, the result should be [4, 5, 1, 2, 3].
    // public static void main(String[] args) {
    //     ArrayList<Integer> arrayList = new ArrayList<>();
    //     arrayList.add(1);
    //     arrayList.add(2);
    //     arrayList.add(3);
    //     arrayList.add(4);
    //     arrayList.add(5);

    //     int rotateBy = 2;

    //     System.out.println("Original List : " + arrayList);

    
    //     Collections.rotate(arrayList, rotateBy);

    //     System.out.println("Rotated List : " + arrayList);


    // }






//     5.	Write a program to declare a linkedList, colors to store String. Insert five colors into the linked list. 
// a.	Iterate and print all the colors. 
// b.	Check if “Red” exists in the linkedList or not.
// c.	Shuffle the elements of the list and print them.
// d.	Print the LinkedList in ascending order
// import java.util.LinkedList;
// import java.util.Collections;
// import java.util.Iterator;

// public class Main {
//     public static void main(String[] args) {
//         // Create a LinkedList to store colors
//         LinkedList<String> colors = new LinkedList<>();

//         // Insert five colors into the linked list
//         colors.add("Red");
//         colors.add("Blue");
//         colors.add("Green");
//         colors.add("Yellow");
//         colors.add("Orange");

//         // a. Iterate and print all the colors
//         System.out.println("All colors:");
//         for (String color : colors) {
//             System.out.println(color);
//         }

//         // b. Check if "Red" exists in the linked list or not
//         if (colors.contains("Red")) {
//             System.out.println("Red exists in the linked list.");
//         } else {
//             System.out.println("Red does not exist in the linked list.");
//         }

//         // c. Shuffle the elements of the list and print them
//         Collections.shuffle(colors);
//         System.out.println("\nShuffled colors:");
//         for (String color : colors) {
//             System.out.println(color);
//         }

//         // d. Print the LinkedList in ascending order
//         Collections.sort(colors);
//         System.out.println("\nColors in ascending order:");
//         for (String color : colors) {
//             System.out.println(color);
//         }
//     }
// }










// Stack:
// 6.	Create a Stack to manage a sequence of tasks. Implement the following operations:
// a.	Push the tasks "Read", "Write", and "Code" onto the stack.
// b.	Pop a task from the stack.
// c.	Push tasks "Debug" and "Test" onto the stack.
// d.	Peek at the top task without removing it.
// e.	Print the stack.

// import java.util.Stack;

// public class Main {
//     public static void main(String[] args) {
//         // Create a Stack to manage tasks
//         Stack<String> tasks = new Stack<>();

//         // a. Push the tasks "Read", "Write", and "Code" onto the stack
//         tasks.push("Read");
//         tasks.push("Write");
//         tasks.push("Code");

//         // b. Pop a task from the stack
//         String poppedTask = tasks.pop();
//         System.out.println("Popped task: " + poppedTask);

//         // c. Push tasks "Debug" and "Test" onto the stack
//         tasks.push("Debug");
//         tasks.push("Test");

//         // d. Peek at the top task without removing it
//         String topTask = tasks.peek();
//         System.out.println("Top task: " + topTask);

//         // e. Print the stack
//         System.out.println("\nTasks on the stack:");
//         for (String task : tasks) {
//             System.out.println(task);
//         }
//     }
// }











// 7.	Write a program that reverses the order of words in a sentence using a Stack. For example, 
// if the input is "Hello World", the output should be "World Hello".
// import java.util.Stack;

// public class Main {
//     public static void main(String[] args) {
//         String input = "Hello World";
//         String reversedSentence = reverseSentence(input);
//         System.out.println("Reversed sentence: " + reversedSentence);
//     }

//     public static String reverseSentence(String sentence) {
//         // Split the sentence into words
//         String[] words = sentence.split(" ");
        
//         // Create a stack to store the words
//         Stack<String> wordStack = new Stack<>();
//         for (String word : words) {
//             wordStack.push(word);
//         }
        
//         // Reconstruct the sentence by popping words from the stack
//         StringBuilder reversedSentence = new StringBuilder();
//         while (!wordStack.isEmpty()) {
//             reversedSentence.append(wordStack.pop()).append(" ");
//         }
        
//         // Remove trailing space and return the reversed sentence
//         return reversedSentence.toString().trim();
//     }
// }










// 8.	Imagine a scenario where a printer is managing print jobs. Create a Queue to handle these print jobs. 
// \Implement the following operations:
// ●	Enqueue print jobs "Document1", "Document2", and "Document3" into the print queue.
// ●	Dequeue a print job from the front of the queue.
// ●	Enqueue print jobs "Document4" and "Document5" into the print queue.
// ●	Peek at the next print job without removing it.
// ●	Print the list of print jobs in the queue.


// import java.util.LinkedList;
// import java.util.Queue;

// public class Main {
//     public static void main(String[] args) {
//         // Create a Queue to manage print jobs
//         Queue<String> printQueue = new LinkedList<>();

//         // Enqueue print jobs "Document1", "Document2", and "Document3" into the print queue
//         printQueue.add("Document1");
//         printQueue.add("Document2");
//         printQueue.add("Document3");

//         // Dequeue a print job from the front of the queue
//         String dequeuedJob = printQueue.poll();
//         System.out.println("Dequeued job: " + dequeuedJob);

//         // Enqueue print jobs "Document4" and "Document5" into the print queue
//         printQueue.add("Document4");
//         printQueue.add("Document5");

//         // Peek at the next print job without removing it
//         String nextJob = printQueue.peek();
//         System.out.println("Next job: " + nextJob);

//         // Print the list of print jobs in the queue
//         System.out.println("\nPrint jobs in the queue:");
//         for (String job : printQueue) {
//             System.out.println(job);
//         }
//     }
// }








// 9.	Implement a TreeSet to store unique names in alphabetical order.
// import java.util.TreeSet;

// public class Main {
//     public static void main(String[] args) {
//         TreeSet<String> uniqueNames = new TreeSet<>();

//         // Add names to the TreeSet
//         uniqueNames.add("Sumit");
//         uniqueNames.add("Samridhi");
//         uniqueNames.add("Santosh");
//         uniqueNames.add("Rajni");
//         uniqueNames.add("Samridhi");

//         // TreeSet
//         System.out.println("Names in alphabetical order:");
//         for (String name : uniqueNames) {
//             System.out.println(name);
//         }
//     }
// }










// 10.	Consider a scenario where you have two sets, each representing a group of animals. Implement a Java program to perform set operations (Union, Intersection, and Difference) on these sets:
// ●	Initialize two HashSet objects: set1 with elements "Dog," "Cat," "Elephant," and "Lion," and set2 with elements "Cat," "Giraffe," "Dog," and "Monkey."
// ●	Implement a method performUnion that takes two sets and returns their union.
// ●	Implement a method performIntersection that takes two sets and returns their intersection.
// ●	Implement a method performDifference that takes two sets and returns the difference of the first set from the second set.
// ●	Print the original sets, the union, intersection, and difference of the sets.


// import java.util.HashSet;
// import java.util.Set;

// public class Main {
//     public static void main(String[] args) {
//         Set<String> set1 = new HashSet<>();
//         Set<String> set2 = new HashSet<>();

//         set1.add("Dog");
//         set1.add("Cat");
//         set1.add("Elephant");
//         set1.add("Lion");

//         set2.add("Cat");
//         set2.add("Giraffe");
//         set2.add("Dog");
//         set2.add("Monkey");

//         System.out.println("Original set1: " + set1);
//         System.out.println("Original set2: " + set2);

//         Set<String> union = performUnion(set1, set2);
//         System.out.println("Union: " + union);

//         Set<String> intersection = performIntersection(set1, set2);
//         System.out.println("Intersection: " + intersection);

//         Set<String> difference = performDifference(set1, set2);
//         System.out.println("Difference (set1 - set2): " + difference);
//     }

//     public static <T> Set<T> performUnion(Set<T> set1, Set<T> set2) {
//         Set<T> union = new HashSet<>(set1);
//         union.addAll(set2);
//         return union;
//     }

//     public static <T> Set<T> performIntersection(Set<T> set1, Set<T> set2) {
//         Set<T> intersection = new HashSet<>(set1);
//         intersection.retainAll(set2);
//         return intersection;
//     }

//     public static <T> Set<T> performDifference(Set<T> set1, Set<T> set2) {
//         Set<T> difference = new HashSet<>(set1);
//         difference.removeAll(set2);
//         return difference;
//     }
// }












// 11.	Write a program that uses a HashMap to store contact information (name and phone number).

// import java.util.HashMap;
// import java.util.Map;

// public class Main {
//     public static void main(String[] args) {
//         Map<String, String> contacts = new HashMap<>();
//         contacts.put("Sumit Shah", "9818257300");
//         contacts.put("Rajni Shah", "9861446442");
//         contacts.put("Santosh Shah", "9818257400");

//         System.out.println("Contact Information:");
//         contacts.forEach((name, phoneNumber) -> System.out.println("Name: " + name + ", Phone Number: " + phoneNumber));

//         String sumitPhoneNumber = contacts.get("Sumit Shah");
//         System.out.println("\nPhone number for Sumit Shah: " + sumitPhoneNumber);

//         String nameToCheck = "Rajni Shah";
//         System.out.println((contacts.containsKey(nameToCheck) ? nameToCheck + " exists in contacts." : nameToCheck + " does not exist in contacts."));
//     }
// }









// 12.	Imagine a scenario where you are managing information about countries and their capitals using a HashMap. Perform the following tasks:
// ●	Initialize a HashMap called countryCapitals to store the capitals of different countries. Add at least five country-capital pairs.
// ●	Implement a method called printMap that takes a HashMap and prints all the key-value pairs.
// ●	Implement a method called getCapital that takes a country name as a parameter and returns its capital from the countryCapitals map.
// ●	Implement a method called containsCapital that takes a capital name as a parameter and returns whether that capital exists in the countryCapitals map.
// ●	Iterate through the countryCapitals map and print each country and its capital.
// import java.util.HashMap;
// import java.util.Map;

// public class Main {
//     public static void main(String[] args) {
//         Map<String, String> countryCapitals = new HashMap<>();
//         countryCapitals.put("USA", "Washington, D.C.");
//         countryCapitals.put("UK", "London");
//         countryCapitals.put("France", "Paris");
//         countryCapitals.put("Germany", "Berlin");
//         countryCapitals.put("Japan", "Tokyo");

//         printMap(countryCapitals);

//         String capitalForUK = getCapital("UK", countryCapitals);
//         System.out.println("Capital of UK: " + capitalForUK);

//         String capitalToCheck = "Paris";
//         System.out.println("Does '" + capitalToCheck + "' exist in the map? " + containsCapital(capitalToCheck, countryCapitals));

//         System.out.println("\nCountry-Capital Information:");
//         for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
//             System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
//         }
//     }

//     public static void printMap(Map<String, String> map) {
//         for (Map.Entry<String, String> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " - " + entry.getValue());
//         }
//     }

//     public static String getCapital(String country, Map<String, String> map) {
//         return map.getOrDefault(country, "Capital not found");
//     }

//     public static boolean containsCapital(String capital, Map<String, String> map) {
//         return map.containsValue(capital);
//     }
// }













// 13.	Write a program that sorts an array of integers using the sort() method. Also try sorting in reverse order.

// import java.util.Arrays;
// import java.util.Comparator;

// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {5, 2, 9, 1, 7};

//         Arrays.sort(numbers);
//         printArray(numbers);

//         Integer[] integerNumbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
//         Arrays.sort(integerNumbers, Comparator.reverseOrder());
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = integerNumbers[i];
//         }
//         printArray(numbers);
//     }

//     public static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
// }














// 14.	Write a program that sorts an array  list of string of colors using the sort() method. Also try sorting in reverse order.
// import java.util.ArrayList;
// import java.util.Collections;

// public class Main {
//     public static void main(String[] args) {
//         ArrayList<String> colors = new ArrayList<>();
//         colors.add("Red");
//         colors.add("Blue");
//         colors.add("Green");
//         colors.add("Yellow");
//         colors.add("Orange");

//         Collections.sort(colors);
//         System.out.println("Sorted in ascending order:");
//         printList(colors);

//         Collections.sort(colors, Collections.reverseOrder());
//         System.out.println("\nSorted in descending order:");
//         printList(colors);
//     }

//     public static void printList(ArrayList<String> list) {
//         for (String color : list) {
//             System.out.print(color + " ");
//         }
//         System.out.println();
//     }
// }










// 15.	Write a program to initialize an ArrayList with a set of integers. Implement a binary search algorithm to find a particular integer.
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 2, 5, 8, 12, 16, 23, 38, 56, 72, 91);

        int target = 23;
        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the list");
        }
    }

    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0, right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == target) return mid;
            if (arr.get(mid) < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
