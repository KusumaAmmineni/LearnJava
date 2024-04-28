import java.util.*;

public class PracticeCollection {
    public static void main(String[] args) {

        System.out.println("---------Arrays-----------");
        String[] guestArray = new String[5];
        guestArray[0] = "Derek";
        guestArray[1] = "Rome";
        guestArray[2] = "Harmoine";
        guestArray[3] = "Yarley";
        guestArray[4] = "Rome";

        for (String gueArry : guestArray) {
            System.out.println(gueArry);
        }

        System.out.println("-------------List--------------");
        List guestList = new ArrayList();
        guestList.add("Derek");
        guestList.add("Rome");
        guestList.add("Harmoine");
        guestList.add("Rome");

        for (Object list : guestList) {
            System.out.println(list);
        }

        System.out.println("--------Set---------------");
        Set guestSet = new HashSet();
        guestSet.add("Derek");
        guestSet.add("Rome");
        guestSet.add("Harmoine");
        guestSet.add("Harmoine"); //Not in sorted order
        //Skips the duplicate value

        for (Object set : guestSet) {
            System.out.println(set);
        }

        System.out.println("---------Map------------");
        Map guestMap = new HashMap();
        guestMap.put(1, "Derek");
        guestMap.put(2, "Rome");
        guestMap.put(3, "Harmoine");
        guestMap.put(2, "Jegur"); //overrides the existing value in duplicate key

        for (Object map : guestMap.keySet()) {
            System.out.println(guestMap.get(map));
        }

    }
}
