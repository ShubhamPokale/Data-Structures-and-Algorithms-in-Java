public class QueueUsingLinkedList {
    private intNode front;
    private intNode rear;

    private int size;
    //constructors
    public QueueUsingLinkedList()
        {
            front = rear = null;
            size = 0;
        }
    // getter
    public intNode getFront()
        {
            return front;
        }
    public intNode getRear()
        {
            return rear;
        }
    // setter
    public void setFront(intNode next_node)
        {
            this.front = next_node;
        }
    public void setRear(intNode new_node)
        {
            this.rear = new_node;
        }
    // enqueue
    // adding an item in the from the rear
    public void enqueue(int d)
        {   size++;
            intNode new_node = new intNode(d);
            if(front == null)
                {
                    front = new_node;
                    rear = new_node;
                    return;
                }
            rear.setNext(new_node);
            rear = new_node; // shiting rear reference
            return;
        }

    // dequeue
    public intNode dequeue()
        {   size--;
            if(front == null)
                {
                    System.out.println("The Queue is empty !");
                    return null;
                }
            front = front.getNext();
            if(front == null)   // last element
                 {
                     rear = null;
                 }
            return front;
        }
    //size of queue
    public int getSize()
        {
            return size;
        }
    // isEmpty
    public boolean isEmpty()
        {
//            if(front == null)
//                {
//                    System.out.println("The Queue is empty !");
//                    return true;
//                }
//            return false;
            return front == null;
        }


    public void displayQueue()  // display queue
        {
            if(isEmpty())
                {
                    System.out.println("The Queue is empty :) " );
                    return;

                }
            intNode iter;
            iter = front; // refernce variable iter
            // Treat iter as a refernce
            while(iter != null)
                {

                    System.out.print(iter.getData() + "->");
                        iter = iter.getNext();
                }
            System.out.println("null");


        }

}
