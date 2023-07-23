package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("AA");
        hs.add("BB");
        hs.add("CC");
        hs.add("DD");
        hs.add("EE");
        hs.add("FF");
        System.out.println("HashSet before any operation: "+hs);
        System.out.println("Sie of hash set is: "+hs.size());
        System.out.println("remove 'CC' from hash set: "+hs.remove("CC"));
        System.out.println("Trying to Remove element not is hash set: "+hs.remove("ZZ"));
        System.out.println("Is 'AA' element available in set: "+hs.contains("AA"));
        System.out.println("HashSet after all operation: "+hs);

    }
}
