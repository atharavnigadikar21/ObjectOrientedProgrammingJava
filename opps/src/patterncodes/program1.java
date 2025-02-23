package patterncodes;

public class program1 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

            for (int i = 1; i < 5; i++) {
                for (int j =5; j >=i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
