package constructor;

public class Demo {

    int x = 10;
    static int y = 30;

    void fun(){
        System.out.println("inside fun method ");

    }

    static void fun2(){
        System.out.println("inside static fun 2");
    }
    
}

 class Test{
    public static void main(String[] args) {

        Demo obj = new Demo();
        System.out.println(obj.x);
       System.out.println( obj.y);

       //Demo.fun();
       //non static method cannot be acces by static referance
        
    }
}
