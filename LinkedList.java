public class LinkedList {
    Node head;
    int size;

    public void append(int data){
        //Adds data to end of list
        if(head == null){
            head = new Node(data);
            size++;
            return;
        }

        Node current = head;
        
        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(data);
        size++;
    }

    public void prepend(int data){
        //Adds data to the start of the list
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void removeFirst(){
        //Remove first Node
        if(head == null){
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast(){
        //Remove last Node
        if(head == null){
            return;
        }
        
        Node current = head;

        if(current.next == null){
            head = null;
            size--;
            return;
        } 
        
        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;
        size--;
    }

    public void removeWithValue(int data){
        //Remove the node with the given data
        if(head == null){
            return;
        }

        if(head.data == data){
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        size--;
    }

    public boolean contains(int data){
        //Search the linked list if it contains the given data
        if(head == null){
            return false;
        }

        Node current = head;

        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int peek(){
        //Return the first element of the list
        if(head == null){
            return -1;
        }

        return head.data;
    }

    public int peekLast(){
        //Return the last element of the list
        if(head == null){
            return -1;
        }

        if(head.next == null){
            return head.data;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        return current.data;
    }

    public int poll(){
        //Removes and returns the first element
        if(head == null){
            return -1;
        }

        int retrieve = head.data;
        head = head.next;
        return retrieve;
    }

    public int pollLast(){
        //Removes and returns the last element
        if(head == null){
            return -1;
        }

        if(head.next == null){
            return head.data;
        }

        int retrieve;

        if(head.next.next == null){
            retrieve = head.next.data;
            head.next = null;
            return retrieve;
        }

        Node current = head;

        while(current.next.next != null){
            current = current.next;
        }

        retrieve = current.next.data;
        current.next = null;
        return retrieve;
    }

    public int size(){
        return size;
    }
    
    public void clear(){
        if(head == null){
            return;
        }

        size = 0;
        head = null;
    }

    public String toString(){
        String str = "";
        Node current = head;

        if(head == null){
            return "Empty";
        }

        while (current != null){
            str += current.data + " -> ";
            current = current.next;
        }

        return str + "END";
    }
}
