package Q3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String line = input.nextLine();

        char[] letter=line.toCharArray();
        Queue queue1 = new Queue(letter.length);
        Queue queue2 = new Queue(letter.length);

        String word1 ="";
        String word2 ="";
        int i;
        for( i=0;i<letter.length;i++){
            if(letter[i]!=':'){
                queue1.Append(letter[i]);
            }
            else {
                break;
            }
        }
        //queue.Append(word1);
        i++;

        while (i<letter.length){
            queue2.Append(letter[i]);
            i++;
        }

        while (!queue1.IsQueueEmpty()){
            char x =queue1.Serve();
            word1+=x;
        }

        if(queue2.IsQueueEmpty()){
            System.out.println("N");
            System.exit(0);
        }
        else{
            while (!queue2.IsQueueEmpty()){
                char x =queue2.Serve();
                word2+=x;
            }
        }

        if(word1.length()>word2.length()){
            System.out.println("L");
        }
        else if(word1.length()<word2.length()){
            System.out.println("R");
        }
        else if(word1.equals(word2)){
            System.out.println("S");
        }
        else if(word1.length()==word2.length()){
            System.out.println("D");
        }
    }
}
