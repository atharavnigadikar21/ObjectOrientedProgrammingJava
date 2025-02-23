class Abc{
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        Abc obj1 = new Abc();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj1.a = 1000;
        obj1.b = 2000;

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        Abc obj2 = new Abc();
        System.out.println(obj2.b);
        System.out.println(obj2.a);
        int num = 5;
        Integer obj = num;  // Autoboxing: int to Integer
        System.out.println(obj);
        

    }
}