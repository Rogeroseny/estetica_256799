
package estetica;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Trabajo extends javax.swing.JFrame {

   int cita=0;
   int id=0;
    public Trabajo(int x, int y) {
        cita=x;
        id=y;
        initComponents();
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
        resultado=con.buscar("select * from citas where citas='"+cita +"'");
            try {
                         if(resultado.next()){
                             fechalbl.setText(resultado.getString("fecha"));
                             horalbl.setText(resultado.getString("hora"));
                         
                         }
                   }
                          catch (SQLException ex) {
               }
            resultado=con.buscar("select * from trabajos where trabajo='"+(serlist.getSelectedIndex()+1)+"'");
            try{
                if(resultado.next()){
                    preciolbl.setText(resultado.getString("costo"));
                }
                
            }catch(SQLException ex){
                
            }
            
            
            resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'");
            ResultSet res;
            trabtxt.setText("");
            try{
                
                resultado.last();
                int total=0,row=resultado.getRow();
                
                
                for(int c=1;c<=row;c++){
                    
                    resultado.absolute(c);
                   
                    if(resultado.absolute(c)){
                    int t=resultado.getInt("trabajo");
                    
                     res=con.buscar("select * from trabajos where trabajo='"+t+"'");
                      
                     if(res.next()){
                          total=total+res.getInt("costo");
                          
                          String s=trabtxt.getText()+res.getString("descripcion")+"\n";
                          trabtxt.setText(s);
                         
                      }}
                    
                   resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'"); 
                }totallbl.setText("$"+total+".00");
                
                  
                
            }catch(SQLException ex){
                
            }
            catch(java.lang.NullPointerException ex){
                
            }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clientelbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechalbl = new javax.swing.JLabel();
        serlist = new javax.swing.JComboBox();
        preciolbl = new javax.swing.JLabel();
        agrbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        horalbl = new javax.swing.JLabel();
        trabtxt = new javax.swing.JTextArea();
        elimbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Trabajos");

        jLabel2.setText("Cliente Actual:");

        jLabel3.setText("Trabajo:");

        jLabel4.setText("Fecha:");

        serlist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Revision", "Limpieza", "Blanqueamiento", "Rellenado","Brackets","Endodoncia","Corona porcelana","Corona de oro","Poste" }));
        serlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serlistActionPerformed(evt);
            }
        });

        agrbtn.setText("Agregar");
        agrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agrbtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Total:");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Hora:");

        trabtxt.setColumns(20);
        trabtxt.setRows(5);

        elimbtn.setText("Eliminar");
        elimbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(horalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clientelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(serlist, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(preciolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(trabtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(agrbtn)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addComponent(elimbtn))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(preciolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(clientelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fechalbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horalbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(serlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trabtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totallbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(agrbtn)
                        .addGap(27, 27, 27)
                        .addComponent(elimbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Inicio inicio=new Inicio();
     inicio.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void serlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serlistActionPerformed
        conectar con= new conectar();
        ResultSet resultado;
        resultado=con.buscar("select * from trabajos where trabajo='"+(serlist.getSelectedIndex()+1)+"'");
            try{
                if(resultado.next()){
                    preciolbl.setText(resultado.getString("costo"));
                }
                
            }catch(SQLException ex){
                
            }
    }//GEN-LAST:event_serlistActionPerformed

    private void agrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agrbtnActionPerformed
       conectar con=new conectar();
       ResultSet resultado;
       con.agregar("insert into trabajos_s (id,cita,trabajo) values(null,'"+cita+"','"+(serlist.getSelectedIndex()+1)+"')");
       JOptionPane.showMessageDialog(rootPane, "el servicio se ha agregado");
       
       resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'");
            ResultSet res;
            trabtxt.setText("");
            try{
                
                resultado.last();
                int total=0,row=resultado.getRow();
                
                
                for(int c=1;c<=row;c++){
                    
                    resultado.absolute(c);
                   
                    if(resultado.absolute(c)){
                    int t=resultado.getInt("trabajo");
                    
                     res=con.buscar("select * from trabajos where trabajo='"+t+"'");
                      
                     if(res.next()){
                          total=total+res.getInt("costo");
                          
                          String s=trabtxt.getText()+res.getString("descripcion")+"\n";
                          trabtxt.setText(s);
                         
                      }}
                    
                   resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'"); 
                }totallbl.setText("$"+total+".00");
                
                  
                
            }catch(SQLException ex){
                
            }
            catch(java.lang.NullPointerException ex){
                
            }
    }//GEN-LAST:event_agrbtnActionPerformed

    private void elimbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimbtnActionPerformed
        int x=JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que quieres eliminar el servicio?");
        if(x==0){
        conectar con=new conectar();
        ResultSet resultado;
        resultado=con.buscar("select * from trabajos_s where cita='"+cita+"' and trabajo='"+(serlist.getSelectedIndex()+1)+"'");
       try{ if(resultado.next()){
        resultado.last();
        int e=resultado.getInt("id");
        con.eliminar("delete from trabajos_s where id='"+e+"'");
        JOptionPane.showMessageDialog(rootPane, "El servicio ha sido eliminado");
        
        resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'");
            ResultSet res;
            trabtxt.setText("");
            try{
                
                resultado.last();
                int total=0,row=resultado.getRow();
                
                
                for(int c=1;c<=row;c++){
                    
                    resultado.absolute(c);
                   
                    if(resultado.absolute(c)){
                    int t=resultado.getInt("trabajo");
                    
                     res=con.buscar("select * from trabajos where trabajo='"+t+"'");
                      
                     if(res.next()){
                          total=total+res.getInt("costo");
                          
                          String s=trabtxt.getText()+res.getString("descripcion")+"\n";
                          trabtxt.setText(s);
                         
                      }}
                    
                   resultado=con.buscar("select * from trabajos_s where cita='"+cita+"'"); 
                }totallbl.setText("$"+total+".00");
                
                  
                
            }catch(SQLException ex){
                
            }
            catch(java.lang.NullPointerException ex){
                
            }
        }else{
           JOptionPane.showMessageDialog(rootPane, "Ese servicio no esta agregado para ese cliente");
       }
       }
       catch(SQLException ex){
           
       } 
        
        
        }
    }//GEN-LAST:event_elimbtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                int cita=0,id=0;
                
                new Trabajo(cita,id).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrbtn;
    private javax.swing.JLabel clientelbl;
    private javax.swing.JButton elimbtn;
    private javax.swing.JLabel fechalbl;
    private javax.swing.JLabel horalbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel preciolbl;
    private javax.swing.JComboBox serlist;
    private javax.swing.JLabel totallbl;
    private javax.swing.JTextArea trabtxt;
    // End of variables declaration//GEN-END:variables
}
