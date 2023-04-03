package homework_9_arrayslist;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 **/
public class Programme_10_StationName {
    //HasMap object
    char c;
    HashMap<String, String> zone = new HashMap<>();

    public HashMap<String, String> getZone() {

        zone.put("Paddington", "Bakerloo/Circle/District/Hammersmith & City");
        zone.put("Edgware Road", "Bakerloo/Circle/District/Hammersmith & City");
        zone.put("Marlyebone", "Bakerloo");
        zone.put("Baker street", "Bakerloo/Jubilee/Metropolitan/Hammersmith & City");
        zone.put("Oxford Circus", "Bakerloo/Central/Victoria");
        zone.put("Piccadilly Circus", "Bakerloo");
        zone.put("Charing Cross", "Bakerloo/Northen");
        zone.put("Embankment", "Bakerloo/Northern/Circle");
        zone.put("Waterloo", "Bakerloo/Jubliee/Northern");
        zone.put("LambethNorth", "Bakerloo");
        zone.put("Elephant&castle", "Bakerloo/Northern");
        zone.put("NottingHill Gate", "Central/Circle/District");
        zone.put("Queensway", "Central");
        zone.put("lancasterGate", "Central");
        zone.put("MarbleArch", "Central");
        zone.put("Bond Street", "Central/Jubilee");
        zone.put("Holborn", "Central/Northern/Piccadilly");
        zone.put("Tottenum Court Road", "Central/Northern");
        zone.put("ChanceryLane", "Central");
        zone.put("StPaul", "Central");
        zone.put("Bank", "Central/Northern");
        zone.put("Liverpool Street", "Central/Metropolitan/Circle/Hammersmith & City");
        zone.put("GreenPark", "Jubliee/Piccadilly");
        zone.put("Westminster", "Jubliee/Circle");
        zone.put("Southwark", "Jubliee");
        zone.put("Londonbridge", "Jubliee/Northen");
        zone.put("Euston", "Northern/Victoria");
        zone.put("King'sCross", "Northern/Piccadilly/Metropolitan/Hammersmith & City/Victoria");
        zone.put("Angel", "Northern");
        zone.put("OldStreet", "Northern");
        zone.put("Moorgate", "Northern/Metropolitan/Hammersmith & City");
        zone.put("Borough", "Northern");
        zone.put("Warren Street", "Northern/Victoria");
        zone.put("Goodge Street", "Northern");
        zone.put("Lecicester Square", "Northern/Piccadilly");
        zone.put("Earl's Court", "Piccadilly/District");
        zone.put("Gloucester Road", "Piccadilly/Circle/District");
        zone.put("South Kensington", "Piccadilly/Circle/District");
        zone.put("KnightsBridge", "Piccadilly");
        zone.put("HydePark Corner", "Piccadilly");
        zone.put("Covent Garden", "Piccadilly");
        zone.put("RusselSquare", "Piccadilly");
        zone.put("GreatPortLand", "Metropolitan/Hammersmith & City");
        zone.put("Euston Square", "Metropolitan/Hammersmith & City");
        zone.put("Farringdon", "Metropolitan/Hammersmith & City");
        zone.put("Barbican", "Metropolitan/Hammersmith & City");
        zone.put("Aldgate", "Metropolitan/Circle");
        zone.put("Bayswater", "Circle/District");
        zone.put("HighStreet Kensington", "Circle/District");
        zone.put("Sloane Square", "Circle");
        zone.put("Victoria", "Circle/Victoria");
        zone.put("St Jame's Park", "Circle");
        zone.put("Temple", "Circle");
        zone.put("Blackfrier", "Circle");
        zone.put("Mansion House", "Circle");
        zone.put("CannonStreet", "Circle");
        zone.put("Monument", "Circle");
        zone.put("TowerHill", "Circle/District");
        zone.put("Tower", "Circle");
        zone.put("Aldgate East", "Circle/Hammersmith & City");
        zone.put("Vauxhall", "Victoria");

        return zone;

    }
    public void station(){

        char c;
        do {

            //Scanner declaration
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any Zone 1 station name :");
            String stationName = scanner.nextLine();

            //for each loop
            for (String i : zone.keySet()) {

                //if condition
                if (stationName.equalsIgnoreCase(i)) {
                    System.out.println(zone.get(i) + "  line coming in this station");
                }
            }
            System.out.println("Would you like to search more station please enter \" Y \"or \" N\" :");
            String result = scanner.next();
            c = result.charAt(0);
        //    scanner.close();
        }while (c == 'y' || c == 'Y');

    }
    public static void main(String[] args) {
        //object create
        Programme_10_StationName programme10StationName = new Programme_10_StationName();
        programme10StationName.getZone();
        programme10StationName.station();
    }
}