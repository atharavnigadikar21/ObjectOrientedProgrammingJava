 class vik{

    static vik obj = new vik();
private vik(){
        System.out.println("inside vik xoncengin");
}

static vik getInstace(){
    return obj;
}
}



public class demo {
    public static void main(String[] args) {
        vik obj = vik.getInstace();
        ;
            System.out.println(obj);
           
    }
}
