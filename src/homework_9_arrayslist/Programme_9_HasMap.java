package homework_9_arrayslist;

import java.util.HashMap;
import java.util.Map;

/**9. Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map.**/

public class Programme_9_HasMap {
   //create object for hashmap
    HashMap<String,Integer>people =new HashMap<>();

    //Method for adding people
    public HashMap<String, Integer> getPeople() {

        people.put("Kruti",35);
        people.put("Axika",30);
        people.put("Manju",16);
        people.put("Mansi",34);
        people.put("Paulomi",37);
        people.put("Hitesh",39);
        people.put("Rashang",38);
        people.put("Bhavi",36);
        return people;
    }
    //Instance method
    public void setPeople(){
        System.out.println("Name \t\t\t\t Age\t\t" );
        System.out.println("-------------------------");

        //for each loop
        for (Map.Entry<String,Integer>people : people.entrySet()){

            System.out.println( people.getKey() + "\t\t\t"+people.getValue());
        }

    }

    public static void main(String[] args) {
        //create object
        Programme_9_HasMap programme9HasMap = new Programme_9_HasMap();
        programme9HasMap.getPeople();
        programme9HasMap.setPeople();
    }
}
