class Main{
    public static void main(String[] args){
        //Linked lists can be good for insertion and deletion

        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println(list.pollLast());
        System.out.println(list);

    }
}