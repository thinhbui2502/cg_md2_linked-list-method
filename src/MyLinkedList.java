public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    public void add (int index, E element) {
        Node temp = this.head;
        Node holder;
        for (int i=0; i<index -1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        holder = temp.getNext();
        temp.setNext((new Node(element)));
        temp.getNext().setNext(holder);
        this.numNodes++;
    }

    public void addFirst(E e) {
        Node temp = this.head;
        this.head = new Node(e);
        this.head.setNext(temp);
        this.numNodes++;
    }

    public void addLast(E e) {
        Node temp = this.head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        this.head = new Node(temp);
        this.head.setNext(null);
        this.numNodes++;
    }

    public E remove(int index) {
        this.head = this.head.getNext();
        this.numNodes--;
        return (E) this.head;
    }

    public boolean remove(Object e) {
        Node temp = this.head;
        while (temp != null) {
            if (e.equals(temp.getData())) {
                this.numNodes--;
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int size() {
        return this.numNodes;
    }

    public Object clone() {
        MyLinkedList<E> myLinkedList = new MyLinkedList<E>(this.head.getData());
        myLinkedList.numNodes = this.numNodes;
        myLinkedList.head = this.head;
        return  myLinkedList;
    }

    public boolean contains(E o) {
        Node temp = this.head;
        while (temp != null) {
            if (o.equals(temp.getData())) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(E o) {
        int index = -1;
        Node temp = this.head;
        for (int i = 0; i < numNodes - 1; i++) {
            if (o.equals(temp.getData())) {
                index = i;
            }
            temp = temp.getNext();
        }
        return index;
    }

    public boolean add(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(new Node(e));
        numNodes++;
        return true;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.getNext() != null; i++) {
            temp = temp.getNext();
        }
        E element = (E) temp.getData();
        return element;
    }

    public E getFirst() {
        Node temp = head;
        E element = (E) temp.getData();
        return element;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.getNext();
        }
        E element = (E) temp.getData();
        return element;
    }

    public void clear() {
        this.head = null;
        this.numNodes = 0;
    }
}
