package homework_9_arrayslist;

import java.util.ArrayList;
import java.util.Collections;

//3. Write a Java program to reverse an array of integer values.
public class Programme_3_ReverseArrays {

    ArrayList<Integer> list = new ArrayList();//Arrays list

    // Instance method
    public void integerValue() {

        list.add(1789);
        list.add(2035);
        list.add(1899);
        list.add(1456);
        list.add(2013);
        list.add(1458);
        list.add(2458);
        list.add(1254);
        System.out.println("Original Arrays = " + list);


        Collections.reverse(list);
        System.out.println("After Reversing Arrays =" + list);
        System.out.println(list);
    }


        public static void main(String[] args) {

        //Creating object
        Programme_3_ReverseArrays programme3ReverseArrays = new Programme_3_ReverseArrays();
        programme3ReverseArrays.integerValue();
    }


}