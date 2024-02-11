import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        // 1) Create and Array List  of integers
        ArrayList<Integer> list = new ArrayList<>();


        // 2) Add Elements 108,109,113
        list.add(108);
        list.add(109);
        list.add(113);


        // 3) Print the elements using a loop (Hint:foreach)
        System.out.println("Rooms in the KGTU:");
        for (int i : list
        ) {
            System.out.println(i);

        }

        // 4) Remove the room 113 from the ArrayList
        list.remove(list.indexOf(113));

        // 5)Check for Element Existence 108. Define an searchNumber variable and search it in ArrayList
        int searchNumber = 108;


        if (searchNumber == Integer.valueOf(108)) {
            System.out.println("\nThe rooms contains " + searchNumber);
        } else {
            System.out.println("\nThe romms does not contain " + searchNumber);
        }

        // 6)Print the updated elements .It is the same with Step (3)
        System.out.println("\nUpdated Rooms in the KGTU:");
        for (int i : list
        ) {
            System.out.println(i);

        }
    }
}