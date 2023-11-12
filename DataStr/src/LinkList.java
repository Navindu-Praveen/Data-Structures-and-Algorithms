public class LinkList {
    private Link first;

    public LinkList(){
        first=null;
    }
    //to check link list is epty or not
    public boolean isEmpty(){
        return(first==null);
    }
    public void displayList(){
        //current is a referance to the 1st link
        Link current = first;
        //current not equal to null till this loop works
        while (current != null) {
            //display current
            current.displayLink();
            //current goes to the next one 
            current = current.next;
        }
          }
            //insert first Link
            public void insertFirst(int id){
            Link nLink = new Link(id);
            nLink.next=first;
            first=nLink;
        }
            //delete first Link
            public Link deleteFirst(){
                Link temL = first;
                first = first.next;
                return temL;
            }
}