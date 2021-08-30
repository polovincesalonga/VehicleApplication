import javax.swing.JFrame;


public class MainProgram {

    public static void main(String[] args) 
    {
        VehicleGUI g = new VehicleGUI(); 
        
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        g.pack(); 
        g.setVisible(true);
    }
    
}
