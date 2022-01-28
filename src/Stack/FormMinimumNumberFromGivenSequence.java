package Stack;

import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNumberFromGivenSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        for(String s2: s1)
        {
            formMinimunNumber(s2);
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
