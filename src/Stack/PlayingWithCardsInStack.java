package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCardsInStack {
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    static Stack<Integer> a1 = new Stack<>();
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ithPrime(5679875);
        int[] arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = sc.nextInt();
            a1.push(arr[i]);
        }
        for(int i=0;i<q;i++){
            cards(a1,n,i);
        }
        while (!a1.empty()){
            System.out.println(a1.pop());
        }
    }

    public static void cards(Stack<Integer> stack, int n, int j){
        Stack<Integer> a2 = new Stack<>();
        Stack<Integer> b1 = new Stack<>();
        Stack<Integer> c1 = new Stack<>();
        int a = primes.get(j);
        while(!stack.empty()){
            int num = stack.pop();
            if(num%a==0){
                b1.push(num);
            } else{
                a2.push(num);
            }
        }
        while (!b1.empty()){
            System.out.println(b1.pop());
        }
        while (!a2.empty()){
            int z = a2.pop();
            c1.push(z);
            //System.out.println(z);
        }
        while(!c1.empty()){
            a1.push(c1.pop());
        }
    }

    public static void ithPrime(int q){
        boolean [] IsPrime = new boolean[q];

        for(int i = 0; i < q; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < q; p++)
        {
            if (IsPrime[p] == true)
            {
                for (int i = p * p; i < q; i += p)
                    IsPrime[i] = false;
            }
        }
        for (int p = 2; p < q; p++)
            if (IsPrime[p] == true)
                primes.add(p);
    }
}