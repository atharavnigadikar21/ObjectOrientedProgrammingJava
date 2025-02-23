
public class p1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
       
        try{
            int  c = a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
            System.out.println("This is finally block");
        }
    }
}
