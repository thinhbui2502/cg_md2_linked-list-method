public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("Test is below: ");
        MyLinkedList<Integer> myList = new MyLinkedList<>(10);
        myList.add(1, 10);
        myList.add(2, 20);
        myList.add(3, 30);

        System.out.println(myList.size());
        System.out.println(myList.contains(30));
        System.out.println(myList.indexOf(10));
        System.out.println(myList.get(2));
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

    }
}
