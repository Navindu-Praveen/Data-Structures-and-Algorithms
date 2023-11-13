class Tree
{
	private Node root;
	public Tree(){
	        root = null;
	}
	public void insert (int id, double dd){
	}
	public void delete (int id){
	}
	public Node find(int key){
      	      Node current = root;
      	      while (current.iData != key)
     	      {
             		if(key < current.iData)
		   current = current.leftChild;
                                else
	                   current = current.rightChild;
           		if (current == null)
		    return null;
     	      }
      	      return current;}
                public void insert ( int id , double dd){
                    Node newNode = new Node();
                    newNode.iData = id; 
                    newNode.dData = dd;
                    if (root == null) // no node in root
                              root = newNode;
                    else                   // root occupied
                        {
                                 Node current = root; //start at root
                                                 Node parent;
                                                 while (true)
                                        {	
             parent = current;

             if (id < current.iData) // go left
              {
             current = current.leftChild;
            if (current == null) {
            parent.leftChild = newNode;
             return;
           }
             }           
                                               else // go right
                                                               {	
                                                                    current = current.rightChild;
                                                                            if (current == null){
                                                                 parent.rightChild = newNode;
                                                                 return;
                                                                            }
                                                                }
                                                         }
                                                    }
                                               }
                        //Tree Class – Inorder Traversing Method 
                        private void inOrder(Node localRoot)
                                               {
                                                   if (localRoot != null)
                                                    {
                                                       inOrder(localRoot.leftChild);
                                                       localRoot.displayNode();
                                                       inOrder(localRoot.rightChild);
                                                   }
                                               }
    
                        //Preorder Traversing Method
                        private void preOrder(Node localRoot)
                        {
                            if (localRoot != null)
                            {
                                localRoot.displayNode();
                                preOrder(localRoot.leftChild);
                                preorder(localRoot.rightChild);
                            }
                        }
                        //Postorder Traversing Method 
                        private void postOrder(Node localRoot)
                        {
                            if (localRoot != null)
                            {
                                postOrder(localRoot.leftChild);
                                postOrder(localRoot.rightChild);
                                localRoot.displayNode();
                            }
                        }                    
	}
