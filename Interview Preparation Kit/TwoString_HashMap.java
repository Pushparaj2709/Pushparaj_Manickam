
import java.io.*;
import java.util.*;
import java.util.HashSet;
public class TwoString_HashMap {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashSet<Character> FirstHash = new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            FirstHash.add(s1.charAt(i));
        }
        HashSet<Character> SecondHash = new HashSet<>();
        for(int i=0;i<s2.length();i++)
        {
            SecondHash.add(s2.charAt(i));
        }
        FirstHash.retainAll(SecondHash);    //copy the S1 character to S2 in specfic location and also another else is removed
        if(!FirstHash.isEmpty())
        {
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
