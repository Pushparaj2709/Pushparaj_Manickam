import java.io.*;
import java.util.*;
public class LuckBalance {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests,int size) {
        int i,luck_balance=0,win=0;
        Arrays.sort(contests, new Comparator<int[]>() {              
          //Compare values according to columns 
          public int compare(int[] a,   int[] b) { 
            // To sort in descending order revert  
            // the '>' Operator 
            if (a[0] > b[0]) 
                return 1; 
            else
                return -1; 
          } 
        });//sorted successfully!!!
        for(i=size-1;i>=0;i--)
        {
            if(contests[i][1]==1)
            {
                win++;
            }
            if(win>k)
            {
                if(contests[i][1]==0)
                {
                    luck_balance = luck_balance + contests[i][0];
                }
                else
                {
                    luck_balance = luck_balance - contests[i][0];
                }
            }
            else
            {
                luck_balance = luck_balance + contests[i][0];
            }
        }
        return luck_balance;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
