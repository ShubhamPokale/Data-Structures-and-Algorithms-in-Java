// A ndoe design to hold data of string type with getter and setter
public class StringNode {

    private String data;
    private StringNode next;

    public StringNode()
        {
            data = "null";
            next = null;
        }
    // parameterized constructor
    public StringNode(String data)
        {
            this.data = data;
            next = null ;
        }
    // getters
    public String getData()
        {
            return data;
        }
    public StringNode getNext()
        {
            return next;
        }
    //setters

    public void setNext(StringNode next )
        {
            this.next = next;
        }

    public void setData(String data)
        {
            this.data = data;
        }

}
