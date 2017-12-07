
public class LList
{
 
protected Node first = null;
 
public void insertFirst(Object data)
{
    Node n = new Node(data);
    n.next = first;
    first = n;
}
 
public Node deleteFirst()
{
    Node temp = first;
    
    if( first != null)
    {
        first = first.next;
    }
    
    return temp;
}
 
public Node displayFirst()
{
	/*
    Node current = first;
    System.out.println(current.getData());
    while(current == null)
    {
        current = current.next;
    }
    //current.displayNode();
    return current;
    */
	return first;
}
 
public void displayList()
{
    Node current = first;
    while (current != null)
    {
        current.displayNode();
        current = current.next;
    }
}
 
public boolean empty()
{
    return (first == null);
}
 
 
    public class Node
    {
 
        public Object data;
        public Node next;
 
        public Node(Object data)
        {
            this.data = data;
        }
 
        public void displayNode()
        {
            System.out.print(data);
            System.out.print("  ");
        }
 
        public Object getData()
        {
            return data;
        }
 
        public void setData(Object dataValue)
        {
            data = dataValue;
        }
 
        public Node getNext()
        {
            return next;
        }
 
        public void setNext(Node nextValue)
        {
            next = nextValue;
        }
    }
}
 

