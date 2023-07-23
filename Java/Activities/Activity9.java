package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        int i=0;
        myList.add("Sujata");
        myList.add("Prashant");
        myList.add("Shreyansh");
        myList.add("Siddhi");
        myList.add("Sachi");

        System.out.println("ArrayList before any operation is as below: ");
        do {
            System.out.println(myList.get(i));
            i++;
        }
        while(i<myList.size());
        System.out.println("3rd name in the ArrayList: "+myList.get(2));
        if(myList.contains("Sachi")){
            System.out.println("Sachi- name exists in the ArrayList");
        }
        else {
            System.out.println("Sachi- name is not in ArrayList");
        }
        System.out.println("Size of Array List: "+myList.size());
        //myList.remove("Sujata");
        myList.remove(3);
        System.out.println("Size of Array List after removing a name: "+myList.size());

        System.out.println("ArrayList after removing name: ");
        i=0;
        do {
            System.out.println(myList.get(i));
            i++;
        }
        while(i<myList.size());

    }


}
