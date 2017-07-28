/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shutdows_stas;

import java.util.Map;

/**
 *
 * @author Stas
 */
public class PanelConnection extends javax.swing.JPanel
{
    private final OknoGlowne oknoGlowne;
    private final Funkcje funkcje;
    private boolean isRunning;
    private javax.swing.Timer odliczanie;
    private javax.swing.Timer sprawdzanieBazyTimer;
    private String login="", haslo="";
    private Map<String, String> dane;

    /**
     * Creates new form PanelConnection
     */
    public PanelConnection(OknoGlowne oknoGlowne1)
    {
        
        initComponents();
        
        oknoGlowne = oknoGlowne1;
        funkcje = new Funkcje(oknoGlowne);
        
        logowanieLogin.setText(funkcje.getDaneLogowania()[0]);
        logowanieHaslo.setText(funkcje.getDaneLogowania()[1]);
        
        odliczanie = new javax.swing.Timer(1000, (e) ->
                {
                });
        
        sprawdzanieBazyTimer = new javax.swing.Timer(2000, (e) ->
                {
                });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        buttonPolacz = new javax.swing.JButton();
        buttonRozlacz = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        logowanieLogin = new javax.swing.JTextField();
        logowanieHaslo = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rejestracjaLogin = new javax.swing.JTextField();
        radioConnectionZaloguj = new javax.swing.JRadioButton();
        radioConnectionZarejestruj = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rejestracjaHaslo = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        rejestracjaHasloPotwiedz = new javax.swing.JPasswordField();

        jLabel1.setText("Logowanie");

        jLabel2.setText("Rejestracja");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setBackground(new java.awt.Color(0, 115, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 60));

        buttonPolacz.setText("Połącz");
        buttonPolacz.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPolaczActionPerformed(evt);
            }
        });

        buttonRozlacz.setText("Rozłącz");
        buttonRozlacz.setVisible(false);
        buttonRozlacz.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonRozlaczActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPolacz, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRozlacz, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPolacz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRozlacz, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Login:");

        jLabel4.setText("Hasło:");

        rejestracjaLogin.setEditable(false);
        rejestracjaLogin.setToolTipText("Login powinien zawierac od 4 do 16 znakow");

        buttonGroup1.add(radioConnectionZaloguj);
        radioConnectionZaloguj.setSelected(true);
        radioConnectionZaloguj.setText("Zaloguj");
        radioConnectionZaloguj.setToolTipText("Zaloguj na użytkownika");
        radioConnectionZaloguj.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioConnectionZalogujActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioConnectionZarejestruj);
        radioConnectionZarejestruj.setText("Zarejestruj");
        radioConnectionZarejestruj.setToolTipText("Utwórz nowego użytkownika");
        radioConnectionZarejestruj.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioConnectionZarejestrujActionPerformed(evt);
            }
        });

        jLabel5.setText("Login:");

        jLabel6.setText("Hasło:");

        rejestracjaHaslo.setEditable(false);
        rejestracjaHaslo.setToolTipText("Haslo powinno zawierac od 4 do 16 znakow");

        jLabel7.setText("Potwierdź hasło:");

        rejestracjaHasloPotwiedz.setEditable(false);
        rejestracjaHasloPotwiedz.setToolTipText("Haslo powinno zawierac od 4 do 16 znakow");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(logowanieHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logowanieLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioConnectionZaloguj)
                        .addGap(140, 140, 140)))
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rejestracjaLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(rejestracjaHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(rejestracjaHasloPotwiedz, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(radioConnectionZarejestruj)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jLabel2)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioConnectionZaloguj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logowanieLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logowanieHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioConnectionZarejestruj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rejestracjaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rejestracjaHaslo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rejestracjaHasloPotwiedz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioConnectionZalogujActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radioConnectionZalogujActionPerformed
    {//GEN-HEADEREND:event_radioConnectionZalogujActionPerformed
        buttonPolacz.setText("Połącz");
        rejestracjaLogin.setEditable(false);
        rejestracjaHaslo.setEditable(false);
        rejestracjaHasloPotwiedz.setEditable(false);
        logowanieLogin.setEditable(true);
        logowanieHaslo.setEditable(true);
        
    }//GEN-LAST:event_radioConnectionZalogujActionPerformed

    private void radioConnectionZarejestrujActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_radioConnectionZarejestrujActionPerformed
    {//GEN-HEADEREND:event_radioConnectionZarejestrujActionPerformed
        buttonPolacz.setText("Rejestruj");
        rejestracjaLogin.setEditable(true);
        rejestracjaHaslo.setEditable(true);
        rejestracjaHasloPotwiedz.setEditable(true);
        logowanieLogin.setEditable(false);
        logowanieHaslo.setEditable(false);
    }//GEN-LAST:event_radioConnectionZarejestrujActionPerformed

    private void buttonPolaczActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPolaczActionPerformed
    {//GEN-HEADEREND:event_buttonPolaczActionPerformed
        
        if (radioConnectionZarejestruj.isSelected())
        {
            String login = rejestracjaLogin.getText();
            String haslo = new String(rejestracjaHaslo.getPassword());
            String haslo2 = new String(rejestracjaHasloPotwiedz.getPassword());
            boolean success = false;
            
            if (haslo.equals(haslo2) && login.length() > 3 && haslo.length() > 3)
            {
                success = funkcje.rejestracja(login, haslo, 0, "shutdown -s -t ");

                if (success)
                {
                    javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Utworzono nowego uzytkownika.");

                }
                else
                {
                    javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Podany login jest już zajęty.", "Ostrzeżenie", javax.swing.JOptionPane.WARNING_MESSAGE);
                }
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Niepoprawnie wypelniony formularz rejestracji!", "Ostrzeżenie", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        }
        else if (radioConnectionZaloguj.isSelected())
        {

            login = logowanieLogin.getText();
            haslo = new String(logowanieHaslo.getPassword());
            
            dane = funkcje.logowanie(login, haslo);
            
            if (Boolean.valueOf(dane.get("success")))
            {
                buttonPolacz.setVisible(false);
                buttonRozlacz.setVisible(true);
                sprawdzanieBazy();
                oknoGlowne.setTabConnection(sprawdzanieBazyTimer.isRunning());
                javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Polaczono");
                
                //zapisywanie danych logowania
                funkcje.setDaneLogowania(login, haslo);
            }
            else
            {
                javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Nie moge polaczyc!", "Ostrzeżenie", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_buttonPolaczActionPerformed

    private void buttonRozlaczActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonRozlaczActionPerformed
    {//GEN-HEADEREND:event_buttonRozlaczActionPerformed
        if (odliczanie.isRunning())
        {
            zatrzymajDzialanie();
            
        }
        else if (buttonRozlacz.getText().equals("Rozłącz"))
        {
            sprawdzanieBazyTimer.stop();
            oknoGlowne.setTabConnection(sprawdzanieBazyTimer.isRunning());
            buttonRozlacz.setVisible(false);
            buttonPolacz.setVisible(true);
        }
        else
        {
            oknoGlowne.getPanelAplikacje().zatrzymajDzialanie();
            oknoGlowne.getPanelPowiadomienie().zatrzymajDzialanie();
            oknoGlowne.getPanelWylacz().zatrzymajDzialanie();
        }
    }//GEN-LAST:event_buttonRozlaczActionPerformed

    private void sprawdzanieBazy()
    {
        
        sprawdzanieBazyTimer = new javax.swing.Timer(5000, (event) ->
        {

            dane = funkcje.logowanie(login, haslo);
                
            boolean success = Boolean.valueOf(dane.get("success"));
            
            if (success)
            {
                int delay = Integer.valueOf(dane.get("delay"));
                String task = dane.get("task");
                
                if (delay > 0)
                {
                    if (funkcje.resetStanu(login))
                    {
                        odliczanie(delay, task);
                        sprawdzanieBazyTimer.stop();
                        oknoGlowne.setTabConnection(sprawdzanieBazyTimer.isRunning());
                    }
                    else
                    {
                        javax.swing.JOptionPane.showMessageDialog(oknoGlowne, "Nie zresetowanu czasu oczekiwania w bazie!!!!!", "Ostrzeżenie", javax.swing.JOptionPane.WARNING_MESSAGE);
                        sprawdzanieBazyTimer.stop();
                        oknoGlowne.setTabConnection(sprawdzanieBazyTimer.isRunning());
                    }
                }

            }
            else
            {
                dane.clear();
                dane = funkcje.logowanie(login, haslo);
            }
            
        });
        sprawdzanieBazyTimer.setInitialDelay(0);
        sprawdzanieBazyTimer.start();
    }
    
    private void odliczanie(int timeToLeft, String dzialanie)
    {
        
        isRunning = funkcje.wylaczKomputer(dzialanie, timeToLeft);
        
        if (isRunning)
        {
            final int tab[] = new int[1];
            tab[0] = timeToLeft;
            oknoGlowne.getCzas().stop();
            buttonRozlacz.setText("Zatrzymaj");
            funkcje.zmienButton(false);

            odliczanie = new javax.swing.Timer(1000, (event) ->
            {
                oknoGlowne.getLabelGodzina().setText(funkcje.obliczPozostaly(tab[0]));
                if (tab[0] == 0)
                {
                    odliczanie.stop();
                }
                else
                {
                    tab[0]-=1;
                }

            });
            odliczanie.setInitialDelay(0);
            odliczanie.start();
        }
        else
        {
            buttonRozlacz.setVisible(false);
            buttonPolacz.setVisible(true);
        }
    }
  
    public void zatrzymajDzialanie()
    {
        isRunning = !funkcje.wylaczKomputer("shutdown -a", -1);
        buttonRozlacz.setText("Rozłącz");
        buttonRozlacz.setVisible(false);
        buttonPolacz.setVisible(true);
        funkcje.zmienButton(true);
        odliczanie.stop();
        oknoGlowne.getCzas().start();
    }

    public javax.swing.JPanel getPanel1()
    {
        return jPanel1;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonPolacz;
    private javax.swing.JButton buttonRozlacz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField logowanieHaslo;
    private javax.swing.JTextField logowanieLogin;
    private javax.swing.JRadioButton radioConnectionZaloguj;
    private javax.swing.JRadioButton radioConnectionZarejestruj;
    private javax.swing.JPasswordField rejestracjaHaslo;
    private javax.swing.JPasswordField rejestracjaHasloPotwiedz;
    private javax.swing.JTextField rejestracjaLogin;
    // End of variables declaration//GEN-END:variables
}