import java.io.*;
import java.util.*;
public class Anagram {
    

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int i,j,k,delete=0;
        int[] s1 = new int[26];
        for(i=0;i<a.length();i++)
        {
            char ch     = a.charAt(i);
            int casting = (int)ch;
            int position= casting - 97; // "a" value is 97
            s1[position]++;
        }
        int[] s2 = new int[26];
        for(j=0;j<b.length();j++)
        {
            char ch     = b.charAt(j);
            int casting = (int)ch;
            int position = casting - 97; // "a" value is 97
            s2[position]++;
        }
        for(k=0;k<=25;k++)
        {
               int sub = Math.abs(s1[k] - s2[k]); //sometimes will get -ve number using math.abs to get difference value then deleted value
                delete = delete+sub;
        }
        return delete;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
