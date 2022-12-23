public class Main {
    public static void main(String[] args) {
        ModArrayList listed= new ModArrayList();
        listed.add(2);
        listed.add(6);
        listed.add(10);
        listed.add(90);
        System.out.println(listed.getValidIndex(10));
        System.out.println(listed.getValidIndex(15));
        System.out.println(listed.getValidIndex(19));
        System.out.println(listed.getValidIndex(1));

    }
}