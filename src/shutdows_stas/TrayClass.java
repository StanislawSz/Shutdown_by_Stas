
package shutdows_stas;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Stas
 */
public class TrayClass
{
    static TrayIcon trayIcon;
    static private OknoGlowne okno;
    
    public TrayClass(OknoGlowne okno1)
    {
        okno = okno1;
        show();
    }
    
    public static void show()
    {
        if (!SystemTray.isSupported())
        {
            System.exit(0);
        }
        
        trayIcon = new TrayIcon(createIcon("zegar.png", "Icon"));
        trayIcon.setToolTip("Shutdown by Stas");
        trayIcon.setImageAutoSize(true);
        
        final SystemTray tray = SystemTray.getSystemTray();
        final PopupMenu menu = new PopupMenu();
        
        MenuItem about = new MenuItem("Pokaz");
        MenuItem exit = new MenuItem("Zamknij");
        
        menu.add(about);
        menu.addSeparator();
        menu.add(exit);
        
        trayIcon.setPopupMenu(menu);
        
        try{
            tray.add(trayIcon);
            
        }catch (AWTException ex){
            Logger.getLogger(TrayClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        about.addActionListener((ActionEvent e) ->
        {
            okno.setVisible(true);
            okno.setState(Frame.NORMAL);
        });
        
        exit.addActionListener((ActionEvent e) ->
        {
            tray.remove(trayIcon);
            System.exit(0);
        });
        
        trayIcon.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                okno.setVisible(true);
                okno.setState(Frame.NORMAL);
            }

            @Override
            public void mousePressed(MouseEvent e)
            {
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
            }
            
        });
        
    }
    
    protected static Image createIcon(String path, String desc)
    {
        URL imageURL = TrayClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
    }
}
