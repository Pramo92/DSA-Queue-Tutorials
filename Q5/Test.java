package Q5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] letter = line.toCharArray();
        Queue queue = new Queue(letter.length);
        for(char x:letter){
            if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
                queue.Append(x);
            }
        }

        while(!queue.IsQueueEmpty()){
            char y = queue.Serve();
            System.out.print(y+" ");
        }


    }
}
