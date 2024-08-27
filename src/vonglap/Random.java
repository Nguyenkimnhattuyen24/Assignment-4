
package vonglap;
 


public class Random {
    public static void main(String[] args) {
        //random
        Random rand = new Random();
        int r = rand.nextInt(3);
        if (r ==0 ){
            System.out.println("Rock");
        } else if (r==1) {
            System.out.println("Paper");
        }else {
            System.out.println("Scissors");
        }
    }

    private int nextInt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
