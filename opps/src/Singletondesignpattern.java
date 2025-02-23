// here in single ton design pattern if u create 2 onject it shows one yes
// becaise the spactionaity of 
//singleton design patten is that the objext is created only one time 
public class Singletondesignpattern {

    static Singletondesignpattern obj = new Singletondesignpattern();

    Singletondesignpattern(){

        System.out.println("Inside Singletondesignpattern Constructor");
    }
    static Singletondesignpattern getobj(){
        return obj;
        }
    
}

class client{
    public static void main(String[] args) {
        Singletondesignpattern obj = Singletondesignpattern.getobj();
        System.out.println(obj);
        Singletondesignpattern obj2 = Singletondesignpattern.getobj();
        System.out.println(obj2);

        Singletondesignpattern obj4 = new Singletondesignpattern();
        System.out.println(obj4);

    }
}
