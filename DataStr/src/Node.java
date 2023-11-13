public class Node {
    public int iData; 
    public double dData; //other data
    public Node leftChild; //this nodes left child
    public Node rightChild; //this nodes right child

    public void displyNode(){
        System.out.println("{");
        System.out.println(iData);
        System.out.println(",");
        System.out.println(dData);
        System.out.println("}");
    }



    
}