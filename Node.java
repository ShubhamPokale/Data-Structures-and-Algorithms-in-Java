public class Node {

    int data ;
    Node next ;

    // Constructor
    Node()
    {
        data = 10 ;
        next = null;

    }
    //Parameterized constructor
    Node(int data)
    {
        this.data = data;
        next = null;
    }

    // setters
    public void setData(int data)
        {
            this.data= data;
        }
// Setting the refernce to the next node
    public void setNext(Node next)
        {
            this.next = next;
        }

    // getters

    public int getData( )
        {
            return this.data;
        }

    public Node getNext()
        {
            return this.next;
        }

    // methods

    public static void traversal(Node head)
    {   Node curr = head ;
            while(curr != null)

                {
                    System.out.println(curr.data + " ");
                    curr = curr.next ;
                }

    }
        // traversal but recursively

    public static void recursive_traversal(Node head)
        {
            if(head == null)
                {
                    return;
                }
            System.out.println(head.data + " ");
            recursive_traversal(head.next);
        }

    // searching in a linkedlist

    // insert at head
    // insert at tail
    // linkedlist manipulaitons


}
