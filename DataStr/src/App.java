
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        StackX myStackX1 = new StackX(5);
        // StackX myStackX2 = new StackX(10);
        
        myStackX1.push(5.2);
        myStackX1.push(10);
        myStackX1.push(20);
        myStackX1.push(30);
        myStackX1.pop();

       double x = myStackX1.peek();
       boolean y = myStackX1.isFull();
        
        System.out.println(x);
        System.out.println(y);

        //Link list
        Link L1 = new Link(20);
        Link L2 = new Link(30);
        Link L3 = new Link(50);

        //conect link list using next
        L1.next=L2;
        L2.next=L3;

    }
    
}
