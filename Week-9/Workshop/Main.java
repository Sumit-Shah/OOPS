
//     1.	Create an ArrayList to store the names of students in a class. Add, remove, and print the list of students.
// ●	Initialize an empty ArrayList to store examinee names.
// ●	Add the names of five examinee participating in the exam to the ArrayList.
// ●	Remove the name of the examinee who withdrew from the exam.
// ●	Print the updated list of participants.
// import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
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
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int rotateBy = 2;

        System.out.println("Original List : " + arrayList);

    
        Collections.rotate(arrayList, rotateBy);

        System.out.println("Rotated List : " + arrayList);


    }

    // private static void rotateRight(ArrayList<Integer> list, int positions)
}
