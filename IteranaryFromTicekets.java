import java.util.*;

public class IteranaryFromTicekets {

    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();

        // key->key, value-tick.get(Key)
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }

        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangluru");
        tickets.put("Mumbai", "Dhelli");
        tickets.put("Goa", "Chennai");
        tickets.put("Dhelli", "Goa");
        String start = getStart(tickets);


        while(tickets.containsKey(start)){
            System.out.print  (start+"->");
            start = tickets.get(start);
        }
    }
}
