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
                    
    }   
}
