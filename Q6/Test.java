package Q6;

import com.sun.source.tree.WhileLoopTree;

public class Test {
    public static void main(String[] args){
        int[] num={10,20,30,40,50,60,70,80,90,100};

        Queue queue1 = new Queue(num.length);
        Queue queue2 = new Queue(num.length/2);
        Queue queue3 = new Queue(num.length);

        for (int x:num){
            queue1.Append(x);
        }

        for(int i=0;i<num.length/2;i++){
            int x = queue1.Serve();
            queue2.Append(x);
        }

        while (!queue1.IsQueueEmpty()&&!queue2.IsQueueEmpty()){
            int x = queue2.Serve();
            queue3.Append(x);
            int y = queue1.Serve();
            queue3.Append(y);
        }

        while (!queue3.IsQueueEmpty()){
            System.out.print(queue3.Serve()+" ");
        }
    }
}
