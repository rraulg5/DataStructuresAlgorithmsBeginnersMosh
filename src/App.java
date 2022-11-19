public class App {
    public static void main(String[] args) throws Exception {

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.print();
        System.out.println("----------------");
        numbers.removeAt(3);
        numbers.print();
        System.out.println("----------------");
        numbers.insert(50);
        numbers.insert(40);
        numbers.removeAt(3);
        numbers.insert(20);
        numbers.removeAt(1);
        numbers.print();
        System.out.println(numbers.indexOf(20));
    }
}
