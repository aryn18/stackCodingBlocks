package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FindTheGreaterElement {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = nextGreaterCircular(a);
        for(int i: b)
        {
            System.out.print(i+" ");
        }
    }
    public static int[] nextGreaterCircular(int[] a)
    {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[a.length];
        Arrays.fill(ans,Integer.MIN_VALUE);
        int j=0;
        for(int i=0;i<2*a.length;i++)
        {
            if(j==a.length)
                j=0;
            while(!s.isEmpty() && a[s.peek()]<a[j])
            {
                int d = s.pop();
                ans[d] = a[j];
            }
            if(ans[j]==Integer.MIN_VALUE)
                s.push(j);
            j=j+1;
        }
        while(!s.isEmpty())
        {
            int d = s.pop();
            ans[d] = -1;
        }
        return  ans;
    }
}
