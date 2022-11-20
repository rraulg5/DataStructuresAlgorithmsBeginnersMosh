public class App {
    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.removeFirst();
        // list.print();
        list.removeLast();
        list.addFirst(50);
        // list.removeLast();

        list.print();
        System.out.println();
        System.out.println(list.contains(10));
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(100));

        // Array numbers = new Array(3);
        // numbers.insert(10);
        // numbers.insert(20);
        // numbers.insert(30);
        // numbers.insert(40);
        // numbers.insert(50);
        // numbers.insert(60);
        // numbers.insert(70);
        // numbers.print();
        // System.out.println("----------------");
        // numbers.removeAt(3);
        // numbers.print();
        // System.out.println(numbers.indexOf(20));
    }
}
