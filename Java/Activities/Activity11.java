package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer,String> colours = new HashMap();
        colours.put(1,"Red");
        colours.put(2,"Orange");
        colours.put(3,"Green");
        colours.put(4,"Blue");
        colours.put(5,"Yellow");

        System.out.println("HashMap before any operations: "+colours);
        System.out.println("Remove color: "+colours.remove(4));
        System.out.println("Is color 'Green' available in map: "+colours.containsValue("Green"));
        System.out.println("Size of map: "+colours.size());
        System.out.println("HashMap after operations: "+colours);


    }
}
