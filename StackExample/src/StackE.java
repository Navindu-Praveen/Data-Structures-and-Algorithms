import java.util.Stack;

public class StackE {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        Stack<String> NameOfBooks = new Stack<>();

        // to check this stack is empty
        // System.out.println(NameOfBooks.empty());

        //push books to stack
        NameOfBooks.push("1");
        NameOfBooks.push("2");
        NameOfBooks.push("3");
        NameOfBooks.push("4");

        //to view the name of books 
        System.out.println(NameOfBooks);
        System.out.println();
        //check peek
        NameOfBooks.peek();
        System.out.println(NameOfBooks.peek());
        System.out.println();
        //pop from stack
        NameOfBooks.pop();
        NameOfBooks.pop();

        //to view the name of books 
        System.out.println(NameOfBooks);
        System.out.println();
        System.out.println(NameOfBooks.peek());
        System.out.println();
    }
}