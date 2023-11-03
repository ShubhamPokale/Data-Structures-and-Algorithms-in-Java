// Designing a node to hold data of int type with getters and setters
public class intNode {

    private int data;
    private intNode next;
    int size = 0;   // to maintain in the node count
    //default constructor
    public intNode()
    {
        data = 0;
        next = null;
        size++;
    }
    // parameterized constructor
    public intNode(int data)
    {
        this.data = data;
        next = null;
        size++;
    }

    // setter
    public void setNext(intNode next)
        {
            this.next = next;
        }

    public void setData(int data)
        {
            this.data = data;
        }


    //getter
    public int getData()
        {
            return this.data;
        }
    public intNode getNext()
        {
            return this.next;
        }




}
