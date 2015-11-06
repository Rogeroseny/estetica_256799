/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estetica;

import java.sql.SQLException;
import java.sql.ResultSet;

public class Inicio extends javax.swing.JFrame {

    public int id;
    public int cita=0;
    public Inicio() {
        initComponents();
        if(id==0) {
                citasbtn.setEnabled(false);
                trabajosbtn.setEnabled(false);
            }else{
                citasbtn.setEnabled(true);
                trabajosbtn.setEnabled(true);
                clientelbl.setText("No se ha seleccionado clienta aun");
            }

   
            
    }
    public Inicio(int a) {
        id =a;   
        
        initComponents();
        if(id==0) {
                citasbtn.setEnabled(false);
                trabajosbtn.setEnabled(false);
            }else{
                citasbtn.setEnabled(true);
                trabajosbtn.setEnabled(false);
            }
 conectar con=new conectar();
 ResultSet resultado;
 resultado=con.buscar("select * from clientes where id='"+id +"'");
            try {
                         if(resultado.next()){
                             clientelbl.setText(resultado.getString("apaterno")+" "+resultado.getString("amaterno")+" "+resultado.getString("nombres"));
                             }
                   }
                          catch (SQLException ex) {
               }
   
    }
        public Inicio(int a,int b) {
        id =a;   
        cita=b;
        initComponents();
        if(cita==0) {
                citasbtn.setEnabled(false);
                trabajosbtn.setEnabled(false);
            }else{
                citasbtn.setEnabled(true);
                trabajosbtn.setEnabled(true);
            }
 conectar con=new conectar();
 ResultSet resultado;
 resultado=con.buscar("select * from clientes where id='"+id +"'");
            try {
                         if(resultado.next()){
                             clientelbl.setText(resultado.getString("apaterno")+" "+resultado.getString("amaterno")+" "+resultado.getString("nombres"));
                             }
                   }
                          catch (SQLException ex) {
               }
   
    }
 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientesbtn = new javax.swing.JButton();
        citasbtn = new javax.swing.JButton();
        trabajosbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clientelbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        clientesbtn.setText("Clientes");
        clientesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesbtnActionPerformed(evt);
            }
        });

        citasbtn.setText("Citas");
        citasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citasbtnActionPerformed(evt);
            }
        });

        trabajosbtn.setText("Trabajos");
        trabajosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajosbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente Actual:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(clientelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trabajosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(citasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clientelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(clientesbtn)
                .addGap(18, 18, 18)
                .addComponent(citasbtn)
                .addGap(18, 18, 18)
                .addComponent(trabajosbtn)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesbtnActionPerformed
        clientes cliente=new clientes();
        cliente.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_clientesbtnActionPerformed

    private void citasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citasbtnActionPerformed
     citas cita=new citas(id);
     cita.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_citasbtnActionPerformed

    private void trabajosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajosbtnActionPerformed
      
      Trabajo trabajos=new Trabajo(cita,id);
      trabajos.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_trabajosbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton citasbtn;
    private javax.swing.JLabel clientelbl;
    private javax.swing.JButton clientesbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton trabajosbtn;
    // End of variables declaration//GEN-END:variables
}
