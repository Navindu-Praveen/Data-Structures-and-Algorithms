public class QueueX {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queArray;
    private int nItems;

    public QueueX(int s){
        front=0;
        rear=-1;
        maxSize=s;
        queArray=new int[maxSize];
        nItems=0;
    }
    //inserting only consider about rear
    public void insert(int j){
        //check queue is full or not
        if (rear==maxSize-1) {
            System.out.println("Queue is full");
        }else{
            rear ++;
            queArray[rear]=j;
            //increse the n items 
            nItems ++;
        }
                    }
     //removeing only consider about front
     public int remove(){
        if(nItems==0){
            return -99;
        } else{
            nItems --;
            int x = queArray[front];
            front ++;
            return x;
        }
     }
     //peek value
     public int peek(){
        if (nItems==0) {
            return -99;
        }else{
            return queArray[front];
        }
     }
     public boolean isEmpty(){
        return (nItems==0);
     }
     public boolean isFull(){
        return (rear==maxSize-1);
     }
    }   

