public class Main {
    public static void main(String[] args) {
        pract16 vector = new pract16();

        vector.add(10);
        vector.add(20);
        vector.add(30);

        vector.add(1, 15);
        vector.remove(2);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
    }
}