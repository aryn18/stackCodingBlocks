package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FriendAndGame {
    public static void main (String args[]) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0)
        {
            String s = sc.nextLine();
            String s1 = "";
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)%2==0)
                    s1+="I";
                else
                    s1+="D";
            }
            formMinimunNumber(s1);
        }

    }
    public static void formMinimunNumber(String s)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=s.length();i++)
        {
            stack.push(i+1);
            if(i==s.length()||s.charAt(i)=='I')
            {
                while(!stack.isEmpty())
                    System.out.print(stack.pop());
            }
        }
        System.out.println();
    }
}
