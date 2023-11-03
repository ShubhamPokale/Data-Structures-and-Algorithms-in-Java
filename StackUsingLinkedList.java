public class StackUsingLinkedList {

    private intNode head  ;
    int size;

    // default constructor
    public StackUsingLinkedList()
        {
            head = null;
            size ++;
        }

    // stack operations

    public void push(int data)  // Insert_first
        {
            intNode new_node = new intNode(data);
            if(head == null)
                {
                    head = new_node;
                    return;
                }
            new_node.setNext(head);
          //  new_node.setData(data); No need to set data, data is set while creating the intNode object itself with parameterized constructor
            head = new_node;
            return;
        }

    public int pop()
        {   int d;
               if(head == null)
                {
                    System.out.println("Empty stack, Stack Underflow");
                    return Integer.MAX_VALUE;
                }
               d = head.getData();
               head= head.getNext(); //moving my head reference variable forward
               return d ;

        }
    public int peek()
        {   int d;
            if(head == null)
                {
                    System.out.println("Empty stack");
                    return Integer.MAX_VALUE;
                }
            d = head.getData();
            return d;
        }

    public boolean isEmpty()
        {
            return head == null;
        }

    public void display()
        {       String str = "";
            if(head == null)
                {
                    System.out.print("The Stack is empty ! ");
                    return;
                }
            intNode temp = head;
            while(temp != null)
                {
                    System.out.print(str + " " + temp.getData() + "->");
                    temp = temp.getNext();

                }
            System.out.println("null");
        }
}
