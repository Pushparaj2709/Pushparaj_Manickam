

import java.util.*;
public class RansomNote_HashTable {

    // Complete the checkMagazine function below.
    static boolean checkMagazine(String[] magazine, String[] note) {
        boolean condition = true;
        Hashtable<String,Integer> mHash= new Hashtable<>();
        for(String mag : magazine)
        {
            if(mHash.containsKey(mag))
            {
                    mHash.put(mag, mHash.get(mag)+1); //for iteration looping!!!
            }
            else
            {
                    mHash.put(mag,1);             //for terminate
            }
        }
        Hashtable<String,Integer> nHash= new Hashtable<>();
        for(String notes : note)
        {
            if(nHash.containsKey(notes))
            {
                    nHash.put(notes, nHash.get(notes)+1); //for iteration looping!!!
            }
            else
            {
                    nHash.put(notes,1);             //for terminate
            }
        }
        for(String Match : nHash.keySet())
        {
            if(!mHash.containsKey(Match)||mHash.get(Match)<nHash.get(Match) )
            {
                condition = false;
                break;
            }
        }
        if(condition)
        {
                System.out.println("Yes");
        }
        else
        {
                System.out.println("No");
        }
        return condition;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
