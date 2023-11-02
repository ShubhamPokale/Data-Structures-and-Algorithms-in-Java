import java.util.Scanner;

public class LL {
    Node head;
    int size;
    // Default constructor of LL


    public LL()
        {
            head = null;
           this.size = 0;
        }

    public class Node{

        String data;
        Node next;

        public Node()
        {
            data = "Ram";
            next = null;
            size++;
        }

        public Node(String data)
            {
                this.data = data;
                next = null;
                size++;
            }


    }


    public void add_first(String data)
        {   Node new_node = new Node(data);
            if(head == null)
                {           // I'll check if head exists or not ? , if head is null i.e if there is no element is the linkedlist yet, I'll simply make my new_node as the head and return
                    head = new_node;
                    return;
                }

            new_node.next = head;
            head = new_node;
            return;


        }
    public void add_last(String data)
        {   Node new_node = new Node(data);
            if(head ==null)
                {
                    head = new_node;
                    return;
                }

            Node curr_node = head;
            while (curr_node.next != null)
                {
                    curr_node = curr_node.next; // traversing the Linked list untill the next is pointing to null, i.e to the last element

                }
            curr_node.next = new_node;

        }

        public void print_linkedlist()
        {

                if(head == null)
                    {
                        System.out.println("The Linked list is empty ");
                        return;
                    }
                Node curr_node = head;
                while(curr_node !=null)
                    {
                        System.out.print(curr_node.data + " -> " );
                        curr_node = curr_node.next;
                    }
            System.out.print(" null");
            System.out.println("\n");
            }

        public void delete_first()
                {   size--;
                    if(head == null)
                        {
                            System.out.println("The list is empty");
                            return;
                        }
                    head = head.next;
                    return;
                }

        public void delete_last()
                {
                    // corner case // my list is empty
                    if(head == null)
                         {
                             System.out.println("The list is empty ");
                             return;
                         }
                    // List is empty toh vihsay nahi hai size ka ...
                    size--;
                    if(head.next == null)
                        {
                            head = null;
                            return;
                        }
                    Node SecondLast = head;
                    Node Last = head.next;

                    while(Last.next !=null)
                        {
                            //1
                            Last = Last.next;
                            //2
                            SecondLast = SecondLast.next;

                        }

                    SecondLast.next = null;

                }

        public int sizeOfList()
            {
                return size;
            }


        public LL reverse_linkedlist_ver01()
            {
                LL list2 = new LL();
                if(head == null)
                    {
                        System.out.println("List is empty ");
                        return list2 ;
                    }
               Node curr_node = head;
                //LL list2 = new LL();
                while(curr_node.next != null)
                    {   list2.add_first(curr_node.data);
                        curr_node = curr_node.next;
                    }


                return list2;

            }

    public static int searchingINLinkedilist(Node head, String key)
    {   int pos =1 ;
        Node curr = head;
        while(curr != null)
        {
            if(curr.data.equalsIgnoreCase(key))
            {
                return pos;
            }
            else
            {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    static int count = 0;
    // recursive traversal
    public void recursive_traversal(Node head)
    {       count++;
        if(head == null)
        {
            return;
        }

        System.out.println(head.data + " ");
        recursive_traversal(head.next);
        count--;

    }


    public String delete_at_pos(int pos)
        {   String d = "supp";
            if(head == null) // corner case 1
                {
                    System.out.println("The list is empty");
                    return d;
                }
            if(head.next ==null)
                {
                    head = null;

                }
            Node iter;
            iter = head;
            int i = 1 ;

            //for()
            while(i < pos -1 )
                {
                    iter = iter.next;
                    i++;

                }

            Node deletable ;
            deletable = iter.next;

            iter.next = deletable.next; // ispect
            //OR
           // iter.next = iter.next.next;

            d= deletable.data;
            deletable = null;
            return d;

        }
    // insert at position
    // sorted insert
    // middle of linked list
    // Nth node
    // reverse of linkedlist iteratively
    // reverse of linkedlist recursively
    // remove duplicates


    public static void main(String[] args) {

    // Linked List Menu Driven

        System.out.println("Linked List Operations Menu ");
        System.out.println("_____________________________________________________________ ");
        System.out.println("1.add first ");
        System.out.println("2.add last ");
        System.out.println("3.delete first ");
        System.out.println("4.delete last ");
        System.out.println("5.size of linked list");
        System.out.println("6.print linked list  ");
        System.out.println("7.Search the linked list : ");
        System.out.println("8.Recursive traversal ");
        System.out.println("9. Delete an item from position ");

        LL list1 = new LL();


        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a choice or press 0 to exit.");
            int ch = sc.nextInt();
            if (ch == 0) {
                System.out.println("Exiting ...");
                break;
            }
            if(ch == 1)
                {Scanner sc1 = new Scanner(System.in);
                    String d = sc1.nextLine();

                    list1.add_first(d);
                    System.out.println("Element added in the Linked list ");
                }
            if(ch==2)
                {Scanner sc1 = new Scanner(System.in);
                    String d = sc1.nextLine();

                    list1.add_last(d);
                    System.out.println("Element added in the Linked list ");
                }
            if(ch==3)
            {
//                String d = sc.nextLine();

                list1.delete_first();
                System.out.println("Delete first executed  ");
            }
            if(ch==4)
            {

                list1.delete_last();
                System.out.println("Delete last executed  ");
            }
            if(ch==5)
            {

                System.out.println("The size of the linked list  :   " + list1.sizeOfList());
            }
            if(ch==6)
            {
                System.out.println("Printing the linked list : ");

                list1.print_linkedlist();
            }
            if(ch==7)
            {   Scanner sc1 = new Scanner(System.in);
                System.out.println("What do you want to search : ?  ");
                String key = sc1.nextLine();

                System.out.println(key +" is present at position " + searchingINLinkedilist(list1.head, key) + " in the linked list");

                list1.print_linkedlist();
            }
            if(ch ==8)
                {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Traversing recursiely ...");
                    list1.recursive_traversal(list1.head);

                }
            if(ch == 9)
                {
                    System.out.println("Enter the position from which you want to delete :  ");
                    Scanner sc1 = new Scanner(System.in);
                    int pos = sc1.nextInt();
                    System.out.println(list1.delete_at_pos(pos));
                    System.out.println("Item deleted succesfully ");
                }

        }
    }




}
