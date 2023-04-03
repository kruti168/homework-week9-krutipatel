package homework_9_arrayslist;

import java.util.ArrayList;

/**6. Write a Java program to retrieve an element (at a specified index) from a given
 array list**/

public class Programme_6_Retrieve {
    //ArrayList object
    ArrayList list = new ArrayList();
    public void listElement(){

//list adding
        list.add(10);
        list.add("kruti");
        list.add(30);
        list.add("India");

        System.out.println(list);

    }//Intance method
    public void retrive(){
        System.out.println("The element of index 1 is :" + list.get(1));
        System.out.println("The element of index 3 is :" + list.get(3));

    }

    public static void main(String[] args) {

        //object create
       Programme_6_Retrieve programme_6_retrieve = new Programme_6_Retrieve();
        programme_6_retrieve.listElement();
       programme_6_retrieve.retrive();


    }

}
