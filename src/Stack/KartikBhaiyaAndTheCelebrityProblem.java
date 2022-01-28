package Stack;

import java.util.Scanner;
import java.util.Stack;

public class KartikBhaiyaAndTheCelebrityProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int c =findCelebrity(n,arr);
        if(c!=-1){
            System.out.println(c);
        }
        else{
            System.out.println("No Celebrity");
        }
    }
    static boolean knows(int a, int b,int[][] arr)
    {
        boolean res = (arr[a][b] == 1) ?
                true :
                false;
        return res;
    }

    static int findCelebrity(int n,int[][] arr)
    {
        Stack<Integer> st = new Stack<>();
        int c;

        for (int i = 0; i < n; i++)
        {
            st.push(i);
        }

        while (st.size() > 1)
        {
            int a = st.pop();
            int b = st.pop();

            if (knows(a, b,arr))
            {
                st.push(b);
            }

            else
                st.push(a);
        }

        if(st.isEmpty())
            return -1;

        c = st.pop();

        for (int i = 0; i < n; i++)
        {
            if (i != c && (knows(c, i,arr) ||
                    !knows(i, c,arr)))
                return -1;
        }
        return c;
    }

}
