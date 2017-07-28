/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shutdows_stas;

import java.awt.Color;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.prefs.Preferences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Stas
 */
public class Funkcje
{
    private boolean isPinged = false;
    private long currentTime;
    private OknoGlowne oknoGlowne;
    private final Color kolorCiemnoCzerwony;
    private final Color kolorJasnoCzerwony;
    private final Color kolorJasnoNiebieski;
    private final Color kolorCiemnoNiebieski;
    private Calendar calendar1;
    private int tab[];
    private String godz, min, sec, wynik, dni;
    private Preferences preferencjeUzytkownika;
    
    public Funkcje(OknoGlowne x)
    {
        oknoGlowne = x;
        kolorCiemnoNiebieski = new Color(0, 115, 255);
        kolorJasnoNiebieski = new Color(0, 153, 255);
        kolorJasnoCzerwony = new Color(255, 80, 80);
        kolorCiemnoCzerwony = new Color(255, 50, 50);
        tab = new int[5];
        preferencjeUzytkownika = Preferences.userNodeForPackage(Funkcje.class);
    }
    
//    pobiera preferowana minute
    public int getPrefMin()
    {
        try{
            return preferencjeUzytkownika.getInt("minuta", 0);
        }catch(Exception e){
            return 0;
        }
    }
    
//    pobiera preferowana godzine 
    public int getPrefGodz()
    {
        try{
            return preferencjeUzytkownika.getInt("godzina", 0);
        }catch(Exception e){
            return 0;
        }
    }
    
    public String[] getDaneLogowania()
    {
        String[] dane = new String[2];
        
        try{
            dane[0] = preferencjeUzytkownika.get("login", "");
            dane[1] = preferencjeUzytkownika.get("haslo", "");
            return dane;
        }catch(Exception e){
            dane[0] = "";
            dane[1] = "";
            return dane;
        }
    }
    
//    zmienia preferowana minute
    public void setPrefMin(int minuta)
    {
        try{
            preferencjeUzytkownika.putInt("minuta", minuta);
        }catch(Exception e){
            System.out.println("Problem w setPrefMin");
        }
    }
    
//    zmienia preferowana godzine
    public void setPrefGodz(int godzina)
    {
        try{
            preferencjeUzytkownika.putInt("godzina", godzina);
        }catch(Exception e){
            System.out.println("Problem w setPrefGodz");
        }
    }
    
    public void setDaneLogowania(String login, String haslo)
    {
        try{
            preferencjeUzytkownika.put("login", login);
            preferencjeUzytkownika.put("haslo", haslo);
        }catch(Exception e){
            System.out.println("Problem w setDaneLogowania");
        }
    }
    
    public int sprawdzPing() throws IOException
    {
        currentTime = System.currentTimeMillis();
        
            isPinged = InetAddress.getByName("google.com").isReachable(999);
            currentTime = System.currentTimeMillis() - currentTime;
            

            if(isPinged) {
                return (int) currentTime;
            } else {
                return 0; //na wykresie daje brak pingu
            }
            
            
        
    }
    
    /**
     * @param flaga  - jesli true to ustawia button uruchom na true 
     */
     public void zmienButton(boolean flaga)
    {
        if (flaga)
        {
            oknoGlowne.getPanelAplikacje().getButtonUruchom().setVisible(true);
            oknoGlowne.getPanelAplikacje().getButtonZatrzymaj().setVisible(false);
            oknoGlowne.getPanelPowiadomienie().getButtonUruchom().setVisible(true);
            oknoGlowne.getPanelPowiadomienie().getButtonZatrzymaj().setVisible(false);
            //oknoGlowne.getPanelPing().getButtonUruchom().setVisible(true);
            //oknoGlowne.getPanelPing().getButtonZatrzymaj().setVisible(false);
            oknoGlowne.getPanelWylacz().getButtonUruchom().setVisible(true);
            oknoGlowne.getPanelWylacz().getButtonZatrzymaj().setVisible(false);
            
            oknoGlowne.getjPanel1().setBackground(kolorJasnoNiebieski);
            oknoGlowne.getjMenuBar1().setBackground(kolorCiemnoNiebieski);
            //oknoGlowne.getPanelPing().getjPanel1().setBackground(kolorCiemnoNiebieski);
            oknoGlowne.getPanelWylacz().getjPanel1().setBackground(kolorCiemnoNiebieski);
            oknoGlowne.getPanelPowiadomienie().getjPanel1().setBackground(kolorCiemnoNiebieski);
            oknoGlowne.getPanelAplikacje().getjPanel1().setBackground(kolorCiemnoNiebieski);
            oknoGlowne.getPanelConnection().getPanel1().setBackground(kolorCiemnoNiebieski);
        }
        else
        {
            oknoGlowne.getPanelAplikacje().getButtonUruchom().setVisible(false);
            oknoGlowne.getPanelAplikacje().getButtonZatrzymaj().setVisible(true);
            oknoGlowne.getPanelPowiadomienie().getButtonUruchom().setVisible(false);
            oknoGlowne.getPanelPowiadomienie().getButtonZatrzymaj().setVisible(true);
            //oknoGlowne.getPanelPing().getButtonUruchom().setVisible(false);
            //oknoGlowne.getPanelPing().getButtonZatrzymaj().setVisible(true);
            oknoGlowne.getPanelWylacz().getButtonUruchom().setVisible(false);
            oknoGlowne.getPanelWylacz().getButtonZatrzymaj().setVisible(true);
            
            oknoGlowne.getjPanel1().setBackground(kolorJasnoCzerwony);
            oknoGlowne.getjMenuBar1().setBackground(kolorCiemnoCzerwony);
            //oknoGlowne.getPanelPing().getjPanel1().setBackground(kolorCiemnoCzerwony);
            oknoGlowne.getPanelWylacz().getjPanel1().setBackground(kolorCiemnoCzerwony);
            oknoGlowne.getPanelPowiadomienie().getjPanel1().setBackground(kolorCiemnoCzerwony);
            oknoGlowne.getPanelAplikacje().getjPanel1().setBackground(kolorCiemnoCzerwony);
            oknoGlowne.getPanelConnection().getPanel1().setBackground(kolorCiemnoCzerwony);
        }
    }
     
     /**
     * @param funkcja - przyjmuje cala komende do konsoli
     * @param opoznienie - przyjmuje opoznienie w sec, jesli -1 to zamienia na "" a jesli < -1 to wypisuje ze podano ujemny czas
     */
     public boolean wylaczKomputer(String funkcja, int opoznienie)
    {
        String czas1;
        
        if (opoznienie == -1) czas1 = "";
        else if (opoznienie < -1) 
        {
            javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Podano ujemny czas lub cos poszlo nie tak.");
            return false;
        }
        else 
            czas1 = Integer.toString(opoznienie);
        
        try
            {
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec(funkcja + czas1);
                //System.out.println(czas1);
                return true;
            } catch (IOException ex)
            {
                javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Blad w ustawieniu harmonogramu\n wylaczaniu komputera:\n" + ex);
                return false;
            }
    }
     
     
     public int obliczCzas(Calendar data)
    {
        calendar1 = Calendar.getInstance();
        long sec1 = calendar1.getTimeInMillis() / 1000L;
        //calendar.clear();
        long sec2 = data.getTimeInMillis() / 1000L;
        
        int sec = (int) (sec2 - sec1);
        System.out.println(sec);// --------------> usunac
        
        if (sec < -1)
        {
            javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Podano ujemny czas.");
            return -2;
        }
        else
        {
            return sec;
        }
    }
     
     
     public String obliczPozostaly(int timeToLeft)
     {
        tab[0] = timeToLeft;
        tab[1] = tab[0]/3600;   //godziny
        tab[2] = (tab[0]%3600)/60;  //minuty
        tab[3] = (tab[0]%3600)%60;  //sekundy
        tab[4] = tab[0]/(3600*24);  //dni
        
        godz = tab[1]<10?"0":"";
        godz += String.valueOf(tab[1]);
        min = tab[2]<10?"0":"";
        min += String.valueOf(tab[2]);
        sec = tab[3]<10?"0":"";
        sec += String.valueOf(tab[3]);
        
        wynik = godz + ":" + min + ":"+sec; 
        
        if (tab[4]<1)
            {
                wynik = godz + ":" + min + ":"+sec; 
            }
            else
        {
            dni = String.valueOf(tab[4]);
            wynik = dni + " dni";
        }
        
        return wynik;
     }
     
     public ArrayList pokazProcesy()
    {
        ArrayList<String> proc = new ArrayList<>();
        String a[];
       
        try {
            String line;
            Process process = Runtime.getRuntime().exec (System.getenv("windir") +"\\system32\\"+"tasklist.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (line.matches(".+exe.+"))
                {
                    a = line.split("exe");
                    proc.add(a[0].toLowerCase() + "exe");
                }
            }
            input.close();
        } catch (IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Blad w szukaniu procesow:\n" + ex);
        }
        
        Collections.sort(proc, (obj1, obj2) -> {
            return  obj1.compareTo(obj2);
        
        });
    
        return proc;
    }
     
     
     public void uruchomProgram(String nazwa)
    {
        try {
            ProcessBuilder pr = new ProcessBuilder();
            pr.command(nazwa);   

            pr.start();
        }catch(IOException ex)
        {
            javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Blad w uruchamianiu programu:\n" + ex);
        }
    }
     
    public boolean rejestracja(String login, String password, int delay, String task)
    {
        boolean success = false;
        
        try 
        {
            // otwieranie polaczenia z baza
            URL url = new URL("https://stasio.000webhostapp.com/ShutdownRejestracja.php");
        
            URLConnection con = url.openConnection();

            // aktywowanie wyjscia
            con.setDoOutput(true);
            JSONObject jsonResponse;
            
            try (PrintStream ps = new PrintStream(con.getOutputStream()))
            {
                // wysylanie danych do bazy
                ps.print("login="+login);
                ps.print("&password="+password);
                ps.print("&delay="+delay);
                ps.print("&task="+task);
                
                // odbieranie ifnroacji ze strony 
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())))
                {
                    String jsonString = in.readLine();
                    jsonResponse = new JSONObject(jsonString);
                    
                }
            }
            
            success = jsonResponse.getBoolean("success");
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("B");
            
        } catch (IOException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Blad w adresie URL");
            
        } 
        catch (JSONException ex){
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Blad odczytu danych");
            
        }
        
        return success;
    
    }
    
    public Map<String, String> logowanie(String login, String password)
    {
        Map<String, String> odebraneDane = new HashMap<>();
        
        try {
            URL url = new URL("https://stasio.000webhostapp.com/ShutdownLogowanie.php");
        
            URLConnection con = url.openConnection();

            con.setDoOutput(true);
            try (PrintStream ps = new PrintStream(con.getOutputStream()))
            {
                
                ps.print("login="+login);
                ps.print("&password="+password);
                
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())))
                {
                    String jsonString = in.readLine();
                    JSONObject jsonResponse = new JSONObject(jsonString);
                    
                    odebraneDane.put("success", Boolean.toString(jsonResponse.getBoolean("success")));
                    odebraneDane.put("delay", jsonResponse.getInt("delay")+"");
                    odebraneDane.put("task", jsonResponse.getString("task"));
                    
                }
                
            }
        
        } catch (MalformedURLException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("B");
            
        } catch (IOException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Blad w adresie URL");
        } 
        catch (JSONException ex){
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Bled odczytu danych");
        } 
        
        return odebraneDane;
        
    }
    
    public boolean resetStanu(String login)
    {
        boolean success = false;
        
        try {
            URL url = new URL("https://stasio.000webhostapp.com/ShutdownMobile.php");
        
            URLConnection con = url.openConnection();

            con.setDoOutput(true);
            try (PrintStream ps = new PrintStream(con.getOutputStream()))
            {
                
                ps.print("login="+login);
                ps.print("&delay=0");
                
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream())))
                {
                    String jsonString = in.readLine();
                    JSONObject jsonResponse = new JSONObject(jsonString);
                    success = jsonResponse.getBoolean("success");
                    
                }
                
            }
        
        } catch (MalformedURLException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("B");
            
        } catch (IOException ex) {
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Blad w adresie URL");
        } 
        catch (JSONException ex){
            Logger.getLogger(Funkcje.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Bled odczytu danych");
        } 
        
        return success;
        
    }
}
