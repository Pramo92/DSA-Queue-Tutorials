package Q1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        char[] letters = x.toCharArray();

        Queue queue = new Queue(x.length());
        for(int i =0;i<x.length();i++){
            queue.Append(letters[i]);
        }

        String rx = "";
        while (!queue.IsQueueEmpty()){
            char a = queue.Serve();
            rx+=a;
        }
        System.out.println(rx);
    }
}
