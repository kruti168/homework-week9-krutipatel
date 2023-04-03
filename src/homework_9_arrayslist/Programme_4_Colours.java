package homework_9_arrayslist;

import java.util.ArrayList;

/**4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.**/
public class Programme_4_Colours {
    //ArrayList object
    ArrayList<String> colour = new ArrayList<>();


    public static void main(String[] args) {

        //object create
        Programme_4_Colours programme4Colours = new Programme_4_Colours();
        programme4Colours.colour();
        programme4Colours.collectionColour();
    }
    public void colour(){

        colour.add("Green");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Red");
        colour.add("Pink");


    }//Instance method for collection colour
    public void collectionColour(){
        //for each loop
        for( String list: colour){

            System.out.println(list);
        }//adding colours
        ArrayList<String> colours = new ArrayList<>();

        colours.add("Brown");
        colours.add("Orange");

        for (String s :colours){
            System.out.println(colours);
        }


    }
}
