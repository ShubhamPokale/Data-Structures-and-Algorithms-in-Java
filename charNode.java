// designing a node to hold char data type with getter and setter
public class charNode {

    private char data;

    private charNode next; // Self- referentail structure

    // default constructor
    public charNode()
        {
            data = '0';
            next = null;
        }
        //parameterized consturctor
    public charNode(char data)
        {
            this.data = data;
            next = null;
        }

    // setter
    public void setNext(charNode next)
        {
           this.next = next;
        }

    public void setData(char data)
        {
            this.data = data;
        }

    // getter

    public char getData()
        {
            return data;
        }

    public charNode getNext()
        {
            return next;
        }
}
