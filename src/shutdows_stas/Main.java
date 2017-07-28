
package shutdows_stas;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Stanislaw Szwagrzyk
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               JFrame frame = new OknoGlowne();
               frame.setLocationRelativeTo(null);
               frame.setVisible(true);
               
                /*try
                {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                  SwingUtilities.updateComponentTreeUI(frame);
                } catch (ClassNotFoundException ex)
                {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex)
                {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex)
                {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex)
                {
                    Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
                }*/
               
            } 
         });
    }
    
}
