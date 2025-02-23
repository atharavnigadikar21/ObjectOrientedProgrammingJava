package patterncodes.innercalsses;

class outer {
    class innerclass {
        void fun() {
            System.out.println("in innerclass fun2");
        }
    }
    void fun1() {
        System.out.println("fun 1 outerclass");
    }

}
class client {
    public static void main(String[] args) {
        outer obj = new outer();
        obj.fun1();
        outer.innerclass obj1 = obj.new innerclass();

        outer.innerclass obj5 = new outer().new innerclass();
        System.out.println(obj5);
        obj1.fun();
    }
}






public class nouterclass {
    
}
