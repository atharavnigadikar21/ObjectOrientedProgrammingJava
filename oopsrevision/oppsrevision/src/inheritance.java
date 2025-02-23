class parent{
parent(){
    System.out.println("inside parentconstructor");
}
   protected void gun(){
        System.out.println("int parent gun method");
    }
}
class parent2 extends parent{
    parent2(){
        super();
        System.out.println("inside parent2 constructor");
    }
    void fun(){
        
        System.out.println("int parent2 fun method");
    }
}
class Child extends parent2{
    Child(){
        super();
        System.out.println("inside child constructor");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.gun();
    }
}
