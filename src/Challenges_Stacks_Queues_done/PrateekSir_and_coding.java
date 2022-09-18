package Challenges_Stacks_Queues_done;

import java.util.Scanner;
import java.util.Stack;

public class PrateekSir_and_coding {
    /*

Prateek sir loves coding. Hence, he took up position of an instructor and founded Coding Blocks, a startup that serves students with awesome code modules.
It is a very famous place and students are always queuing up to have one of those modules.
Each module has a cost associated with it. The modules are kept as a pile.
The job of an instructor is very difficult. He needs to handle two types of queries:

1) Student Query: When a student demands a module, the code module on the top of the pile is given and the student is charged according to the cost of the module.
This reduces the height of the pile by 1. In case the pile is empty, the student goes away empty-handed.

2) Instructor Query: Sir prepares a code module and adds it on top of the pile.
And reports the cost of the module. Help him manage this process.
*/

    public static void main(String[] args) {
        prateekSirCoding();

        //7
        //2 73
        //2 83
        //2 43
        //1
        //1
        //2 16
        //2 48
    }
    public static void prateekSirCoding() {

        Scanner scn = new Scanner(System.in);

        int q = scn.nextInt();
        Stack stack = new Stack<>();
        while (q-- > 0) {

            int type = scn.nextInt();

            if (type == 1) {

                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }else {
                    System.out.println("No Code");
                }

            } else {

                stack.push(scn.nextInt());
            }
        }

    }
}
