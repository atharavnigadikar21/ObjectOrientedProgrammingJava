package patterncodes.innercalsses;

public class anonimousinnerclass {
    
    void marrry(){
        System.out.println("disha patni");
    }

}

class client {
    public static void main(String[] args) {
        anonimousinnerclass obj = new anonimousinnerclass(){
            void marrry(){
                System.out.println("disha patni"); // Corrected spelling
            }
        };

        obj.marrry(); // Output: disha patni
    }
}   
