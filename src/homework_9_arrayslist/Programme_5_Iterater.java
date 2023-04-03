package homework_9_arrayslist;

import java.util.ArrayList;
import java.util.Iterator;

/**5. Write a Java program to iterate through all elements in an array list using
 Iterator.**/
public class Programme_5_Iterater {

    //Declaring the ArrayList
    ArrayList<String> list = new ArrayList();

    //Instance method
    //Creating an ArrayList
 public void listElement() {
     list.add("Apple");
     list.add("Banana");
     list.add("Strawberry");
     list.add("Kiwi");
     list.add("Melon");
     list.add("Watermelon");
 }
 //instance method
     public void iterator() {

     //Declaring the Iterator
         Iterator<String> name = list.iterator();

         //While loop
         while (name.hasNext()) {
             System.out.println(name.next());
         }


     }

    public static void main(String[] args) {
     //Object creation
        Programme_5_Iterater programme5Iterater = new Programme_5_Iterater();
        programme5Iterater.listElement();
        programme5Iterater.iterator();

        }
    }






