package Activities;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class  Activity1 {

        // Initialize a new ArrayList
         static ArrayList<String> list;
        @BeforeAll
        public static void setup () {
            list = new ArrayList<String>();
            list.add("alpha"); // at index 0
            list.add("beta"); // at index 1
            System.out.println(list);
        }
        // Test method to test the insert operation
        @Test
        @Order(1)
        public void insertTest () {
            // Assertion for size
            assertEquals(2, list.size(), "Wrong size");
            // Add new element
            list.add(2, "charlie");
            // Assert with new elements
            assertEquals(3, list.size(), "Wrong size");
            System.out.println(list);

            // Assert individual elements
            assertEquals("alpha", list.get(0), "Wrong element");
            assertEquals("beta", list.get(1), "Wrong element");
            assertEquals("charlie", list.get(2), "Wrong element");
        }

        // Test method to test the replace operation

        @Test
        @Order(2)
        public void replaceTest () {
            // Replace new element
            list.set(1, "mony");
            System.out.println(list);

            // Assert size of list
            assertEquals(3, list.size(), "Wrong size");
            // Assert individual elements
            assertEquals("alpha", list.get(0), "Wrong element");
            assertEquals("mony", list.get(1), "Wrong element");
        }
    }

