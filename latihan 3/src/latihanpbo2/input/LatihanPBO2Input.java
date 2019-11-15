package latihanpbo2.input;

    import java.util.Scanner;
    
    /**
     * 
     * @author Agung Gumelar
     */
    
    public class LatihanPBO2Input {
        
        /**
         * @param args the command line arguments
         */
        
        public static void main(String[] args) {
           // TODO CODE APPLICATION LOGIC HERE
            
            System.out.print("Masukan nama anda: " );
            Scanner scanner = new Scanner (System.in);
            
            String nama = scanner.next();
            System.out.println("Nama anda adalah " +nama);
        }
        
    }

