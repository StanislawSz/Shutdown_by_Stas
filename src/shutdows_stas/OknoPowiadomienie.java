/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shutdows_stas;

/**
 *
 * @author Stas
 */
public class OknoPowiadomienie extends javax.swing.JFrame
{

    /**
     * Creates new form OknoPowiadomienie
     */
    public OknoPowiadomienie()
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setKomunikat(String komunikat)
    {
        labelPowiadomienieKomunikat.setText(komunikat);
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

        labelTytulOkna = new javax.swing.JLabel();
        labelPowiadomienieKomunikat = new javax.swing.JLabel();
        buttonPowiadomienieOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Powiadomienie");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(400, 200));
        setMinimumSize(new java.awt.Dimension(400, 200));
        setResizable(false);

        labelTytulOkna.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        labelTytulOkna.setText("Powiadomienie");

        labelPowiadomienieKomunikat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPowiadomienieKomunikat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPowiadomienieKomunikat.setToolTipText("");
        labelPowiadomienieKomunikat.setMaximumSize(new java.awt.Dimension(376, 22));
        labelPowiadomienieKomunikat.setMinimumSize(new java.awt.Dimension(376, 22));
        labelPowiadomienieKomunikat.setPreferredSize(new java.awt.Dimension(376, 22));

        buttonPowiadomienieOK.setText("OK");
        buttonPowiadomienieOK.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonPowiadomienieOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonPowiadomienieOK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(labelTytulOkna, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPowiadomienieKomunikat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTytulOkna, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(labelPowiadomienieKomunikat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(buttonPowiadomienieOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPowiadomienieOKActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buttonPowiadomienieOKActionPerformed
    {//GEN-HEADEREND:event_buttonPowiadomienieOKActionPerformed
        dispose();
    }//GEN-LAST:event_buttonPowiadomienieOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(OknoPowiadomienie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(OknoPowiadomienie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(OknoPowiadomienie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(OknoPowiadomienie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new OknoPowiadomienie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPowiadomienieOK;
    private javax.swing.JLabel labelPowiadomienieKomunikat;
    private javax.swing.JLabel labelTytulOkna;
    // End of variables declaration//GEN-END:variables
}
