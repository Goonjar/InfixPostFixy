public class LStack extends LList
{
LList li = new LList();
 
public void clear()
{
    while(li.empty() == false)
    {
        li.deleteFirst();
    }
}
 
public void push(Object data)
 {
    li.insertFirst(data);
 }
 
public void pop() 
{
    li.deleteFirst();
}
 
public Node peek()
{   
    return li.displayFirst();
}
 
public boolean isEmpty()
{
    return li.empty();
}
 
public void displayStack() 
  {
    li.displayList();
  }
}

