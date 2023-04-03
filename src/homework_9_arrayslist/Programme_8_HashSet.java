package homework_9_arrayslist;

import java.util.HashSet;

/**8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else)**/


public class Programme_8_HashSet {

    //Create a HasSet object called numbers
    HashSet<Integer>numbers = new HashSet<Integer>();

    //Create instance method using for add number
    public HashSet<Integer>getNumbers(){
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        return numbers;

    }//Create Instance Method
    public void setNumbers(){

        //Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <=10; i++){
            if (numbers.contains(i)){
                System.out.println(i +"Was found in the set.");

            }else {
                System.out.println(i + "Wan not found in the set.");
            }
        }
    }


    public static void main(String[] args) {
        //Create object
        Programme_8_HashSet programme8HashSet = new Programme_8_HashSet();
        programme8HashSet.getNumbers();
        programme8HashSet.setNumbers();

    }


}
