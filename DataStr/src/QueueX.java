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


    
}
