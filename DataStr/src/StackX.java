class StackX{
    private int maxSize;
    private int top;
    private double[] stackArray;

    public StackX(int s){
        maxSize=s;
        top=-1;
        stackArray=new double[maxSize];
    }
    public void push(double j){
        //check whether stack is full
        if(top== maxSize-1){
            System.out.println("Stack is full");
        }
        else{
            stackArray[++top]=j;
        }
    }
    public  double pop(){
        //check whether stack is empty
        if(top==-1)
        {
            return -99;
            // System.out.println("Stack id empty");
        }
        else{
            return stackArray[top --];
            // double x = stackArray[top];
            // top --;
            // return x;
        }
    }
    public double peek(){
        //check stack is empty
        if(top==-1){
            return -99;
        }else{
            return stackArray[top];
        }
    }
    //isFull method
    public boolean isFull(){
        return(top==maxSize-1);
    }
    //isEmpty method
    public boolean isEmpty(){
        return(top==-1);
    }
    }