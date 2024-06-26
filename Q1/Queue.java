package Q1;

public class Queue {
    int maxSize;
    int rear;
    int front;
    int count;
    char[] queueArray;

    Queue(int size){
        maxSize=size;
        rear = -1;
        front=0;
        count=0;
        queueArray = new char[maxSize];
    }

    public boolean IsQueueEmpty(){
        return (front>rear);
    }

    public boolean IsQueueFull(){
        return(rear==maxSize-1);
    }

    public void Append(char x){
        if(IsQueueFull()){
            System.out.println("Queue is full");
        }
        else{
            queueArray[++rear]=x;
            count++;
        }
    }

    public char Serve(){
        if(IsQueueEmpty()){
            System.out.println("Queue is empty");
        }
        char element =  queueArray[front++];
        count--;
        return element;
    }
}
