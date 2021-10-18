package puskesmas;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Regist rg = new Regist();
       rg.setVisible (true);
       rg.pack();
       rg.setLocationRelativeTo(null);
       rg.setDefaultCloseOperation(Regist.EXIT_ON_CLOSE);
       
    }
    
}
