package Q4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String number = input.nextLine();

        char[] num = number.toCharArray();

        Queue queue = new Queue(num.length);
        int midpoint = num.length/2;
        for(int i=0;i<midpoint;i++){
            queue.Append(num[i]);
        }
        String newNum = "";
        for(int i=midpoint;i<num.length;i++){
            newNum+=num[i];
        }

        while (!queue.IsQueueEmpty()){
            newNum+=queue.Serve();
        }

        System.out.println("Output: "+newNum);
    }
}
