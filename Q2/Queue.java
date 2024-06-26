package Q2;

public class Queue {
    int maxSize;
    int rear;
    int front;
    int count;
    String[] queueArray;

    Queue(int size){
        maxSize=size;
        rear = -1;
        front=0;
        count=0;
        queueArray = new String[maxSize];
    }

    public boolean IsQueueEmpty(){
        return (front>rear);
    }

    public boolean IsQueueFull(){
        return(rear==maxSize-1);
    }

    public void Append(String x){
        if(IsQueueFull()){
            System.out.println("Queue is full");
        }
        else{
            queueArray[++rear]=x;
            count++;
        }
    }

    public String  Serve(){
        if(IsQueueEmpty()){
            System.out.println("Queue is empty");
        }
        String element =  queueArray[front++];
        count--;
        return element;
    }
}
