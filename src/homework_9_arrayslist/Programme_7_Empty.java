package homework_9_arrayslist;

import java.util.ArrayList;

/**7. Write a Java program to test if an array list is empty or not.**/
public class Programme_7_Empty {
    //Arraylist object
    ArrayList list = new ArrayList();


    public void isEmptyArray(){
        boolean ans = list.isEmpty();
        if (ans == true){

            System.out.println("The arraylist is empty:");
        }else {
            System.out.println("The arraylist is not empty");
        }
    }
    //Instance method create for check array list is empty or not
    public void isNotEmptyArray(){
        //Instance method for adding list
        list.add(10);
        list.add("Apple");
        list.add(60);
        list.add("Banana");
        list.add("Raspberry");
        list.add(100);

        boolean ans = list.isEmpty();
        //if else statement
        if (ans == true){

            System.out.println("The arraylist is empty:");
        }else {
            System.out.println("The arraylist is not empty");
        }
    }

    public static void main(String[] args) {
        //object create
                Programme_7_Empty programme7Empty = new Programme_7_Empty();
                programme7Empty.isEmptyArray();
                programme7Empty.isNotEmptyArray();








    }



}
