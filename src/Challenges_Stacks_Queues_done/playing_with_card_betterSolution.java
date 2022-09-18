package Challenges_Stacks_Queues_done;

import java.util.*;

public class playing_with_card_betterSolution {
    static final int MAX = 1299709; // 10^5 th prime number
    static boolean[] sieve = new boolean[MAX];
    static ArrayList<Integer> primes = new ArrayList<>();

    static void createSieve() {
        for (int i = 0; i < MAX; i++) {
            sieve[i] = true;
        }
        sieve[0] = sieve[1] = false;
        for (int i = 2; i < MAX; i++) {
            if (sieve[i]) {
                primes.add(i);
                for (int j = i * i; j < MAX && j >= 0; j += i) {
                    sieve[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        createSieve();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        Stack<Integer> s = new Stack<>();

        while (n-- > 0) {
            int d = sc.nextInt();
            s.push(d);
        }
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        Queue<Integer> qu = new LinkedList<>();

        for (int i = 1; i <= q; i++) {
            while (!s.empty()) {
                int x = s.peek();
                int y = primes.get(i - 1);
                if (x % y == 0) {
                    b.push(x);
                } else {
                    a.push(x);
                }
                s.pop();
            }
            while (!b.empty()) {
                int x = b.peek();
                qu.add(x);
                b.pop();
            }
            s = a;
            a = new Stack<>();
        }
        while (!qu.isEmpty()) {
            System.out.println(qu.poll());
        }
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }

        //5 1
        //3 4 7 6 5
    }
}
