/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estetica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class citas extends javax.swing.JFrame {

    /**
     * Creates new form citas
     */
    int id;
    public citas(int a) {
        id=a;
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clientelbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechachooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        horalist = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        citaschooser = new com.toedter.calendar.JDateChooser();
        aceptbtn = new javax.swing.JButton();
        buscbtn = new javax.swing.JButton();
        cambbtn = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cancbtn = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cliente Actual:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Hora:");

        horalist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM","12:00 PM","1:00 PM","2:00 PM","3:00 PM","4:00 PM","5:00 PM","6:00 PM" }));

        jLabel4.setText("Revisar Citas Para:");

        aceptbtn.setText("Agregar");
        aceptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptbtnActionPerformed(evt);
            }
        });

        buscbtn.setText("Buscar");
        buscbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscbtnActionPerformed(evt);
            }
        });

        cambbtn.setText("Cambiar Cita");
        cambbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambbtnActionPerformed(evt);
            }
        });

        salir.setText("Atras");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel6.setText("Citas");

        cancbtn.setText("Cancelar");
        cancbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(aceptbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horalist, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(clientelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechachooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cambbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancbtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(citaschooser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(buscbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(fechachooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(horalist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptbtn)
                    .addComponent(cambbtn)
                    .addComponent(cancbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(citaschooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
   conectar con=new conectar();
    ResultSet resultado;
    int cita=0;
resultado=con.buscar("select citas from citas where id='"+id+"'");
        try{resultado.last();
        if(resultado.isLast()){
            cita=resultado.getInt("citas");
        }
            
        }catch(SQLException ex){
            
        }
        Inicio inicio=new Inicio(id,cita);
     inicio.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void aceptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptbtnActionPerformed
        if(fechachooser.getDate()!=null){
            conectar con=new conectar();
        Date fecha=fechachooser.getDate();
        int ihora=horalist.getSelectedIndex();
        String hora=" ",fe=con.fechas(fecha);
        
        switch(ihora){
           case 0:{hora="8:00";break;}
           case 1:{hora="9:00";break;}
           case 2:{hora="10:00";break;}
           case 3:{hora="11:00";break;}
           case 4:{hora="12:00";break;}
           case 5:{hora="1:00";break;}
           case 6:{hora="2:00";break;}
           case 7:{hora="3:00";break;}
           case 8:{hora="4:00";break;}
           case 9:{hora="5:00";break;}
           case 10:{hora="6:00";break;} }   
            
        if(con.diferenciasDeFechas(con.fecha(), fecha)>0){
            ResultSet resultado;
            resultado=con.buscar("select * from citas where fecha='"+con.fechas(fecha)+"' and hora='"+hora+"'");
            try{      
                
            if(resultado.next()){
                        JOptionPane.showMessageDialog(rootPane, "Esa hora ya esta ocupada");
                    }
            else{
                con.agregar("insert into citas (citas,id,fecha,hora) values(null,'"+id+"','"+con.fechas(fecha) +"','"+hora+"')");
      JOptionPane.showMessageDialog(rootPane, "Los datos han sido guardados correctamente");
                        
            }
            }
            catch(SQLException ex){
                
            }
            catch(java.lang.NullPointerException es){
                   con.agregar("insert into citas (citas,id,fecha,hora) values(null,'"+id+"','"+con.fechas(fecha) +"','"+hora+"')");
      JOptionPane.showMessageDialog(rootPane, "Los datos han sido guardados correctamente");
               
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"La fecha no es valida");
        }}else{
            JOptionPane.showMessageDialog(rootPane, "El campo de fecha es obligatorio ");
        }
    }//GEN-LAST:event_aceptbtnActionPerformed

    private void buscbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscbtnActionPerformed
     if(citaschooser.getDate()!=null){   conectar con=new conectar();
        Date fecha=citaschooser.getDate();
        if(con.diferenciasDeFechas(con.fecha(), fecha)>=0){
            citas2 ci=new citas2(con.fechas(fecha));
            ci.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"la fecha no es valida");
        }}else{
            JOptionPane.showMessageDialog(rootPane, "El campo de fecha es obligatorio ");
        }
    }//GEN-LAST:event_buscbtnActionPerformed

    private void cambbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambbtnActionPerformed
if(fechachooser.getDate()!=null){ conectar con=new conectar();
        Date fecha=fechachooser.getDate();
        int ihora=horalist.getSelectedIndex();
        String hora=" ",fe=con.fechas(fecha);
        
        switch(ihora){
           case 0:{hora="8:00";break;}
           case 1:{hora="9:00";break;}
           case 2:{hora="10:00";break;}
           case 3:{hora="11:00";break;}
           case 4:{hora="12:00";break;}
           case 5:{hora="1:00";break;}
           case 6:{hora="2:00";break;}
           case 7:{hora="3:00";break;}
           case 8:{hora="4:00";break;}
           case 9:{hora="5:00";break;}
           case 10:{hora="6:00";break;} }   
            
        if(con.diferenciasDeFechas(con.fecha(), fecha)>0){
            ResultSet resultado;
            resultado=con.buscar("select * from citas where fecha='"+con.fechas(fecha)+"' and hora='"+hora+"'");
            try{      
                
            if(resultado.next()){
                        JOptionPane.showMessageDialog(rootPane, "Esa hora ya esta ocupada");
                    }
            else{
                resultado=con.buscar("select * from citas where id='"+id+"'");
                try{if(resultado.next()){
                    resultado.last();
                    int n=resultado.getInt("id"),i=resultado.getInt("citas");
                    
                    con.modificar("update citas set fecha='"+con.fechas(fecha) +"' where id='"+n+"' and citas='"+i+"'");
                    con.modificar("update citas set hora='"+hora +"' where id='"+n+"'and citas='"+i+"'");
                   JOptionPane.showMessageDialog(rootPane, "La hora fue cambiada");
                }
                    
                }catch(SQLException ex){
                    
                }
                        
            }
            }
            catch(SQLException ex){
                
            }
            catch(java.lang.NullPointerException es){
               
               
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"La fecha no es valida");
        }    }else{
            JOptionPane.showMessageDialog(rootPane, "El campo de fecha es obligatorio ");
        }    
    }//GEN-LAST:event_cambbtnActionPerformed

    private void cancbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancbtnActionPerformed
if(fechachooser.getDate()!=null){
    int res = JOptionPane.showConfirmDialog(new JDialog(), "¿Estas seguro de que deseas cancelar la cita?", "", 0,3);

   if(res==0){

        conectar con = new conectar();
        ResultSet resultado;
        int ihora=horalist.getSelectedIndex();
        String hora=" ";
        
        switch(ihora){
           case 0:{hora="8:00";break;}
           case 1:{hora="9:00";break;}
           case 2:{hora="10:00";break;}
           case 3:{hora="11:00";break;}
           case 4:{hora="12:00";break;}
           case 5:{hora="1:00";break;}
           case 6:{hora="2:00";break;}
           case 7:{hora="3:00";break;}
           case 8:{hora="4:00";break;}
           case 9:{hora="5:00";break;}
           case 10:{hora="6:00";break;} }
        resultado=con.buscar("select * from citas where id= '"+id+"' and fecha='"+con.fechas(fechachooser.getDate()) +"' and hora='"+hora+"'");
        try{ if(resultado.next()){
            int citas=resultado.getInt("citas");
   con.eliminar("delete from citas where citas='"+citas+"'");
      
        JOptionPane.showMessageDialog(rootPane,"La cita ha sido cancelada");
        
        }else{
            JOptionPane.showMessageDialog(rootPane, "El cliente no tiene cita en esa fecha y/o en esa hora ");
        }}
   catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "El cliente no tiene cita en esa fecha y/o en esa hora ");

            }
   }}else{
            JOptionPane.showMessageDialog(rootPane, "El campo de fecha es obligatorio ");
        }
    }//GEN-LAST:event_cancbtnActionPerformed

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
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                int a=0;
                new citas(a).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptbtn;
    private javax.swing.JButton buscbtn;
    private javax.swing.JButton cambbtn;
    private javax.swing.JButton cancbtn;
    private com.toedter.calendar.JDateChooser citaschooser;
    private javax.swing.JLabel clientelbl;
    private com.toedter.calendar.JDateChooser fechachooser;
    private javax.swing.JComboBox horalist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}