package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RedundanParentheses {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0)
        {
            String s = sc.nextLine();
            if(redudant(s))
                System.out.println("Duplicate");
            else
                System.out.println("Not Duplicates");
        }
    }
    public static boolean redudant(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c!=')')
            {
                st.push(c);
            }
            else{
                if(st.peek()=='(')
                    return true;
                else{
                    while(!st.isEmpty() && st.peek()!='(')
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
        }
        return false;
    }

}
