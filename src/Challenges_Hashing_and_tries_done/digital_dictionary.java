package Challenges_Hashing_and_tries_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class digital_dictionary {
    /*

Peter found a digital dictionary which is far better than normal dictionaries.
The digital dictionary has an input field in which one can search any string and the dictionary displays all the words whose prefix is that input string in lexicographical order.
Now you are given a task to make your own digital dictionary.
You will be given words that you can store in your database and then you need to design the search functionality.
And if no such words are available for a given search word, add this word to your dictionary.

Input Format:-
Single integer N which denotes the number of words which are to be stored in the database of the dictionary.
N lines of input, where in each line there is a string made up of lowercase/uppercase letter Single integer Q which denotes the number of queries.
Q number of lines describing the query string on each line given by user.
*/

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static class Node {
        Character data;
        boolean isTerminal;
        Node[] children;

        Node(Character data, boolean isTerminal) {
            this.data = data;
            this.isTerminal = isTerminal;
            this.children = new Node[26];
            for(int i=0;i<26;i++) {
                this.children[i]=null;
            }
        }
    }
    public static digital_dictionary p = new digital_dictionary();
    public Node root;
    public static PrintWriter pw = new PrintWriter(System.out);
    digital_dictionary() {
        this.root = new Node('\0', false);
    }

    public static void addword(Node root, String s) {
        if (s.length() == 0) {
            if(!root.isTerminal) {
                root.isTerminal = true;
            }
            return;
        }
        Node child;
        int idx = s.charAt(0) - 'a';
        if (root.children[idx] != null) {
            child = root.children[idx];
        } else {
            child = new Node(s.charAt(0), false);
            root.children[idx] = child;
        }

        addword(child, s.substring(1));

    }

    public static void searchWord(Node parent, String word, String original) {
        if (word.length() == 0) {
            if(parent.isTerminal) {
                pw.println(original);
                pw.flush();
            }
            numberOfString(parent, original);
            return;
        }
        Character ch = word.charAt(0);
        int idx = word.charAt(0) - 'a';
        String ros = word.substring(1);
        Node child = parent.children[idx];
        if (child == null) {
            System.out.println("No suggestions");
            addword(p.root, original);
            return;
        }
        searchWord(child, ros, original);
    }

    public static int numberOfString(Node parent, String str) {
        if (parent == null) {
            return 0;
        }
        int result = 0;
        for (int i=0;i<parent.children.length;i++) {
            if(parent.children[i]==null) {
                continue;
            }
            if (parent.children[i].isTerminal) {
                pw.println(str + parent.children[i].data);
                pw.flush();
                result++;
            }
            result += numberOfString(parent.children[i], str + parent.children[i].data);
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FastReader scn = new FastReader();
        int n = scn.nextInt();

        while (n-- > 0) {
            addword(p.root, scn.next());
        }
        int q = scn.nextInt();
        while (q-- > 0) {
            String s=scn.next();
            searchWord(p.root, s, s);
        }


        //4
        //pet
        //peter
        //rat
        //rack
        //5
        //pe
        //pet
        //r
        //rac
        //rat

        //Explanation
        //
        //For query 1 : Input = "pe"
        //We print "pet" and "peter".
        //For query 2 : Input = "pet"
        //We print "pet" and "peter".
        //For query 3 : Input = "r"
        //We print "rack" and "rat".
        //For query 4 : Input = "rac"
        //We print "rat.
        //For query 5 : Input = "rat"
        //We print "rat".

    }
}
