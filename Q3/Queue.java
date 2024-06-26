package Q3;

public class Queue {
    int maxSize;
    int rear;
    int front;
    int count;
    char[] queueArray;

    Queue(int size){
        maxSize=size;
        count=0;
        rear=-1;
        front=0;
        queueArray = new char[maxSize];
    }

    boolean IsQueueEmpty(){
        return (rear<front);
    }

    boolean IsQueueFull(){
        return (rear==maxSize-1);
    }

    void Append(char x){
        if(IsQueueFull()){
            System.out.println("Queue is full");
        }
        else{
            queueArray[++rear]=x;
            count++;
        }
    }

    char Serve(){
        if(IsQueueEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        else{
            char element = queueArray[front++];
            count--;
            return element;
        }
    }
}
