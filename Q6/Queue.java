package Q6;

public class Queue {
    int maxSize;
    int rear;
    int front;
    int count;
    int[] queueArray;

    Queue(int size){
        maxSize=size;
        count=0;
        rear=-1;
        front=0;
        queueArray = new int[maxSize];
    }

    boolean IsQueueEmpty(){
        return (rear<front);
    }

    boolean IsQueueFull(){
        return (rear==maxSize-1);
    }

    void Append(int x){
        if(IsQueueFull()){
            System.out.println("Queue is full");
        }
        else{
            queueArray[++rear]=x;
            count++;
        }
    }

    int Serve(){
        if(IsQueueEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            int element = queueArray[front++];
            count--;
            return element;
        }
    }
}
