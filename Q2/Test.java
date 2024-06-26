package Q2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue(2);
        System.out.print("string 1: ");
        String string1 = input.nextLine();
        queue.Append(string1);
        System.out.print("string 2: ");
        String string2 = input.nextLine();
        queue.Append(string2);

        String newstring ="";
        while (!queue.IsQueueEmpty()){
            newstring+=queue.Serve();
        }

        System.out.println("Output: "+newstring);





    }
}
